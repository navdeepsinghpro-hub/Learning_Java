// Take the length, breadth, and height of a rectangular room from the user. Calculate the floor area, perimeter of the floor, and volume of the room. Formulas: Area = L × B, Perimeter = 2(L + B), Volume = L × B × H 

package DAY_5;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght: ");
        float L = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float B = sc.nextFloat();
        System.out.print("Enter height: ");
        float H = sc.nextFloat();

        float FA = L*B;
        float P = 2*(L+B);
        float V = L*B*H;

        System.out.println("Floor area = " + FA);
        System.out.println("Perimeter of the floor = " + P);
        System.out.println("Volume of the floor = " + V);
        sc.close();

    }
}
