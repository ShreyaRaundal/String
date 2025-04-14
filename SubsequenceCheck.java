public class SubsequenceCheck {
    public static void main(String[] args) {
        String s1 = "abc", s2 = "ahbgdc";
        int i = 0;

        for (char ch : s2.toCharArray()) {
            if (i < s1.length() && s1.charAt(i) == ch) i++;
        }

        System.out.println(i == s1.length() ? "Is Subsequence" : "Not Subsequence");
    }
}
