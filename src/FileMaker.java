import java.io.File;
import java.io.IOException;

public class FileMaker {
    public void makefile (int i){
        for (int j = 2; j <= i; j=j+2) {
            String nameOfDir = "folder";
            String nameOfFile = "file";
            nameOfDir += j;
            nameOfFile += j;
            File file = new File("src/resources/"+nameOfDir+"/"+nameOfFile);
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
