
package bytestreams3;

import java.io.*;

public class Lab3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("data.dat");
        DataOutputStream output = new DataOutputStream(file);
        output.writeUTF("JIM Henry");
        output.writeInt(30);
        output.writeDouble(65.5);
        output.writeChar('A');
        
        FileInputStream file = new FileInputStream("data.dat");
        DataInputStream input = new DataInputStream(file);
        int age = input.readInt();
        double height = input.readDouble();
        
        System.out.println(input.readUTF());
        System.out.println(age);
        System.out.println(height);
        System.out.println(input.readChar());
    }
}
