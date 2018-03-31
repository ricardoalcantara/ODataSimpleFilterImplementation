using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Text;

namespace ODataSimpleFilterImplementation.MongoDB
{
    public static class FilterDefinitionBuilderExtensions
    {
        public static FilterDefinition<T> FilterString<T>(this FilterDefinitionBuilder<T> _bulder, string input)
        {
            ICharStream stream = CharStreams.fromstring(input);
            ITokenSource lexer = new FilterLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            FilterParser parser = new FilterParser(tokens);
            parser.BuildParseTree = true;
            IParseTree tree = parser.filter();

            var filter = new FilterVisitorBuilder<T>();
            return filter.Visit(tree);
        }
    }
}
