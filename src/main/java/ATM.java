import java.util.Scanner;

public class ATM {
    /**
     * prints the amount to dispense in twenties, tens, fives,
     * ones, quarters, dimes, nickels, and pennies.
     *
     */
    public static void dispense(double amount)
    {
        Scanner scan = new Scanner(System.in);
        int intAmount = (int)amount;
        int twenties = (intAmount / 20);
        int amountAfterTwenties = (intAmount % 20);
        int tens = (amountAfterTwenties / 10);
        int amountAfterTens = (amountAfterTwenties % 10);
        int fives = (amountAfterTens / 5);
        int amountAfterFives = (amountAfterTens % 5);
        int ones = (amountAfterFives / 1);


        double totalCents = (amount - intAmount);
        int intTotalCents = (int)(totalCents * 100);
        int quarters = (intTotalCents / 25);
        int amountAfterQuarters = (intTotalCents % 25);
        int dimes = (amountAfterQuarters / 10);
        int amountAfterDimes = (amountAfterQuarters % 10);
        int nickels = (amountAfterDimes / 5);
        int amountAfterNickels = (amountAfterDimes % 5);
        int pennies = (amountAfterNickels / 1);

        System.out.println(amount + " contains:");
        System.out.println( twenties + " in $20");
        System.out.println(tens + " in $10");
        System.out.println( fives + " in $5");
        System.out.println( ones + " in $1");
        System.out.println( quarters + " in 25" + '\u00A2');
        System.out.println( dimes + " in 10" + '\u00A2');
        System.out.println(nickels + " in 5" + '\u00A2');
        System.out.println( pennies + " in 1" + '\u00A2');






    }

    // DO NOT TOUCH THE CODE BELOW THIS LINE
    public static void main(String [] arg) {
        Scanner scn = new Scanner(System.in);

        double amount = scn.nextDouble();
        dispense(amount);
    }
}