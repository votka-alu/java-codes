/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.case3;

import java.util.Scanner;
/**
 *
 * @author tanvir
 */
public class SwitchCase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        double n1 = s.nextDouble();
        
        System.out.print("Enter an operator:");
        char ope = s.next().charAt(0);
        
        System.out.print("Enter second number:");
        double n2 = s.nextDouble();
        
        double result = 0;
        
        switch(ope){
            case'+':
                result=n1+n2;
                break;
            case'-':
                result=n1-n2;
                break;
            case'*':
                result=n1*n2;
                break;
            case'/':
                
                if(n2!=0){
                     result=n1/n2;
                }else{
                    System.out.println("Division is not possible");
                }
                break;
            default:
                System.out.println("Invalid");
                return;
        }
        System.out.println("The anwer is:"+result);
    }
    
}
