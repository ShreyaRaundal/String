public class PangramCheck1 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
        boolean[] letters = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters[ch - 'a'] = true;
            }
        }

        for (boolean b : letters) {
            if (!b) {
                System.out.println("Not a pangram");
                return;
            }
        }

        System.out.println("Is a pangram");
    }
}
