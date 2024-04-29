import java.util.Scanner;

public class question1 {
    static int countOccurrence(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        } 
        return count;   
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
       System.out.print("Enter x : ");
       int x = sc.nextInt();
        sc.close();
        System.out.println("count of x : " + countOccurrence(arr, x));
    }  
}
