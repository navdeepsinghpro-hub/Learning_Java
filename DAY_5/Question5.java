// A part-time worker is paid according to the number of hours worked. Take working days, working hours per day, and payment per hour from the user. Calculate total working hours, monthly earnings, and estimated yearly earnings. Formula: Earnings = Hours × Rate 

package DAY_5; 
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Working days: ");
        float W = sc.nextFloat();
        System.out.print("Working hour per day: ");
        float H = sc.nextFloat();
        System.out.print("Payment per hour: ");
        float P = sc.nextFloat();

        float E = H*P;

        float WH = H*W;
        float ME = E*30;
        float YE = E*365;


        System.out.println("Total working hours = " + WH);
        System.out.println("Total monthly earning = " + ME);
        System.out.println("Total yearly earnings = " + YE);
        sc.close();
    }
}