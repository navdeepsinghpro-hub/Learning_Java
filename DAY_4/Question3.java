// A bank customer wants to calculate the maturity amount of a fixed deposit. Take principal amount, annual interest rate, and time in years from the user. Calculate simple interest and maturity amount. Formula: SI = (P × R × T) / 100 

package DAY_4;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        float P = sc.nextFloat();
        System.out.print("Enter annual intrest rate: ");
        float R = sc.nextFloat();
        System.out.print("Enter time in (Years): ");
        float T = sc.nextFloat();

        float SI = (P*R*T)/100;
        System.out.println("Simple intrest: " +SI);

        float MI = SI+P;
        System.out.println("Maturity amount: " + MI);

        sc.close();
    }
}
