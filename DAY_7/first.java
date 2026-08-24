package DAY_7;
import java.util.Scanner;
public class first {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter quantity of p1");
        // int q1 = sc.nextInt();
        System.out.print("Enter price of p1: ");
        float p1 = sc.nextFloat();
        // System.out.print("Enter quantity of p2");
        // int q2 = sc.nextInt();
        System.out.print("Enter price of p2: ");
        float p2 = sc.nextFloat();
        // System.out.print("Enter quantity of p3");
        // int q3 = sc.nextInt();
        System.out.print("Enter price of p3: ");
        float p3 = sc.nextFloat();
        // System.out.print("Enter quantity of p4");
        // int q4 = sc.nextInt();
        System.out.print("Enter price of p4: ");
        float p4 = sc.nextFloat();

        int d = 20;
        p1 = p1-(p1*d)/100;
        p2 = p2-(p2*d)/100;
        p3 = p3-(p3*d)/100;
        p4 = p4-(p4*d)/100;

        int gst = 18;

        float t_price = p1+p2+p3+p4;

        float bill = t_price + (t_price*gst)/100;

        System.out.println("your total bill = " + bill);

        sc.close();
    }
}
