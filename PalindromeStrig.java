public class PalindromeStrig {
    public static void main(String[ ]args){
        String str="madam";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        if(str.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not paindrome String");
        }
        
    }
}
