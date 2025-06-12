public class ForLoopEx {
    public static void main(String[] args) {
        int num=5;
        //5!= 5*4*3*2*1
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
    }
    System.out.println("Factorial of"+num+"+"+factorial);
}
}
