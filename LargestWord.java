public class LargestWord {
    public static void main(String[] args){
        String sentence="Java is best to rule the market";
        String[] words=sentence.split(" ");
        String largest="";

        for(String word:words){
            if(word.length()>largest.length()){
                largest=word;

            }
        }
        System.out.println("Largest word : "+largest);
    }
}
