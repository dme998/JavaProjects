// Daniel Eggers
// CMPSCI2261 with K. Dhou
// February 18, 2018

import java.util.Scanner;
public class CreditCardValidationSystem {

    public static void main(String[] args) {
        long cardnum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your credit card number: ");
        cardnum = input.nextLong();
        input.close();  // close Scanner
      
        if (isValidPrecheck(cardnum)) {
            System.out.println("The card number passed pre-check.  Next is Luhn's algorithm... ");
            if (isValidLuhn(cardnum))
                System.out.println("The card number is valid.");
            else
                System.out.println("The card number is invalid.");
        }
        else
            System.out.println("The card number is invalid.");
    }
    
    
    public static boolean isValidLuhn(long lnum) {
        // convert to string
        String num = Long.toString(lnum);
        
        // convert to array
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = Character.getNumericValue(num.charAt(i));
        }
        
        /* VERIFIED, ALL STEPS UP TILL THIS POINT WORK AS INTENDED */
        
        // double every second digit right to left (Step 1)
        for (int i = arr.length - 2; i >= 0; i -= 2) {
            arr[i] += arr[i];
            
            // if result is 2 digits, add the two digits to get a single-digit number
            if (arr[i] >= 10) {
                arr[i] -= 9;
            }
        }
        // calculate sum of all digits (Steps 2-4)
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            //System.out.println(arr[j]);
            sum += arr[j];
        }     
        
        // card is valid if sum is divisible by 10 (Step 5)
        if (sum % 10 == 0)
            return true;
        else
            return false;
    }
    
    
    
    public static boolean isValidPrecheck(long num) {
        /* Check for correct number of digits and for correct prefix
         * 4 for Visa, 5 for MC, 37 for AMEX, 6 for Discover */
        if (String.valueOf(num).length() >= 13  &&  String.valueOf(num).length() <= 16) {         
            System.out.println("Correct number of digits.");
      
            switch(String.valueOf(num).substring(0,1)) {
            case "3":
                if ( (String.valueOf(num).substring(1, 2)).equals("7") ) { 
                    System.out.println("American Express");
                    return true;
                }
                else
                    return false;
                  
            case "4":
                System.out.println("Visa");
                return true;
            case "5":
                System.out.println("Master Card");
                return true;
            case "6":
                System.out.println("Discover Card");
                return true;
            default:
                System.out.println("Prefix doesn't match one of the accepted card types.");
                return false;
            }
        
        }
        else {
            System.out.println("Incorrect number of digits.");   
            return false;
        }
    }
        
        

}
