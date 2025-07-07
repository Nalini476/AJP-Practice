public class StringEx {
    public static void main(String args[]) {
        String str = "Java";
        String str1 = "Java Language";

        System.out.println(str);                    
        System.out.println(str.length());             
        System.out.println(str.toLowerCase());        
        System.out.println(str1.toUpperCase());       
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str+str1);
        String str2=str.concat(str1);
        System.out.println(str2);
        
        char[]charArray=str1.toCharArray();
        for(char ch:charArray)
        System.out.println(ch);
    }
}

