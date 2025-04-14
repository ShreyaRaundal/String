public class CamelToSnake {
    public static void main(String[]args){
        String str="CamelToSnake";
        StringBuilder sb=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append('_').append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);

            }
        }
        System.out.println("Snake case : "+sb);
    }
}
