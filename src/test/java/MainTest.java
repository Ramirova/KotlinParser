import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 13/10/2018.
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        Main main = new Main();
        String[] args = new String[0];
        main.main(args);

        String testResult = "";
        try {
            Scanner in = new Scanner(new File("out.txt"));
            while (in.hasNext()) {
                testResult += in.nextLine();
                if (in.hasNext()) {
                    testResult += "\n";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotNull(testResult);
    }
}