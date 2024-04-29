class innertraversingArray {
    void demoArray(){
        int ages [] = {23,13,16};

        for(int i = 0; i <= ages.length; i++){
            System.out.println(ages[i]);
        }

        //using foreach loop 
        for (int age : ages) {
            System.out.println(age);
            
        }
    }
    
}
public class traversingArray {

    public static void main(String[] args) {
        innertraversingArray obj = new innertraversingArray();
        obj.demoArray();
    }
}
