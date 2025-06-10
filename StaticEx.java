public class StaticEx {
    // instance variable
    int num;

    // static variable
    static int val;

    // static method
    static void getMsg() {
        System.out.println("Static method: " + val);
    }

    // instance method
    void getCall() {
        System.out.println("Instance method: val=" + val + ", num=" + num);
    }

    public static void main(String[] args) {
        val = 10;
        System.out.println(val);

        StaticEx staticEx = new StaticEx();
        staticEx.num = 20;
        System.out.println(staticEx.num);

        staticEx.val = 30; // same as StaticEx.val = 30;
        System.out.println(staticEx.val);

        getMsg();            // calling static method from static context
        staticEx.getMsg();   // legal, but not recommended to call static method this way
    }
}

