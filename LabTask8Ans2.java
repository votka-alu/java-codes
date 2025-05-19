
package labtask8.ans2;

    import java.util.Scanner;
    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Scanner;


public class LabTask8Ans2 {


    public static void main(String[] args) {

        int[] arr = new int[100];
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = (int) (Math.random() * 100);
        }

        Scanner s = new Scanner(System.in);
        BufferedWriter writer = null; 
       

        try {
            System.out.print("Enter an index (0-99): ");
            int index = s.nextInt();
            int value = arr[index];
            System.out.println("Value at index " + index + " is: " + value);

            System.out.print("Enter an integer to divide with: ");
            int divisor = s.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("zero is not allowed.");
            }

            int result = value / divisor;
            System.out.println("Result : " + result);
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index is out of bounds. " + e.getMessage());
            
            
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            
            
        } finally {
            System.out.println("Program Ends");
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Helper method to write exception names to a text file
    private static void writeExceptionToFile(String fileName, String exceptionName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(exceptionName);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    
}
