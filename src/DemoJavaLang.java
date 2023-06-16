import java.lang.*;
public class DemoJavaLang {
    public static void main(String[] args) {
//        String
        String string = new String("Hello");
        System.out.println("Create a new String: " + string);
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Char at index 4: " + string.charAt(4));
//        StringBuffer & StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Runsystem");
        System.out.println("Create a new StringBuilder: " + stringBuilder);
        stringBuilder.append("123");
        System.out.println("Append 123: " + stringBuilder);
        System.out.println("Capacity: " + stringBuilder.capacity());
        stringBuilder.insert(0, "GMO");
        System.out.println("Insert GMO: " + stringBuilder);
        stringBuilder.replace(0,3, "GMOZ.com");
        System.out.println("Replace: " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("Reverse: " + stringBuilder);
    }
}
