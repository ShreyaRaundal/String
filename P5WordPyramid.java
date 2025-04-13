public class P5WordPyramid {
    public static void main(String[] args) {
        String word = "JAVA";
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}