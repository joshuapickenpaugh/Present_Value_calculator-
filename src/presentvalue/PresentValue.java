/*
Joshua Pickenpaugh
UNIT 4, Chapter 5, Number 4 Assignment.
December 2nd, 2016
 */

package presentvalue;
import java.lang.*;
import java.util.Scanner;
 
public class PresentValue 
{
    public static void main(String[] args) 
    {
        //Variables:
        double dblAnnRate;
        double dblDurationInYears;
        double dblFutureValue;
        double dblPresentValue;
        int intAgain;
        
        //create a Scanner object to read from the keyboard
	Scanner keyboard = new Scanner(System.in);  
        
        do
        {
        //Get user input:
        System.out.print("Enter the annual rate: ");
	dblAnnRate = keyboard.nextInt(); 
        System.out.print("Enter the duration (in whole years): ");
	dblDurationInYears = keyboard.nextInt(); 
        System.out.print("Enter the future amount desired: ");
	dblFutureValue = keyboard.nextInt(); 
        
        //Calls method:
        dblPresentValue = GetPresentValue(dblAnnRate, dblDurationInYears, dblFutureValue);
        
        //Output:
        System.out.printf("You will need to deposit %.2f to get %.2f in %.0f years at %.1f annual interest rate.\n", 
                dblPresentValue, dblFutureValue, dblDurationInYears, dblAnnRate);  
        
        //User choice for another calculation; I'm using integers for input
        //since I was getting an "Error: Out of Bounds" for some reason on the
        //.charAt() method when using either "Y" or "N" for user response: 
        System.out.println("Another calculation? 1 for yes, 2 for no:");
        intAgain = keyboard.nextInt();
        
        }while (intAgain == 1);
        
    }
    
    public static double GetPresentValue(double annrte, double drtnyrs, double ftrvl)
    {
        //Local variable declaration:
        double prsntvl= 0;
        
        //Converts user input percentage to a proper decimal,
        //then adds one (for the formula):
        annrte = (annrte / 100) + 1;
        
        //Calculates:
        prsntvl = ftrvl /  Math.pow(annrte, drtnyrs);
        
        return prsntvl;
    }
    
}
