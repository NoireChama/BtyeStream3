
package bytestreams3;

import java.io.Serializable;

public class student implements Serializable{
    String id;
    String name;
            
            public student(String id,String name){
                this.id = id;
                this.name = name;
            }
}
