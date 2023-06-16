import java.io.*;

public class IOSerialization {
    public static class Cat implements Serializable {
        public String name;
        public int age;
        transient public double weight;

        Cat(String name, int age, double weight) {
            super();
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Write object into file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./files/serialization.dat"));
        Cat cat = new Cat("Meo", 1, 1.8);
        oos.writeObject(cat);;
        oos.close();
//        Read object from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./files/serialization.dat"));
        Cat readCat = (Cat) ois.readObject();
        System.out.println("Name: " + readCat.name);
        System.out.println("Age: " + readCat.age);
        System.out.println("Weight (trainsient): " + readCat.weight);
    }
}
