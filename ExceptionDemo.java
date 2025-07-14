public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b;
        try { 
        a=100;
        b=2;
        System.out.println(a/b);
        System.out.println("in try");
        }catch(ArithmeticException ae){
            System.out.println("DSivison by 0");
        }
        finally{
            System.out.println("finally");
        }
        
        System.out.println("End");
    }
}
