import java.util.Scanner;

public class RepeatingNumber {  
    static int firstRepeatingNumber(int[] arr){
        int n = arr.length; 

        for (int i = 0; i < n; i++) {  //first number
            for(int j = i + 1;j < n; j++){  //secomd number
                if (arr[i] == arr[j]) {   //answer found
                    return arr[i]; 
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
        }
        sc.close();
        System.out.println("First Repeating Number : "+firstRepeatingNumber(arr));
    }   
}
