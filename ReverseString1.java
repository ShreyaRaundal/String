public class ReverseString1 {
    public static void main(String[] args){
        String str="helloShreya";
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println("Reverse a String a String :"+reverse);      
    }
}
