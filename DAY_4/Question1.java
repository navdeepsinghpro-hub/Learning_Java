package DAY_4;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();
        System.out.print("Enter Marks 4: ");
        int m4 = sc.nextInt();
        System.out.print("Enter Marks 5: ");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        System.out.println("Total Marks: "+total);
        int avg = (total*100)/500;
        System.out.println("Average: "+ avg);

        sc.close();
    } 
}
