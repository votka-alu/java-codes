/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;
/**
 *
 * @author tanvir
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        
        int num = s.nextInt();
        
        long factorial = 1;
        
        for(int i=1;i<=num;i++){
            
            factorial*=i;
        }
        System.out.println("Factorial of:" +num+ "is=" +factorial);
    }
    
}
