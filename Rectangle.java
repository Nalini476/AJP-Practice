public class Rectangle {
   int length,breadth;
   int area(){
    System.out.println("Rectangle class");
    return length*breadth;
   }
   public static void main(String[] args) {
    Rectangle rect=new Rectangle();
    rect.length=20;
    rect.breadth=30;
    int val=rect.area();
    System.out.println(val);
    
   } 
}
