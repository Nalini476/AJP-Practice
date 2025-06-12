public class Fibnocci {
    static void series(int range){
        int num1 = 0, num2 = 1, num3;

        System.out.print(num1 + " " + num2);
        for(int i=2;i<=range;i++){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }

    }
    public static void main(String[] args) {
    series(10);
    }
}