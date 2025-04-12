public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog".toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean present : alphabet) {
            if (!present) {
                System.out.println("Not a pangram");
                return;
            }
        }

        System.out.println("It is a pangram");
    }
}
