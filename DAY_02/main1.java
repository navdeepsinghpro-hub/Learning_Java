package DAY_02;
import java.util.*;
public class main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>18){
            System.out.println("Adult");
        } else {
            System.out.println("Minnor");
        }
        sc.close();
    }
}
