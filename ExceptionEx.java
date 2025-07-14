public class ExceptionEx{
    public static void main(String srgs[]) {
        int b = 100;
        int c = 10;
        String str = new String();
         try {
            System.out.println(b / c);
             for (int a = 0; a < 4; a++) {
                System.out.println(a);
                System.err.println(str.charAt(0)); 
            }
        } catch (ArithmeticException ae) {
            System.err.println("Exception: " + ae);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.err.println("Array Exception: " + ai);
        } catch (Exception e) {
            System.err.println(e);  
        }
    }
}
