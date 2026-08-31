package DAY_8;
import java.util.Scanner;

public class Code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse=0,sum=0;

        while(n>0){
            int digit = n%10;
            sum += digit;
            reverse = reverse*10+digit;
            n = n/10;
        }
        System.out.println("Reverse = " + reverse);
        System.out.println("Sum = " + sum);
        sc.close();

    }
}
