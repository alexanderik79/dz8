import java.io.File;

public class DirMaker {
  public void makedir (int i){
      for (int j = 1; j <= i; j++) {
          String  nameOfDir = "folder";
          nameOfDir += j;
          File dir = new File("src/resources/"+nameOfDir);
          dir.mkdirs();
      }
  }
}
