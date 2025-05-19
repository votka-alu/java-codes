
package assignment.pkg5;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        int row,col;
        
        System.out.println("Enter the length of right triangles adjecent side:");
        int x = S.nextInt();
        
        for(row = 1;row<=x;row++){
            for(col = 1;col<=x-row;col++){
                System.out.print(" ");
            }
            for(col = 1;col<=row;col++){
            System.out.print("*");
            }
            System.out.print("\n");
        }

    }
    
}
