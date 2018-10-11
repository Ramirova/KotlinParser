import antlr4.KotlinLexer;
import antlr4.KotlinParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String sampleCode = "fun main(args: Array<String>) { return }";
        KotlinLexer KotlinLexer = new KotlinLexer(CharStreams.fromFileName("in.txt"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(KotlinLexer);
        KotlinParser kotlinParser = new KotlinParser(commonTokenStream);

        ParseTree tree = kotlinParser.kotlinFile();

        writeFile(JsonHandler.toJson(tree));
    }

//    /**
//     * Method for reading string from input.txt
//     * @return linked list of strings
//     */
//    static LinkedList<String> readFile() {
//        LinkedList<String> result = new LinkedList<>();
//        try {
//            Scanner in = new Scanner(new File("in.txt"));
//            while (in.hasNext())
//                result.add(in.nextLine());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return result;
//    }

    /**
     * Method for writing output to output.txt
     */
    static void writeFile(String output) {
        try (final FileWriter writer = new FileWriter("out.txt", false)) {
            writer.write(output);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
