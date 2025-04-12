public class ToggleCase {
    public static void main(String[] args){
        String str="ShReYa";
        String toggle=" ";

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                toggle +=Character.toLowerCase(ch);
            }
            else{
                toggle +=Character.toUpperCase(ch);
            }
        }
        System.out.println("Toggle case :"+toggle);
    }
}
