public class CountWord {
    public static void main(String[] args){
        String sentence="Java is awesome";
        String[] words=sentence.trim().split("\\s");
        System.out.println("Count the Word :"+words.length);

    }
}
