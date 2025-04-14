public class LongestPalindrome {
    public static String longestPalindrome(String s){
        String res=" ";
        for(int i=0;i<s.length();i++){
            String odd=expandFromCenter(s,i,i);
            String even= expandFromCenter(s,i,i+1);
            if(odd.length()>res.length())res=odd;
            if(even.length()>res.length())res=even;
        }
        return res;
    }

    private static String expandFromCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;right++;
        }
        return s.substring(left+1, right);
    }
    public static void main(String[] args){
        String str="babad";
        System.out.println("Longest Palindromic Substring: "+longestPalindrome(str));

    }
}
