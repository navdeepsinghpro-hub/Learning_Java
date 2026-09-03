package DAY_9;
import java.util.*;

public class Arr3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd =0;

        System.out.print("Enter sizwe of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter Array Elements: ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array element");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Even = "+ even);
        System.out.println("Odd = "+ odd);

        sc.close();
    }
}
