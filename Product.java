public class Product {
    
		int product_id;
		String product_name;
		int product_price;
		void getdata()
		{
			System.out.println("product details:"+"\n"+product_id+"\n"+product_name+"\n"+product_price);
		}
		

		public static void main(String[] args) {
			Product product1=new Product();
			product1.product_id=1322;
			product1.product_name="Refrigerator";
			product1.product_price=15000;
			product1.getdata();
        }
    }
