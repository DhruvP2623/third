public class VariableExercise {
    // Global static variable - everyone can use this

    static String name = "Dhruv";

    public static void printMyLastName(){
        String lastName = "Patel";  // local variable for printMyLastName() method
        System.out.println(lastName);
    }
    public static void printMyage(){
        int b = 20; // local variable for printMyage() method
        System.out.println(b);

    }

    public static void main(String[] args) {

        //Local Variable of  main method - no one can else access them outside the main method

        int a = 10;
        System.out.println(name);
        System.out.println(a);

        printMyLastName();
        printMyage();
    }
}
