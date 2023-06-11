
import java.io.File;
import java.io.IOException;

public class Main {
    static int countOfFraze = 8;
    public static void main(String[] args) throws IOException {
        DirMaker dirMaker = new DirMaker();
        dirMaker.makedir(countOfFraze);
        FileMaker fileMaker = new FileMaker();
        fileMaker.makefile(countOfFraze);
        FraseCollector fraseCollector = new FraseCollector();
        System.out.println(fraseCollector.collect(countOfFraze));
        FilesScaner filesScaner = new FilesScaner();
        filesScaner.scan();
    }
}
