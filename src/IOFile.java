import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class IOFile {
    public static void main(String[] args) throws IOException {
//        Init
        File file = new File("./files/myFile.txt");
//        Create new File
        file.createNewFile();
//        Get info of file
        System.out.println("File name: " + file.getName());
        System.out.println("File abosolute path: " + file.getAbsolutePath());
        System.out.println("File parent: " + file.getParent());
        System.out.println("Can read : " + file.canRead());
        System.out.println("Is directory : " + file.isDirectory());
//        Create new folder
        File folder = new File("./myFolder");
        folder.mkdir();
        System.out.println("---------------------");
//        List files
        folder = new File("./files");
        String[] fileArray = folder.list();
        for (int i = 0; i<fileArray.length; i++) {
            System.out.println(fileArray[i]);
        }
    }
}
