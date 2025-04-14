public class CapitalizeWords {
    public static void main(String[] args){
        String sentence="Java is awesome";
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word:words){
            result.append(Character.toUpperCase(word.charAt(0)))
            .append(word.substring(1)).append(" ");

        }
        System.out.println("Capitalized :"+result.toString().trim());
    }
}
