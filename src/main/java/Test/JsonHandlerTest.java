import antlr4.KotlinLexer;
import antlr4.KotlinParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 11/10/2018.
 */
public class JsonHandlerTest {
    String negativeTest = "wrong result";

    String testString = "{\n" +
            "  \"KotlinFile\": [\n" +
            "    {\n" +
            "      \"PackageHeader\": []\n" +
            "    },\n" +
            "    {\n" +
            "      \"ImportList\": []\n" +
            "    },\n" +
            "    {\n" +
            "      \"TopLevelObject\": [\n" +
            "        {\n" +
            "          \"FunctionDeclaration\": [\n" +
            "            {\n" +
            "              \"type\": 61,\n" +
            "              \"Value\": \"fun\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"Identifier\": [\n" +
            "                {\n" +
            "                  \"SimpleIdentifier\": [\n" +
            "                    {\n" +
            "                      \"type\": 140,\n" +
            "                      \"Value\": \"main\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"FunctionValueParameters\": [\n" +
            "                {\n" +
            "                  \"type\": 9,\n" +
            "                  \"Value\": \"(\"\n" +
            "                },\n" +
            "                {\n" +
            "                  \"FunctionValueParameter\": [\n" +
            "                    {\n" +
            "                      \"Parameter\": [\n" +
            "                        {\n" +
            "                          \"SimpleIdentifier\": [\n" +
            "                            {\n" +
            "                              \"type\": 140,\n" +
            "                              \"Value\": \"args\"\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"type\": 25,\n" +
            "                          \"Value\": \":\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                          \"Type\": [\n" +
            "                            {\n" +
            "                              \"TypeReference\": [\n" +
            "                                {\n" +
            "                                  \"UserType\": [\n" +
            "                                    {\n" +
            "                                      \"SimpleUserType\": [\n" +
            "                                        {\n" +
            "                                          \"SimpleIdentifier\": [\n" +
            "                                            {\n" +
            "                                              \"type\": 140,\n" +
            "                                              \"Value\": \"String\"\n" +
            "                                            }\n" +
            "                                          ]\n" +
            "                                        }\n" +
            "                                      ]\n" +
            "                                    }\n" +
            "                                  ]\n" +
            "                                }\n" +
            "                              ]\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        }\n" +
            "                      ]\n" +
            "                    }\n" +
            "                  ]\n" +
            "                },\n" +
            "                {\n" +
            "                  \"type\": 10,\n" +
            "                  \"Value\": \")\"\n" +
            "                }\n" +
            "              ]\n" +
            "            },\n" +
            "            {\n" +
            "              \"FunctionBody\": [\n" +
            "                {\n" +
            "                  \"Block\": [\n" +
            "                    {\n" +
            "                      \"type\": 13,\n" +
            "                      \"Value\": \"{\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                      \"Statement\": [\n" +
            "                        {\n" +
            "                          \"Expression\": [\n" +
            "                            {\n" +
            "                              \"Disjunction\": [\n" +
            "                                {\n" +
            "                                  \"Conjunction\": [\n" +
            "                                    {\n" +
            "                                      \"Equality\": [\n" +
            "                                        {\n" +
            "                                          \"Comparison\": [\n" +
            "                                            {\n" +
            "                                              \"InfixOperation\": [\n" +
            "                                                {\n" +
            "                                                  \"ElvisExpression\": [\n" +
            "                                                    {\n" +
            "                                                      \"InfixFunctionCall\": [\n" +
            "                                                        {\n" +
            "                                                          \"RangeExpression\": [\n" +
            "                                                            {\n" +
            "                                                              \"AdditiveExpression\": [\n" +
            "                                                                {\n" +
            "                                                                  \"MultiplicativeExpression\": [\n" +
            "                                                                    {\n" +
            "                                                                      \"AsExpression\": [\n" +
            "                                                                        {\n" +
            "                                                                          \"PrefixUnaryExpression\": [\n" +
            "                                                                            {\n" +
            "                                                                              \"PostfixUnaryExpression\": [\n" +
            "                                                                                {\n" +
            "                                                                                  \"AssignableExpression\": [\n" +
            "                                                                                    {\n" +
            "                                                                                      \"PrimaryExpression\": [\n" +
            "                                                                                        {\n" +
            "                                                                                          \"JumpExpression\": [\n" +
            "                                                                                            {\n" +
            "                                                                                              \"type\": 84,\n" +
            "                                                                                              \"Value\": \"return\"\n" +
            "                                                                                            }\n" +
            "                                                                                          ]\n" +
            "                                                                                        }\n" +
            "                                                                                      ]\n" +
            "                                                                                    }\n" +
            "                                                                                  ]\n" +
            "                                                                                }\n" +
            "                                                                              ]\n" +
            "                                                                            }\n" +
            "                                                                          ]\n" +
            "                                                                        }\n" +
            "                                                                      ]\n" +
            "                                                                    }\n" +
            "                                                                  ]\n" +
            "                                                                }\n" +
            "                                                              ]\n" +
            "                                                            }\n" +
            "                                                          ]\n" +
            "                                                        }\n" +
            "                                                      ]\n" +
            "                                                    }\n" +
            "                                                  ]\n" +
            "                                                }\n" +
            "                                              ]\n" +
            "                                            }\n" +
            "                                          ]\n" +
            "                                        }\n" +
            "                                      ]\n" +
            "                                    }\n" +
            "                                  ]\n" +
            "                                }\n" +
            "                              ]\n" +
            "                            }\n" +
            "                          ]\n" +
            "                        }\n" +
            "                      ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                      \"type\": 14,\n" +
            "                      \"Value\": \"}\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              ]\n" +
            "            }\n" +
            "          ]\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": -1,\n" +
            "      \"Value\": \"\\u003cEOF\\u003e\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    @Test
    public void toJson() throws Exception {
        String sampleCode = "fun main(args: String) { return }";
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromString(sampleCode));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        ParseTree tree = kotlinParser.kotlinFile();

        JsonHandler jsonHandler = new JsonHandler();

        assertEquals(testString, jsonHandler.toJson(tree));
    }

    @Test
    public void negativeTestToJson() throws Exception {
        String sampleCode = "fun main(args: String) { return }";
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromString(sampleCode));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        ParseTree tree = kotlinParser.kotlinFile();

        JsonHandler jsonHandler = new JsonHandler();

        assertFalse(negativeTest.equals(jsonHandler.toJson(tree)));
    }
}