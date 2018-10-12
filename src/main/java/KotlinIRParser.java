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

    public void run() throws IOException {
        try {
            KotlinLexer kotlinLexer = new KotlinLexer(CharStreams.fromFileName(inputFile));
            kotlinLexer.removeErrorListeners();
            kotlinLexer.addErrorListener(ThrowingErrorListener.INSTANCE);


            CommonTokenStream commonTokenStream = new CommonTokenStream(kotlinLexer);
            KotlinParser kotlinParser = new KotlinParser(commonTokenStream);
            kotlinParser.removeErrorListeners();
            kotlinParser.addErrorListener(ThrowingErrorListener.INSTANCE);

            ParseTree tree = kotlinParser.kotlinFile();

            IOUtilities.writeFile(JsonHandler.toJson(tree), outputFile);
        } catch (ParseCancellationException ex){
            IOUtilities.writeFile(ex.getMessage().replaceAll("\\\\n", "\n"), outputFile);
        }
    }

}
