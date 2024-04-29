import java.util.Arrays;
import java.util.Scanner;

public class bonus {
    static void smallestAndLargestElement(int[]arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] smallestAndLargeValue(int[]arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length - 1]};
        return ans;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.print("enter size of array : ");
       int n = sc.nextInt();
       
       int [ ] arr = new int[n];
       System.out.print("Enter " + n + " elements : ");
       for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
       }
       sc.close();
    //   smallestAndLargestElement(arr);
      int[] ans = smallestAndLargeValue(arr);
      System.out.println("Smalest : "+ ans[0]);
      System.out.println("Largest : " + ans[1]);
    }
}
