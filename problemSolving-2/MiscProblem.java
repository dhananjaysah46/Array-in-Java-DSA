public class MiscProblem {
    static void swap(int a, int b){
        System.out.println("Original values before swap : ");
        System.out.println("a : " +a);
        System.out.println("b : " +b);

        int temp = a; // temp = 9
        a = b;  // a = 3
        b = temp; // b = 9

        System.out.println("Values after swap : ");
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        //a = 3, b = 9
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        // int[] arr = {1,2,3,4,5};
        swap(a, b);
    }
}