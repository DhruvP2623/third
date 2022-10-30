public class Calculator02 {

    static int answer;
    public  void substraction( int a, int b) {


        answer = a - b;
        System.out.println( "Substraction of  " +a+ " and " +b+ " = " + answer  );}

    public static void addition(int a, int b) {
        answer = a + b;
        System.out.println("addition of " + a+ " and " +b+ " = " + answer);
    }

    public static void main(String[] args) {

        Calculator02 calculator02 = new Calculator02();
        addition(40, 57);
        calculator02.substraction(70,45);
        addition(40,57);
        calculator02.substraction(70,45);


    }
}


