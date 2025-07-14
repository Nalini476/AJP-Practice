public class ExceptionEx1 {
 void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String args[]) {
        ExceptionEx1 exceptionEx1 = new ExceptionEx1();
        exceptionEx1.add(10, 12);
        exceptionEx1.divide(10, 0);
    }   
}