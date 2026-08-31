package DAY_8;
import java.util.Scanner;

public class codee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total distance: ");
        double d = sc.nextDouble();
        System.out.print("Total days: ");
        int days = sc.nextInt();
        System.out.print("No. of travellers: ");
        int t = sc.nextInt();
        System.out.print("Mileage: ");
        double m = sc.nextDouble();
        System.out.print("Fule price: ");
        double p = sc.nextDouble();
        System.out.print("Hotel cost per day: ");
        double cost = sc.nextDouble();
        System.out.print("Food cost per day: ");
        double food = sc.nextDouble();

        double fuel_cost = (d/m)*p;
        double food_cost = t*days*food;
        double acc_score = t*cost*days;
        
        double t_bugget = fuel_cost+food_cost+acc_score;

        System.out.println("Total fuel cost ="+fuel_cost);
        System.out.println("Total food cost ="+ food_cost);
        System.out.println("Total accomo cost ="+ acc_score);
        System.out.println("Yotal trip bugget = "+ t_bugget);
        sc.close();
    }
    
}
