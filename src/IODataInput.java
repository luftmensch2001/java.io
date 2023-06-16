import java.io.*;
public class IODataInput {
    public static void main(String[] args) throws IOException {
//        Reading file with DataInputStream
        FileInputStream fis = new FileInputStream("./files/input.txt");
        DataInputStream dis = new DataInputStream(fis);
        int capacity = dis.available();
        byte[] b = new byte[capacity];
//        Read file and store into b array
        dis.read(b);
        for (byte i : b) {
            System.out.println((char) i);
        }
    }
}
