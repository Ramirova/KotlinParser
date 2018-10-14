import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        KotlinIRParser parser = new KotlinIRParser("in.txt", "out.txt");
        parser.run();
    }
}


