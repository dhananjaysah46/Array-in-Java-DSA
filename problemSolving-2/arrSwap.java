public class arrSwap {

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int i = 0;
         int j = arr.length - 1;

         while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
            
        }
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a newline after printing the array
    }

    public static void main(String[] args) {
        int i = 9;
        int j = 3;
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        printArray(arr);
        
    }
}