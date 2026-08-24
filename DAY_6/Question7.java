// Take a three-digit integer from the user. Extract its hundreds, tens, and units digits using arithmetic operators. Calculate the sum of its digits and the reversed number. Formula: Reversed Number = (Units × 100) + (Tens × 10) + Hundreds 

package DAY_6;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit no: ");
        int num = sc.nextInt();

        int hundred = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10; 

        int sum = hundred + tens + units;

        int reversed = (units * 100) + (tens * 10) + hundred;

        System.out.println("Hundreds = " + hundred);
        System.out.println("Tens = " + tens);
        System.out.println("Units = " + units);
        System.out.println("Sum = " + sum);
        System.out.println("Reversed = " + reversed);
        sc.close();
    }
}
