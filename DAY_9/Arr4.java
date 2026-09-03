package DAY_9;
import java.util.*;

public class Arr4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int large = 0;
        int second = 0;

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
            if(arr[i]>large){
                second = large;
                large = arr[i];
            }
        }

        System.out.println("Largr = " + large);
        System.out.println("second = "+ second);

        sc.close();
    }
}
