 class InnerarrayExamples {
     void demoArray(){
        int [] ages = new int[3];
        float [] weights = new float[3];
        String [] names = {"ram","ravan","raj"};

        ages[0] = 32;
        ages[1] = 23;
        ages[2] = 21;

        weights[0] = 56;
        weights[1] = 39 ;
        weights[2] = 64;

       
        System.out.println(names[0]);
        System.out.println(ages[0]);
        System.out.println(+weights[0]);
        System.out.println(names[1]);
        System.out.println(ages[1]);
        System.out.println("the weights is :" +weights[1]);
        System.out.println(ages[2]);

    }
    void multiArray(){
        // int [] [] array_1 = new int[3][3];
        int [][] arr = {{23,34,54},{22,45,56},{21,44,76}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[2][0]);
    }
    
}
public class arrayExamples {
    public static void main(String[] args) {
        InnerarrayExamples obj = new InnerarrayExamples();
        obj.demoArray();
        obj.multiArray();
    }

    
}

