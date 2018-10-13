import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 13/10/2018.
 */
public class KotlinIRParserTest {
    String inFile = "testIn.txt";
    String outFile = "testOut.txt";
    @Test
    public void run() throws Exception {
        KotlinIRParser kotlinIRParser = new KotlinIRParser(inFile, outFile);
        kotlinIRParser.run();
        String testResult = "";
        try {
            Scanner in = new Scanner(new File(outFile));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(testString, testResult);
    }

    @Test
    public void negativeTestRun() throws Exception {
        KotlinIRParser kotlinIRParser = new KotlinIRParser(inFile, outFile);
        kotlinIRParser.run();
        String testResult = "";
        try {
            Scanner in = new Scanner(new File(outFile));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotEquals("NegativeTestString", testResult);
    }

    @Test
    public void crashTestRun() throws Exception {
        KotlinIRParser kotlinIRParser = new KotlinIRParser("crashTestIn.txt", outFile);
        kotlinIRParser.run();
        String testResult = "";
        try {
            Scanner in = new Scanner(new File(outFile));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotEquals("NegativeTestString", testResult);
    }

    @Test
    public void crashTest2Run() throws Exception {
        KotlinIRParser kotlinIRParser = new KotlinIRParser("crashTest2.txt", outFile);
        kotlinIRParser.run();
        String testResult = "";
        try {
            Scanner in = new Scanner(new File(outFile));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotEquals("NegativeTestString", testResult);
    }

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
            "                                              \"Value\": \"Array\"\n" +
            "                                            }\n" +
            "                                          ]\n" +
            "                                        },\n" +
            "                                        {\n" +
            "                                          \"TypeArguments\": [\n" +
            "                                            {\n" +
            "                                              \"type\": 43,\n" +
            "                                              \"Value\": \"\\u003c\"\n" +
            "                                            },\n" +
            "                                            {\n" +
            "                                              \"TypeProjection\": [\n" +
            "                                                {\n" +
            "                                                  \"Type\": [\n" +
            "                                                    {\n" +
            "                                                      \"TypeReference\": [\n" +
            "                                                        {\n" +
            "                                                          \"UserType\": [\n" +
            "                                                            {\n" +
            "                                                              \"SimpleUserType\": [\n" +
            "                                                                {\n" +
            "                                                                  \"SimpleIdentifier\": [\n" +
            "                                                                    {\n" +
            "                                                                      \"type\": 140,\n" +
            "                                                                      \"Value\": \"String\"\n" +
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
            "                                            },\n" +
            "                                            {\n" +
            "                                              \"type\": 44,\n" +
            "                                              \"Value\": \"\\u003e\"\n" +
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
            "                      \"type\": 5,\n" +
            "                      \"Value\": \"\\n\"\n" +
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
            "                                                                                  \"CallExpression\": [\n" +
            "                                                                                    {\n" +
            "                                                                                      \"AssignableExpression\": [\n" +
            "                                                                                        {\n" +
            "                                                                                          \"PrimaryExpression\": [\n" +
            "                                                                                            {\n" +
            "                                                                                              \"SimpleIdentifier\": [\n" +
            "                                                                                                {\n" +
            "                                                                                                  \"type\": 140,\n" +
            "                                                                                                  \"Value\": \"println\"\n" +
            "                                                                                                }\n" +
            "                                                                                              ]\n" +
            "                                                                                            }\n" +
            "                                                                                          ]\n" +
            "                                                                                        }\n" +
            "                                                                                      ]\n" +
            "                                                                                    },\n" +
            "                                                                                    {\n" +
            "                                                                                      \"ValueArguments\": [\n" +
            "                                                                                        {\n" +
            "                                                                                          \"type\": 9,\n" +
            "                                                                                          \"Value\": \"(\"\n" +
            "                                                                                        },\n" +
            "                                                                                        {\n" +
            "                                                                                          \"ValueArgument\": [\n" +
            "                                                                                            {\n" +
            "                                                                                              \"Expression\": [\n" +
            "                                                                                                {\n" +
            "                                                                                                  \"Disjunction\": [\n" +
            "                                                                                                    {\n" +
            "                                                                                                      \"Conjunction\": [\n" +
            "                                                                                                        {\n" +
            "                                                                                                          \"Equality\": [\n" +
            "                                                                                                            {\n" +
            "                                                                                                              \"Comparison\": [\n" +
            "                                                                                                                {\n" +
            "                                                                                                                  \"InfixOperation\": [\n" +
            "                                                                                                                    {\n" +
            "                                                                                                                      \"ElvisExpression\": [\n" +
            "                                                                                                                        {\n" +
            "                                                                                                                          \"InfixFunctionCall\": [\n" +
            "                                                                                                                            {\n" +
            "                                                                                                                              \"RangeExpression\": [\n" +
            "                                                                                                                                {\n" +
            "                                                                                                                                  \"AdditiveExpression\": [\n" +
            "                                                                                                                                    {\n" +
            "                                                                                                                                      \"MultiplicativeExpression\": [\n" +
            "                                                                                                                                        {\n" +
            "                                                                                                                                          \"AsExpression\": [\n" +
            "                                                                                                                                            {\n" +
            "                                                                                                                                              \"PrefixUnaryExpression\": [\n" +
            "                                                                                                                                                {\n" +
            "                                                                                                                                                  \"PostfixUnaryExpression\": [\n" +
            "                                                                                                                                                    {\n" +
            "                                                                                                                                                      \"AssignableExpression\": [\n" +
            "                                                                                                                                                        {\n" +
            "                                                                                                                                                          \"PrimaryExpression\": [\n" +
            "                                                                                                                                                            {\n" +
            "                                                                                                                                                              \"StringLiteral\": [\n" +
            "                                                                                                                                                                {\n" +
            "                                                                                                                                                                  \"LineStringLiteral\": [\n" +
            "                                                                                                                                                                    {\n" +
            "                                                                                                                                                                      \"type\": 129,\n" +
            "                                                                                                                                                                      \"Value\": \"\\\"\"\n" +
            "                                                                                                                                                                    },\n" +
            "                                                                                                                                                                    {\n" +
            "                                                                                                                                                                      \"LineStringContent\": [\n" +
            "                                                                                                                                                                        {\n" +
            "                                                                                                                                                                          \"type\": 157,\n" +
            "                                                                                                                                                                          \"Value\": \"Hello!\"\n" +
            "                                                                                                                                                                        }\n" +
            "                                                                                                                                                                      ]\n" +
            "                                                                                                                                                                    },\n" +
            "                                                                                                                                                                    {\n" +
            "                                                                                                                                                                      \"type\": 155,\n" +
            "                                                                                                                                                                      \"Value\": \"\\\"\"\n" +
            "                                                                                                                                                                    }\n" +
            "                                                                                                                                                                  ]\n" +
            "                                                                                                                                                                }\n" +
            "                                                                                                                                                              ]\n" +
            "                                                                                                                                                            }\n" +
            "                                                                                                                                                          ]\n" +
            "                                                                                                                                                        }\n" +
            "                                                                                                                                                      ]\n" +
            "                                                                                                                                                    }\n" +
            "                                                                                                                                                  ]\n" +
            "                                                                                                                                                }\n" +
            "                                                                                                                                              ]\n" +
            "                                                                                                                                            }\n" +
            "                                                                                                                                          ]\n" +
            "                                                                                                                                        }\n" +
            "                                                                                                                                      ]\n" +
            "                                                                                                                                    }\n" +
            "                                                                                                                                  ]\n" +
            "                                                                                                                                }\n" +
            "                                                                                                                              ]\n" +
            "                                                                                                                            }\n" +
            "                                                                                                                          ]\n" +
            "                                                                                                                        }\n" +
            "                                                                                                                      ]\n" +
            "                                                                                                                    }\n" +
            "                                                                                                                  ]\n" +
            "                                                                                                                }\n" +
            "                                                                                                              ]\n" +
            "                                                                                                            }\n" +
            "                                                                                                          ]\n" +
            "                                                                                                        }\n" +
            "                                                                                                      ]\n" +
            "                                                                                                    }\n" +
            "                                                                                                  ]\n" +
            "                                                                                                }\n" +
            "                                                                                              ]\n" +
            "                                                                                            }\n" +
            "                                                                                          ]\n" +
            "                                                                                        },\n" +
            "                                                                                        {\n" +
            "                                                                                          \"type\": 10,\n" +
            "                                                                                          \"Value\": \")\"\n" +
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
            "                      \"Semi\": [\n" +
            "                        {\n" +
            "                          \"type\": 5,\n" +
            "                          \"Value\": \"\\n\"\n" +
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
}