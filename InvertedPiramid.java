/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertedpiramid;

import java.util.*;

public class InvertedPiramid {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int Rows = scanner.nextInt();
        
        for (int i = Rows; i >= 1; i--) {
            for (int j = 0; j < Rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
        
        
    }
    
}
