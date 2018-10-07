import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rozaliaamirova on 05/10/2018.
 *
 *
 *
 * Taken from https://stackoverflow.com/questions/49116223/convert-antlr-parse-tree-to-json  !!!!!!!!!!
 *
 */
public class JsonHandler {

    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(ParseTree tree) {
        return PRETTY_PRINT_GSON.toJson(toMap(tree));
    }
    public static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    public static void traverse(ParseTree tree, Map<String, Object> map) {

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
}
