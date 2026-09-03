package DAY_9;
import java.util.*;

public class Arr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

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
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
