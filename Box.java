public class Box {
    public int length;
    private int breadth;
    protected int height;
    int weight;

    int volume(){
        return length*breadth*height;
    }
    public static void main(String[] args) {
        Box box=new Box();
        box.length=100;
        box.breadth=30;
        box.height=25;
        System.out.println("Volume="+box.volume());
    }

    


}
