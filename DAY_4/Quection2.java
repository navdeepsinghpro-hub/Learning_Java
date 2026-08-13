package DAY_4;
import java.util.Scanner;
public class Quection2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of p1: ");
        float p1 = sc.nextInt();
        System.out.print("Enter quantity of q1: ");
        int q1 = sc.nextInt();
        System.out.print("Enter price of p2: ");
        float p2 = sc.nextInt();
        System.out.print("Enter qualntity of q2: ");
        int q2 = sc.nextInt();
        System.out.print("Enter price of p3: ");
        float p3 = sc.nextInt();
        System.out.print("Enter qualntity of q3: ");
        int q3 = sc.nextInt();

        float pr1 = p1*q1;
        float pr2 = p2*q2;
        float pr3 = p3*q3;

        System.out.println("Total bill = " +(pr1+pr2+pr3));
        sc.close();
    }
}
