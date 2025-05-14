/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.*;
/**
 *
 * @author tanvir
 */
public class Fibonacci {   
    
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = s.nextInt();
        
        System.out.println("Fibonacci sequence of " + N + ":");
        
        int first = 0, second = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}