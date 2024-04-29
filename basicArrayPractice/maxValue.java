class value{
    void maximum(){
        int [] arr = {1,3,5,4,9,10};
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("the maximum value of given input is " +ans);
    }
}
public class maxValue {
    public static void main(String[] args) {
        value v = new value();
        v.maximum();
    }
}
