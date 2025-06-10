public class customer1 {
    //variables 
    int customerId;
    String customer_name;
    //method
    void getCustomer()
    {
      System.out.println(customerId+"\n"+customer_name); 
    } 
    public static void main(String[] args) {
        customer1 c=new customer1();
        c.customerId=12345;
        c.customer_name="Anudip";
        c.getCustomer();  
    } 

}
