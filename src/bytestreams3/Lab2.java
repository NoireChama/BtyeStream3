
package bytestreams3;

import java.io.*;

public class Lab2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream output = new FileOutputStream("data.dat");
        String s = "Hello World";
        byte[] b = s.getBytes();
        output.write(b);
        FileInputStream input = new FileInputStream("data.dat");
        int value;
        while((value=input.read()) != -1){
            System.out.println((char)value);
        }
    }
    
}
