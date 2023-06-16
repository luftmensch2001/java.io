import java.io.*;

public class IOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./files/input.txt");
        FileOutputStream fos = new FileOutputStream("./files/output.txt");
//        Reading file using FileInputStream
        while (true) {
            int i = fis.read();
            if (i == -1) break;
            System.out.print((char) i);
        }
        fis.close();
        System.out.println("\n---------------------------");
//        Writing file using FileOutputStream
        String message = "Hello Java Team";
        byte[] b = message.getBytes();
        fos.write(b);
//        BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./files/output.txt"));
//        Reading file using BufferedInputStream
        while (true) {
            int i = bis.read();
            if (i == -1) break;
            System.out.print((char) i);
        }
        bis.close();
        System.out.println("\n---------------------------");
//        Writing file using BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./files/output2.txt"));
        message = "Hello GMO";
        b = message.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
    }
}
