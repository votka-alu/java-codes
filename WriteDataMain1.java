
package file;

;
import java.io.*;

public class WriteDataMain1 {
    public static void main(String[] args) {
            String name[] = {"Tony Stark", "Steve Rogers", "Thor Odinson"};
            int id[] = {1510001042, 1430001042, 1310001042};
            
    
            File file = new File("about_1.txt");
                try {
                PrintWriter output = new PrintWriter(file);
                
                for(int i=0; i<3; i++) {
                output.println(name[i]); 
                output.println(id[i]);
                }                               
                output.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
        }
}
