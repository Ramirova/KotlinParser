import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import java.util.*;

public class JsonHandler {

    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
//    private static final HashMap<Integer, String> tokens = readFile();

    static String toJson(ParseTree tree) {
        return PRETTY_PRINT_GSON.toJson(toMap(tree));
    }
    private static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    private static void traverse(ParseTree tree, Map<String, Object> map) {

        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", token.getType());
            map.put("Value", token.getText());
        } else {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
            map.put(name, children);

            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                traverse(tree.getChild(i), nested);
            }
        }
    }

//    /**
//            * Method for reading string from input.txt
//     * @return linked list of strings
//     */
//    static HashMap<Integer, String> readFile() {
//        HashMap<Integer, String> result = new HashMap<>();
//        try {
//            Scanner in = new Scanner(new File("/Users/nicholas/IdeaProjects/KotlinParser/gen/antlr4/KotlinParser.tokens"));
//            while (in.hasNextLine()) {
//                String line = in.nextLine();
//                int eqPos = line.lastIndexOf("=");
//                result.put(Integer.parseInt(line.substring(eqPos+1)), line.substring(0, eqPos));
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return result;
//    }
}


