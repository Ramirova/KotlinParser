import antlr4.KotlinLexer;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 11/10/2018.
 */
public class KotlinLexerTest {

    String tokenNames = "[<INVALID>, ShebangLine, DelimitedComment, LineComment, WS, NL, '...', '.', ',', '(', RPAREN, '[', RSQUARE, '{', '}', '*', '%', '/', '+', '-', '++', '--', '&&', '||', '!', ':', ';', '=', '+=', '-=', '*=', '/=', '%=', '->', '=>', '..', '::', '?::', ';;', '#', '@', '?', '?:', '<', '>', '<=', '>=', '!=', '!==', 'as?', '==', '===', ''', RETURN_AT, CONTINUE_AT, BREAK_AT, '@file', 'package', 'import', 'class', 'interface', 'fun', 'object', 'val', 'var', 'typealias', 'constructor', 'by', 'companion', 'init', 'this', 'super', 'typeof', 'where', 'if', 'else', 'when', 'try', 'catch', 'finally', 'for', 'do', 'while', 'throw', 'return', 'continue', 'break', 'as', 'is', 'in', NOT_IS, NOT_IN, 'out', '@field', '@property', '@get', '@set', 'get', 'set', '@receiver', '@param', '@setparam', '@delegate', 'dynamic', 'public', 'private', 'protected', 'internal', 'enum', 'sealed', 'annotation', 'data', 'inner', 'tailrec', 'operator', 'inline', 'infix', 'external', 'suspend', 'override', 'abstract', 'final', 'open', 'const', 'lateinit', 'vararg', 'noinline', 'crossinline', 'reified', QUOTE_OPEN, '\"\"\"', RealLiteral, FloatLiteral, DoubleLiteral, LongLiteral, IntegerLiteral, HexLiteral, BinLiteral, BooleanLiteral, 'null', Identifier, LabelReference, LabelDefinition, FieldIdentifier, CharacterLiteral, UNICODE_CLASS_LL, UNICODE_CLASS_LM, UNICODE_CLASS_LO, UNICODE_CLASS_LT, UNICODE_CLASS_LU, UNICODE_CLASS_ND, UNICODE_CLASS_NL, Inside_Comment, Inside_WS, Inside_NL, QUOTE_CLOSE, LineStrRef, LineStrText, LineStrEscapedChar, LineStrExprStart, TRIPLE_QUOTE_CLOSE, MultiLineStringQuote, MultiLineStrRef, MultiLineStrText, MultiLineStrEscapedChar, MultiLineStrExprStart, MultiLineNL, StrExpr_IN, StrExpr_Comment, StrExpr_WS, StrExpr_NL]";
    @Test
    public void getTokenNames() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertEquals(tokenNames, Arrays.toString(kotlinLexer.getTokenNames()));
    }

    @Test
    public void getVocabulary() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertNotEquals(null, kotlinLexer.getVocabulary());
    }

    @Test
    public void getGrammarFileName() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertEquals("KotlinLexer.g4", kotlinLexer.getGrammarFileName());
    }

    String rules = "[ShebangLine, DelimitedComment, LineComment, WS, NL, RESERVED, DOT, COMMA, LPAREN, RPAREN, LSQUARE, RSQUARE, LCURL, RCURL, MULT, MOD, DIV, ADD, SUB, INCR, DECR, CONJ, DISJ, EXCL, COLON, SEMICOLON, ASSIGNMENT, ADD_ASSIGNMENT, SUB_ASSIGNMENT, MULT_ASSIGNMENT, DIV_ASSIGNMENT, MOD_ASSIGNMENT, ARROW, DOUBLE_ARROW, RANGE, COLONCOLON, Q_COLONCOLON, DOUBLE_SEMICOLON, HASH, AT, QUEST, ELVIS, LANGLE, RANGLE, LE, GE, EXCL_EQ, EXCL_EQEQ, AS_SAFE, EQEQ, EQEQEQ, SINGLE_QUOTE, RETURN_AT, CONTINUE_AT, BREAK_AT, FILE, PACKAGE, IMPORT, CLASS, INTERFACE, FUN, OBJECT, VAL, VAR, TYPE_ALIAS, CONSTRUCTOR, BY, COMPANION, INIT, THIS, SUPER, TYPEOF, WHERE, IF, ELSE, WHEN, TRY, CATCH, FINALLY, FOR, DO, WHILE, THROW, RETURN, CONTINUE, BREAK, AS, IS, IN, NOT_IS, NOT_IN, OUT, FIELD, PROPERTY, GET, SET, GETTER, SETTER, RECEIVER, PARAM, SETPARAM, DELEGATE, DYNAMIC, PUBLIC, PRIVATE, PROTECTED, INTERNAL, ENUM, SEALED, ANNOTATION, DATA, INNER, TAILREC, OPERATOR, INLINE, INFIX, EXTERNAL, SUSPEND, OVERRIDE, ABSTRACT, FINAL, OPEN, CONST, LATEINIT, VARARG, NOINLINE, CROSSINLINE, REIFIED, QUOTE_OPEN, TRIPLE_QUOTE_OPEN, RealLiteral, FloatLiteral, DoubleLiteral, LongLiteral, IntegerLiteral, DecDigit, DecDigitNoZero, UNICODE_CLASS_ND_NoZeros, HexLiteral, HexDigit, BinLiteral, BinDigit, BooleanLiteral, NullLiteral, Identifier, LabelReference, LabelDefinition, FieldIdentifier, CharacterLiteral, EscapeSeq, UniCharacterLiteral, EscapedIdentifier, Letter, UNICODE_CLASS_LL, UNICODE_CLASS_LM, UNICODE_CLASS_LO, UNICODE_CLASS_LT, UNICODE_CLASS_LU, UNICODE_CLASS_ND, UNICODE_CLASS_NL, Inside_RPAREN, Inside_RSQUARE, Inside_LPAREN, Inside_LSQUARE, Inside_LCURL, Inside_RCURL, Inside_DOT, Inside_COMMA, Inside_MULT, Inside_MOD, Inside_DIV, Inside_ADD, Inside_SUB, Inside_INCR, Inside_DECR, Inside_CONJ, Inside_DISJ, Inside_EXCL, Inside_COLON, Inside_SEMICOLON, Inside_ASSIGNMENT, Inside_ADD_ASSIGNMENT, Inside_SUB_ASSIGNMENT, Inside_MULT_ASSIGNMENT, Inside_DIV_ASSIGNMENT, Inside_MOD_ASSIGNMENT, Inside_ARROW, Inside_DOUBLE_ARROW, Inside_RANGE, Inside_RESERVED, Inside_COLONCOLON, Inside_Q_COLONCOLON, Inside_DOUBLE_SEMICOLON, Inside_HASH, Inside_AT, Inside_QUEST, Inside_ELVIS, Inside_LANGLE, Inside_RANGLE, Inside_LE, Inside_GE, Inside_EXCL_EQ, Inside_EXCL_EQEQ, Inside_NOT_IS, Inside_NOT_IN, Inside_AS_SAFE, Inside_EQEQ, Inside_EQEQEQ, Inside_SINGLE_QUOTE, Inside_QUOTE_OPEN, Inside_TRIPLE_QUOTE_OPEN, Inside_VAL, Inside_VAR, Inside_OBJECT, Inside_SUPER, Inside_IN, Inside_OUT, Inside_FIELD, Inside_FILE, Inside_PROPERTY, Inside_GET, Inside_SET, Inside_RECEIVER, Inside_PARAM, Inside_SETPARAM, Inside_DELEGATE, Inside_THROW, Inside_RETURN, Inside_CONTINUE, Inside_BREAK, Inside_RETURN_AT, Inside_CONTINUE_AT, Inside_BREAK_AT, Inside_IF, Inside_ELSE, Inside_WHEN, Inside_TRY, Inside_CATCH, Inside_FINALLY, Inside_FOR, Inside_DO, Inside_WHILE, Inside_PUBLIC, Inside_PRIVATE, Inside_PROTECTED, Inside_INTERNAL, Inside_ENUM, Inside_SEALED, Inside_ANNOTATION, Inside_DATA, Inside_INNER, Inside_TAILREC, Inside_OPERATOR, Inside_INLINE, Inside_INFIX, Inside_EXTERNAL, Inside_SUSPEND, Inside_OVERRIDE, Inside_ABSTRACT, Inside_FINAL, Inside_OPEN, Inside_CONST, Inside_LATEINIT, Inside_VARARG, Inside_NOINLINE, Inside_CROSSINLINE, Inside_REIFIED, Inside_BooleanLiteral, Inside_IntegerLiteral, Inside_HexLiteral, Inside_BinLiteral, Inside_CharacterLiteral, Inside_RealLiteral, Inside_NullLiteral, Inside_LongLiteral, Inside_Identifier, Inside_LabelReference, Inside_LabelDefinition, Inside_Comment, Inside_WS, Inside_NL, QUOTE_CLOSE, LineStrRef, LineStrText, LineStrEscapedChar, LineStrExprStart, TRIPLE_QUOTE_CLOSE, MultiLineStringQuote, MultiLineStrRef, MultiLineStrText, MultiLineStrEscapedChar, MultiLineStrExprStart, MultiLineNL, StrExpr_RCURL, StrExpr_LPAREN, StrExpr_LSQUARE, StrExpr_RPAREN, StrExpr_RSQUARE, StrExpr_LCURL, StrExpr_DOT, StrExpr_COMMA, StrExpr_MULT, StrExpr_MOD, StrExpr_DIV, StrExpr_ADD, StrExpr_SUB, StrExpr_INCR, StrExpr_DECR, StrExpr_CONJ, StrExpr_DISJ, StrExpr_EXCL, StrExpr_COLON, StrExpr_SEMICOLON, StrExpr_ASSIGNMENT, StrExpr_ADD_ASSIGNMENT, StrExpr_SUB_ASSIGNMENT, StrExpr_MULT_ASSIGNMENT, StrExpr_DIV_ASSIGNMENT, StrExpr_MOD_ASSIGNMENT, StrExpr_ARROW, StrExpr_DOUBLE_ARROW, StrExpr_RANGE, StrExpr_COLONCOLON, StrExpr_Q_COLONCOLON, StrExpr_DOUBLE_SEMICOLON, StrExpr_HASH, StrExpr_AT, StrExpr_QUEST, StrExpr_ELVIS, StrExpr_LANGLE, StrExpr_RANGLE, StrExpr_LE, StrExpr_GE, StrExpr_EXCL_EQ, StrExpr_EXCL_EQEQ, StrExpr_AS, StrExpr_IS, StrExpr_IN, StrExpr_NOT_IS, StrExpr_NOT_IN, StrExpr_AS_SAFE, StrExpr_EQEQ, StrExpr_EQEQEQ, StrExpr_SINGLE_QUOTE, StrExpr_QUOTE_OPEN, StrExpr_TRIPLE_QUOTE_OPEN, StrExpr_BooleanLiteral, StrExpr_IntegerLiteral, StrExpr_HexLiteral, StrExpr_BinLiteral, StrExpr_CharacterLiteral, StrExpr_RealLiteral, StrExpr_NullLiteral, StrExpr_LongLiteral, StrExpr_Identifier, StrExpr_LabelReference, StrExpr_LabelDefinition, StrExpr_Comment, StrExpr_WS, StrExpr_NL]";
    @Test
    public void getRuleNames() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertEquals(rules, Arrays.toString(kotlinLexer.getRuleNames()));
    }

    @Test
    public void getSerializedATN() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertNotEquals(null, kotlinLexer.getSerializedATN());
    }

    @Test
    public void getChannelNames() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertEquals("[DEFAULT_TOKEN_CHANNEL, HIDDEN]", Arrays.toString(kotlinLexer.getChannelNames()));
    }

    @Test
    public void getModeNames() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertEquals("[DEFAULT_MODE, Inside, LineString, MultiLineString, StringExpression]",
                Arrays.toString(kotlinLexer.getModeNames()));
    }

    @Test
    public void getATN() throws Exception {
        KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));
        assertNotEquals(null, kotlinLexer.getATN());
    }

}