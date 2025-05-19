
package assignment.pkg7;
 import java.util.Scanner;

public class Assignment7 {


    public static void main(String[] args) {
        Furniture furniture1 = new Furniture(2, "Small Cabinet", false, 1,12000);
        System.out.println("Information for Furniture 1:");
        furniture1.information();
        
        System.out.println("\n");

        Scanner s = new Scanner(System.in);
        
        String f1 = "Small Cabinet";
        String f2 = "Large Cabinet";
        String f3 = "Kitchen Cabinet";
        
        System.out.println("Enter the type of Second furniture:");
        String type =s.nextLine();
        while(true){
            if(type.equals(f1)||type.equals(f2)||type.equals(f3))
                break;
            else
                System.out.println("Enter the type of Second furniture:");
                  
        }
        
        System.out.println("Enter the number of drawers for the furniture:");
        int drawers = s.nextInt();
        s.nextLine();        

        System.out.println("Is it colourful? (true/false):");
        boolean colourful = s.nextBoolean();

        System.out.println("Enter the number of doors:");
        int doors = s.nextInt();

        System.out.println("Enter the cost:");
        double cost = s.nextDouble();

        Furniture furniture2 = new Furniture(drawers, type, colourful, doors, cost);

        System.out.println("\nInformation for Furniture 2:");
        furniture2.information();
    }
    
}
