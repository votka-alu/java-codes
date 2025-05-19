/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labbtask1;

import java.util.Scanner;

public class SumOfOdd {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);        
        
        System.out.print("Enter an integer :");
        
        int N = s.nextInt();
        
        int sum = 0;
        int oddNumber = 1;
        
        for(int i=1;i<=N;i++){
            
            sum += oddNumber;
            oddNumber +=2;
            
        }
        System.out.println("The sum of odd number is:"+N+"odd number is:" +sum);
    }
    
}
