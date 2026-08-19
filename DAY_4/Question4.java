// A car owner wants to calculate fuel efficiency and fuel cost. Take distance travelled, fuel consumed, and price per litre from the user. Calculate mileage and total fuel cost. Formula: Mileage = Distance / Fuel 

package DAY_4; 
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total distance travel: ");
        float D = sc.nextFloat();
        System.out.print("Total Fuel consumed: ");
        float F = sc.nextFloat();
        System.out.print("Price per litre: ");
        float P = sc.nextFloat();

        float fuel = F*P;

        System.out.print("Milage = " + (D/fuel));
        sc.close();
    }
}
