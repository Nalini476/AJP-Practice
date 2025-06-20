public class CalculatorApp {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,double b){
       return a+b;
    }
    public static void main(String[] args) {
        CalculatorApp calc=new CalculatorApp();
        System.out.println(calc.sum(20,30));
        System.out.println(calc.sum(30,40,50));
        double sum1=calc.sum(34.5,45.6);
        System.out.println(sum1);
    }

}
