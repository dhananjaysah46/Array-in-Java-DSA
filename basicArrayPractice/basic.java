public class basic {
    public static void main(String[] args) {
        int [ ] marks = new int[3];
        marks[0]= 98; // physics
        marks[1] = 94; // maths
        marks[2] = 93; // chemistry

        System.out.println("the marks obtained by u is " +marks[0] + " "+"in physics.");
        System.out.println("the marks obtained by u is " +marks[1] + " "+"in mathematics.");
        System.out.println("the marks obtained by u is " +marks[2] + " "+"in chemistry.");

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
    
}
