using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MongoDB.Bson;
using MongoDB.Driver;
using ODataSimpleFilterImplementation.MongoDB;
using System;
using System.Diagnostics;

namespace ConsoleApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = "(Name eq 'Ricardo Alcantara' and Age eq 30) or (Name eq 'camila' and Age eq 34) or startswith(Name, 'Ricardo')";
            int interation = 100_000;

            Console.WriteLine("Press enter to start");
            Console.ReadLine();
            var watch = Stopwatch.StartNew();
            for (int i = 0; i < interation; i++)
            {
                var filter = Builders<User>.Filter.FilterString(input);
            }
            watch.Stop();

            Console.WriteLine($"Total of {interation} interation {watch.ElapsedMilliseconds}ms");

            var client = new MongoClient("mongodb://localhost:27017");
            client.DropDatabase("sampledb");
            var database = client.GetDatabase("sampledb");

            var collection = database.GetCollection<User>("test");

            collection.InsertOne(new User { Name = "Ricardo Alcantara", Age = 30 });
            collection.InsertOne(new User { Name = "Luiza Almeida", Age = 34 });
            collection.InsertOne(new User { Name = "Jorge Tavares", Age = 27 });
            collection.InsertOne(new User { Name = "Lucia Menes", Age = 24 });
            collection.InsertOne(new User { Name = null, Age = 24 });

            Console.WriteLine("Filter=");
            input = Console.ReadLine();

            while (!string.IsNullOrWhiteSpace(input))
            {
                try
                {
                    var filter = Builders<User>.Filter.FilterString(input);
                    var result = collection.Find(filter);
                    Console.WriteLine(result);

                    foreach (var user in result.ToList())
                    {
                        Console.WriteLine($"{user.Name} - {user.Age}");
                    }
                } catch(Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }                

                Console.WriteLine("Filter=");
                input = Console.ReadLine();
            }
        }

        public class User
        {
            public ObjectId Id { get; set; }
            public string Name { get; set; }
            public int Age { get; set; }
        }
    }
}
