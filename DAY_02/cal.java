package DAY_02;
import java.util.*;

public class cal {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplaction");
        System.out.println("5. Modulas");

        int choice = sc.nextInt();

        switch(choice){
            case 1 : 
                System.out.println("Addition is = " + (a+b));
                 break;
            case 2 :
                    System.out.println("Substraction is = " +(a-b));
                 break;
            case 3 : 
                System.out.println("Division is =" +(a/b));
                 break;
            case 4:
                System.out.println("Multiplication is = " +(a*b));
                break;
            case 5:
                System.out.println("Modulas is = " + (a%b));
                break;
        }


        sc.close();
    }

}
