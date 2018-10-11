import antlr4.KotlinLexer;
import antlr4.KotlinParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 11/10/2018.
 */
public class KotlinParserTest {

    @Test
    public void parsing() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        ParseTree tree = kotlinParser.kotlinFile();
        assertNotEquals(null, tree);
    }

    String tokenNames = "[<INVALID>, ShebangLine, DelimitedComment, LineComment, WS, NL, '...', '.', ',', '(', RPAREN, '[', RSQUARE, '{', '}', '*', '%', '/', '+', '-', '++', '--', '&&', '||', '!', ':', ';', '=', '+=', '-=', '*=', '/=', '%=', '->', '=>', '..', '::', '?::', ';;', '#', '@', '?', '?:', '<', '>', '<=', '>=', '!=', '!==', 'as?', '==', '===', ''', RETURN_AT, CONTINUE_AT, BREAK_AT, '@file', 'package', 'import', 'class', 'interface', 'fun', 'object', 'val', 'var', 'typealias', 'constructor', 'by', 'companion', 'init', 'this', 'super', 'typeof', 'where', 'if', 'else', 'when', 'try', 'catch', 'finally', 'for', 'do', 'while', 'throw', 'return', 'continue', 'break', 'as', 'is', 'in', NOT_IS, NOT_IN, 'out', '@field', '@property', '@get', '@set', 'get', 'set', '@receiver', '@param', '@setparam', '@delegate', 'dynamic', 'public', 'private', 'protected', 'internal', 'enum', 'sealed', 'annotation', 'data', 'inner', 'tailrec', 'operator', 'inline', 'infix', 'external', 'suspend', 'override', 'abstract', 'final', 'open', 'const', 'lateinit', 'vararg', 'noinline', 'crossinline', 'reified', QUOTE_OPEN, '\"\"\"', RealLiteral, FloatLiteral, DoubleLiteral, LongLiteral, IntegerLiteral, HexLiteral, BinLiteral, BooleanLiteral, 'null', Identifier, LabelReference, LabelDefinition, FieldIdentifier, CharacterLiteral, UNICODE_CLASS_LL, UNICODE_CLASS_LM, UNICODE_CLASS_LO, UNICODE_CLASS_LT, UNICODE_CLASS_LU, UNICODE_CLASS_ND, UNICODE_CLASS_NL, Inside_Comment, Inside_WS, Inside_NL, QUOTE_CLOSE, LineStrRef, LineStrText, LineStrEscapedChar, LineStrExprStart, TRIPLE_QUOTE_CLOSE, MultiLineStringQuote, MultiLineStrRef, MultiLineStrText, MultiLineStrEscapedChar, MultiLineStrExprStart, MultiLineNL, StrExpr_IN, StrExpr_Comment, StrExpr_WS, StrExpr_NL]";
    @Test
    public void getTokenNames() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        assertEquals(tokenNames, Arrays.toString(kotlinParser.getTokenNames()));
    }

    @Test
    public void getVocabulary() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        assertNotEquals(null, kotlinParser.getVocabulary());
    }

    @Test
    public void getGrammarFileName() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        assertEquals("KotlinParser.g4", kotlinParser.getGrammarFileName());
    }

    String ruleNames = "[kotlinFile, script, fileAnnotation, packageHeader, importList, importHeader, importAlias, topLevelObject, classDeclaration, primaryConstructor, classParameters, classParameter, delegationSpecifiers, delegationSpecifier, constructorInvocation, explicitDelegation, classBody, classMemberDeclaration, anonymousInitializer, secondaryConstructor, constructorDelegationCall, enumClassBody, enumEntries, enumEntry, functionDeclaration, functionValueParameters, functionValueParameter, parameter, functionBody, objectDeclaration, companionObject, propertyDeclaration, multiVariableDeclaration, variableDeclaration, getter, setter, typeAlias, typeParameters, typeParameter, type, typeModifierList, parenthesizedType, nullableType, typeReference, functionType, functionTypeReceiver, userType, simpleUserType, functionTypeParameters, typeConstraints, typeConstraint, block, statements, statement, declaration, assignment, expression, disjunction, conjunction, equality, comparison, infixOperation, elvisExpression, infixFunctionCall, rangeExpression, additiveExpression, multiplicativeExpression, asExpression, asExpressionTail, prefixUnaryExpression, postfixUnaryExpression, callExpression, labeledExpression, dotQualifiedExpression, assignableExpression, indexingExpression, callSuffix, annotatedLambda, arrayAccess, valueArguments, typeArguments, typeProjection, typeProjectionModifierList, valueArgument, primaryExpression, parenthesizedExpression, literalConstant, stringLiteral, lineStringLiteral, multiLineStringLiteral, lineStringContent, lineStringExpression, multiLineStringContent, multiLineStringExpression, functionLiteral, lambdaParameters, lambdaParameter, objectLiteral, collectionLiteral, thisExpression, superExpression, conditionalExpression, ifExpression, controlStructureBody, whenExpression, whenEntry, whenCondition, rangeTest, typeTest, tryExpression, catchBlock, finallyBlock, loopExpression, forExpression, whileExpression, doWhileExpression, jumpExpression, callableReference, assignmentOperator, equalityOperator, comparisonOperator, inOperator, isOperator, additiveOperator, multiplicativeOperator, asOperator, prefixUnaryOperator, postfixUnaryOperator, memberAccessOperator, modifierList, modifier, classModifier, memberModifier, visibilityModifier, varianceAnnotation, functionModifier, propertyModifier, inheritanceModifier, parameterModifier, typeParameterModifier, labelDefinition, annotations, annotation, annotationList, annotationUseSiteTarget, unescapedAnnotation, identifier, simpleIdentifier, semi]";
    @Test
    public void getRuleNames() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        System.out.println(Arrays.toString(kotlinParser.getRuleNames()));
        assertEquals(ruleNames, Arrays.toString(kotlinParser.getRuleNames()));
    }

    @Test
    public void getSerializedATN() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        assertNotEquals(null, kotlinParser.getSerializedATN());
    }

    @Test
    public void getATN() throws Exception {
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        assertNotEquals(null, kotlinParser.getATN());
    }

}