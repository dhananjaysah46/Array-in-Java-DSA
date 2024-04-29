import java.util.Scanner;

public class FindUnique {
    static int findUnique(int[] arr, int target){
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
           for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
           }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0 ){
                ans = arr[i];
            }
        }
    
        return ans;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Unique Element : "+findUnique(arr, n));
    }
}
