import org.junit.Test;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by rozaliaamirova on 13/10/2018.
 */
public class IOUtilitiesTest {
    @Test
    public void positiveTestWriteFile() throws Exception {
        String test = "TestString";
        IOUtilities utilities = new IOUtilities();
        utilities.writeFile(test, "test.txt");

        String testResult = "";
        try {
            Scanner in = new Scanner(new File("test.txt"));
            while (in.hasNext())
                testResult += in.nextLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(test, testResult);
    }

    @Test
    public void negativeTestWriteFile() throws Exception {
        String test = "TestString";
        IOUtilities utilities = new IOUtilities();
        utilities.writeFile(test, "test.txt");

        String testResult = "";
        try {
            Scanner in = new Scanner(new File("test.txt"));
            while (in.hasNext())
                testResult += in.nextLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotEquals("NegativeTestString", testResult);
    }
}