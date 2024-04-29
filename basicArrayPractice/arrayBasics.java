import java.util.Scanner;

public class arrayBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int numbers[] = new int [size];
        
        // input
        System.out.println("Enter " + size + " elements");
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();

        }
        sc.close();

        //output for creating to give input of a size a array 
        for(int i = 0; i < size; i++){
            System.out.print("Output : " +numbers[i]);
        }
    }
}