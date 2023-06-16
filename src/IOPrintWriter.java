import java.io.*;
public class IOPrintWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./files/printOutput.txt");
        PrintWriter print = new PrintWriter(fos);
        print.println("Print and go to next line");
        print.print("Print and stay this line");
        print.append("append some text");
        print.flush();
        print.close();
        fos.close();
    }
}
