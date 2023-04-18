
package bytestreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab5 {
    public static void main(String[] args) {
        student s = new student("65130500119", "Sirapat");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s);
            output.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            student o = (student)input.readObject();
            System.out.println(o.id);
            System.out.println(o.name);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
