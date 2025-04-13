public class RemoveSpaces {
    public static void main(String[] args){
        String str="Hello shreya how are you";
        String noSpace=str.replaceAll("\\s", "");
        System.out.println("Without space "+noSpace);

    }
}
