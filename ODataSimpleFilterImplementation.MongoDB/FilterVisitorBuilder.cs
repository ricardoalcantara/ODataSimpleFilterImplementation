using Antlr4.Runtime.Misc;
using MongoDB.Bson;
using MongoDB.Driver;
using System;

namespace ODataSimpleFilterImplementation.MongoDB
{
    public class FilterVisitorBuilder<T> : FilterBaseVisitor<FilterDefinition<T>>
    {
        private FilterDefinitionBuilder<T> _builder;

        public FilterVisitorBuilder()
        {
            _builder = Builders<T>.Filter;
        }

        public override FilterDefinition<T> VisitStringOp([NotNull] FilterParser.StringOpContext context)
        {
            string id = context.ID().GetText();
            string str = (context.STRING() ?? context.EMPTY()).GetText().Trim('\'');

            var op = context.op.Type;
            switch (op)
            {
                case FilterParser.EQ:
                    return _builder.Eq(id, str);
                case FilterParser.NE:
                    return _builder.Ne(id, str);
                default:
                    throw new InvalidOperationException($"Invalid StringOp {context.GetText()}");
            }
        }

        public override FilterDefinition<T> VisitIntOp([NotNull] FilterParser.IntOpContext context)
        {
            string id = context.ID().GetText();
            string integer = context.INT().GetText();

            var op = context.op.Type;
            switch (op)
            {
                case FilterParser.EQ:
                    return _builder.Eq(id, integer);
                case FilterParser.NE:
                    return _builder.Ne(id, integer);
                case FilterParser.GT:
                    return _builder.Gt(id, integer);
                case FilterParser.GE:
                    return _builder.Gte(id, integer);
                case FilterParser.LT:
                    return _builder.Lt(id, integer);
                case FilterParser.LE:
                    return _builder.Lte(id, integer);
                default:
                    throw new InvalidOperationException($"Invalid StringOp {context.GetText()}");
            }
        }

        public override FilterDefinition<T> VisitFuncOp([NotNull] FilterParser.FuncOpContext context)
        {
            string id = context.ID().GetText();
            string str = context.STRING().GetText().Trim('\''); ;

            var func = context.func.Type;
            switch (func)
            {
                case FilterParser.STARTSWITH:
                    return _builder.Regex(id, new BsonRegularExpression($"^{str}", "i"));
                case FilterParser.ENDSWITH:
                    return _builder.Regex(id, new BsonRegularExpression($"{str}$", "i"));
                case FilterParser.SUBSTRINGOF:
                    return _builder.Regex(id, new BsonRegularExpression($"{str}", "i"));
                default:
                    throw new InvalidOperationException($"Invalid StringOp {context.GetText()}");
            }
        }

        public override FilterDefinition<T> VisitIsNull([NotNull] FilterParser.IsNullContext context)
        {
            string id = context.ID().GetText();

            var op = context.op.Type;
            switch (op)
            {
                case FilterParser.EQ:
                    return _builder.Eq<string>(id, null);
                case FilterParser.NE:
                    return _builder.Ne<string>(id, null);
                default:
                    throw new InvalidOperationException($"Invalid StringOp {context.GetText()}");
            }
        }

        public override FilterDefinition<T> VisitAnd([NotNull] FilterParser.AndContext context)
        {
            var left = Visit(context.expr(0));
            var right = Visit(context.expr(1));
            return left & right;
        }

        public override FilterDefinition<T> VisitOr([NotNull] FilterParser.OrContext context)
        {
            var left = Visit(context.expr(0));
            var right = Visit(context.expr(1));
            return left | right;
        }

        public override FilterDefinition<T> VisitParens([NotNull] FilterParser.ParensContext context)
        {
            return Visit(context.expr());
        }
    }
}
