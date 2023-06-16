import java.io.*;
import java.nio.charset.StandardCharsets;

public class DemoExceptions {
    public static void DemoFNFE() throws FileNotFoundException {
        try {
//            Throw FileNotFoundException
            FileInputStream fis = new FileInputStream("./files/notExistFile.txt");
        }
        catch (FileNotFoundException ex) {
            throw new FileNotFoundException("Khong tim thay file");
        }
    }

    public static void DemoUSEE() throws UnsupportedEncodingException {
        try {
//            Throw UnsupportedEncodingException
            String str = "Hello GMO";
            byte[] bytes = str.getBytes("UTF");
        }
        catch (UnsupportedEncodingException ex) {
            throw new UnsupportedEncodingException("Khong ho tro bang ma");
        }
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
//        Comment line 28 to show UnsupportedEncodingException case
        DemoFNFE();
        DemoUSEE();
    }
}
