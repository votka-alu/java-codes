
package assignment.pkg6;

import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        for(int j = 0;;j++){        
        System.out.println("Enter N:");
        int n = S.nextInt();
        
        int sum = 0;
        if(n == 0 || n == 1){
            System.out.println("End.");
            break;
            } 
        
        n = n-1;
        sum +=fibSum(n);
        for (int i = 0; i <= n; i++) {
                 
                System.out.print(fibonacci(i) + (i < n ? "+" : " = "));
            }
            System.out.println(sum);
    }
    }    

    private static long fibonacci(int n) {
        if(n<=1){
            return n;
        }
        else{
            return(fibonacci(n-1)+fibonacci(n-2));
        }
    }
    private static long fibSum(int n) {
        if(n<=1){
            return n;
        }
        else{
            return(fibSum(n-1)+fibSum(n-2))+1;
        }
    }
    
}
