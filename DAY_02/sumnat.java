package DAY_02;
import java.util.*;
public class sumnat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
