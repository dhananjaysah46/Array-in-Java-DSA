import java.util.Scanner;
public class qn2 {
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastIndex = i;
            }
        } 
        return lastIndex;   
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
        System.out.println("Last Occurrence of x : " + lastOccurrence(arr, x));
    }  
}

