class Sum{
    void sumOfArray (){
        int [] array = {1,5,3};
        int sum = 0;

        for(int i = 0 ; i < array.length;i++){ 
            sum += array[i];
        }
        System.out.println("the sum of given number is : " +sum);

    }
}

public class sumInArray {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sumOfArray();
    }
}
