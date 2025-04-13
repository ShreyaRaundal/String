public class CountType {
   public static void main(String[]args){
    String str="A1@bc33$#2";

    int digits=0,letters=0,symbols=0;

    for(char ch:str.toCharArray()){
        if(Character.isDigit(ch))digits++;
        else if(Character.isLetter(ch))letters++;
        else symbols++;

    }
    System.out.println("Letters: "+letters);
    System.out.println("Digits : "+digits);
    System.out.println("Symbols: "+symbols);
   }
}
