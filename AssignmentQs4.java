
package assignment.pkg4;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int x = S.nextInt();

        int[] arr = new int[x];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = S.nextInt();
//            System.out.println("Elements are:"+arr[i]);
        }

        System.out.print("Enter the element to find frequency: ");
        int elementToFind = S.nextInt();

        int freq = 0;

        for (int i = 0; i < x; i++) {
            if (arr[i] == elementToFind) {
                freq++;
            }
        }

        if (freq > 0) {
            System.out.println(elementToFind + " is present " + freq + " times in the array.");
        } else {
            System.out.println("Not present.");
        }
    }
    
}
