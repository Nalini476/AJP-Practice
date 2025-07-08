public class StringEx2 {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.indexOf(3));
        System.out.println(str.startsWith("ld"));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(5,9));
        String str1=str.replace("Hello","Hai");
        System.out.println(str1);
        System.out.println(str.equalsIgnoreCase(str1)); 
        System.out.println(str1.compareTo(str));
    
        
    }
}