public class CountWords {
    public static void main(String[] args){
        String sentence="Shreya tumhe aal aana hai you do beb";
        String[] words=sentence.trim().split("\\s");
        System.out.println("Count words :"+words.length);
    }
}
