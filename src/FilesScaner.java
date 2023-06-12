import java.io.*;
import java.util.ArrayList;

public class FilesScaner {
    public void scan () throws IOException {
        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> fileList = new ArrayList<>();
        File folder = new File("src/resources/");

        // сканируем все директории в папке resources и закидываем их пути в list
        for (File file : folder.listFiles())
            {
            if(file.isDirectory()){
                list.add("src/resources/"+file.getName()+"/");
//                System.out.println(file.getName());
            }
        }
        // сканируем все файлы во всех директориях из списка list и закидываем их пути в fileList
        for (int i = 0; i < list.size(); i++) {
            File folders = new File(list.get(i)+"/");
            for (File files : folders.listFiles())
            {
                if(files.isFile()){
                    fileList.add(list.get(i)+files.getName());
                }
            }
        }
        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }
        // пробегаем по списку fileList читаем каждый файл и выводим в консоль
        for (int i = 0; i < fileList.size(); i++) {

            BufferedReader br = new BufferedReader(new FileReader(fileList.get(i)));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
    }
}
