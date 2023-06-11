import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FraseCollector {
    public String collect (int j) throws IOException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= j; i++) {
            System.out.println("Enter your frase #"+i);
            String frase = scanner.nextLine();
            FileWriter writer = new FileWriter("src/resources/folder"+i+"/file"+i);
            writer.write(frase);
            writer.flush();
            writer.close();
        }
        scanner.close();
        return "Thank you\n";
    }
}
