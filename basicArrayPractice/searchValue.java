class value{
    void search (){ // Linear Search Implementation
        int [] arr = {1,5,3,9};
        int x = 9;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        if (ans == -1) {
            System.out.println("not found");   
        }
        System.out.println("found " + x + " at index " +ans);
    }
}

public class searchValue {
    public static void main(String[] args) {
        value u = new value();
        u.search();
    }
}

