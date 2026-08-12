package DAY_3;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Number is " +a + name);
        sc.close();
    }
}
