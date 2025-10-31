
/**
 *
 * @AniskaaV
 * @10072025
 */
import java.util.Scanner;
public class Quote
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Please enter your pet's name: ");
        String petName = in.nextLine();
        System.out.println("How many days will you need sitting? ");
        int days = in.nextInt();
        System.out.println("How many visits a day would you like: ");
        int visits = in.nextInt();
        System.out.println("Select the category that's closest to your pet: ");
        System.out.println("[A] Bird");
        System.out.println("[B] Cat");
        System.out.println("[C] Dog");
        System.out.println("[D] Fish");
        System.out.println("[E] Reptile");
        System.out.println("[F] Small animal");
        System.out.println();
        System.out.println("Enter the letter corresponding to your pet: ");
        String userChoice = in.next();
        double cost = 0;
        if (userChoice.equalsIgnoreCase("A"))
        {
            if (visits == 1)
            {
                cost = 7;
            }
            else
            {
                cost = 12;
            }
        }
        else if (userChoice.equalsIgnoreCase("B"))
        {
            if (visits == 1)
            {
                cost = 10;
            }
            else
            {
                cost = 15;
            }
        }
        else if (userChoice.equalsIgnoreCase("C"))
        {
            if (visits == 1)
            {
                cost = 15;
            }
            else
            {
                cost = 20;
            }
        }
        else if (userChoice.equalsIgnoreCase("D"))
        {
            if (visits == 1)
            {
                cost = 5;
            }
            else
            {
                cost = 7;
            }
        }
        else if (userChoice.equalsIgnoreCase("E"))
        {
            if (visits == 1)
            {
                cost = 9;
            }
            else
            {
                cost = 15;
            }
        }
        else if (userChoice.equalsIgnoreCase("F"))
        {
            if (visits == 1)
            {
                cost = 12;
            }
            else
            {
                cost = 17;
            }
        }
        else
        {
            System.out.print("You did not choose a vlid menu option!");
        }
        
        double total = cost * days;
        System.out.println();
        System.out.println("                   Quote for Pet Sitting Services                       ");
        System.out.println("========================================================================");
        System.out.println("Name: " + name +"\t\t\t Pet's name: " + petName);
        System.out.println("Number of days: " + days + "\t\t\t Visits per day: " + visits);
        System.out.println("Estimated total fees: $" + total);
    }   
}
