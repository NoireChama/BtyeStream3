
package bytestreams3;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class lab4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("data.dat");
        BufferedOutputStream output = new BufferedOutputStream(file);
        String s = "Hello World!";
        byte[] b = s.getBytes();
        output.write(b);
        output.close();
        
        FileInputStream file = new FileInputStream("data.dat");
        BufferedInputStream input = new BufferedInputStream(file);
        int ch;
        while ((ch=input.read()) != -1){
            System.out.println(ch);
        }
        
    }
}
