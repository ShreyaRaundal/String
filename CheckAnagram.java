import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args){
        String s1="listen" ,s2="slient";

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
       

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("Anogram");  
        }else{
            System.out.println("Not anagram");
        }


    }
}
