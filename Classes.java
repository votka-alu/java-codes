
package classes;

import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1.toString());
        
        Cylinder cy2 = new Cylinder(3);
        System.out.println(cy2.toString());
        
        Cylinder cy3 = new Cylinder(3,2);
        System.out.println(cy3.toString());
        
        Scanner sc = new Scanner(System.in);
        
        
        
    }
    
}
