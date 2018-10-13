import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 13/10/2018.
 */
public class ThrowingErrorListenerTest {
    @Test
    public void syntaxError() throws Exception {
        ThrowingErrorListener throwingErrorListener = new ThrowingErrorListener();
        KotlinIRParser kotlinIRParser = new KotlinIRParser("crashTestIn.txt", "testOut.txt");
        kotlinIRParser.run();
        String testResult = "";
        try {
            Scanner in = new Scanner(new File("testOut.txt"));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertTrue(testResult.contains("no viable alternative at input"));
    }
}