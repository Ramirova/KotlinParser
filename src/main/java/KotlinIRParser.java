import antlr4.KotlinLexer;
import antlr4.KotlinParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class KotlinIRParser {
    private String inputFile;
    private String outputFile;

    public KotlinIRParser(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    /**
     * This function runs all the logic for parsing source code. It glues together classes generated by antlr4
     * @throws IOException
     */
    public void run() throws IOException {
        try {
            //initialing lexer
            KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName(inputFile));
            kotlinLexer.removeErrorListeners();
            kotlinLexer.addErrorListener(ThrowingErrorListener.INSTANCE); //set our custom Error Listener

            //initialize token stream
            CommonTokenStream commonTokenStream = new CommonTokenStream(kotlinLexer);

            //initialing parser
            KotlinParser kotlinParser = new KotlinParser(commonTokenStream);
            kotlinParser.removeErrorListeners();
            kotlinParser.addErrorListener(ThrowingErrorListener.INSTANCE); //set our custom Error Listener

            //create the tree
            ParseTree tree = kotlinParser.kotlinFile();

            //parse the tree to JSON and save to the output file
            IOUtilities.writeFile(JsonHandler.toJson(tree), outputFile);
        } catch (ParseCancellationException ex){
            //in case an invalid syntax is encountered, write the explanation message to the output file
            IOUtilities.writeFile(ex.getMessage().replaceAll("\\\\n", "\n"), outputFile);
        }
    }

}
