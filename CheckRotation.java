public class CheckRotation {
    public static void main(String[] args){
        String s1="abcd",s2="cdab";

        if(s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.println("String is rotating");
        }else{
            System.out.println("String is not rotating");
        }
    }
}
