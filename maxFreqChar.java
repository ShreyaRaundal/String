import java.util.HashMap;

public class maxFreqChar {
    public static void main(String[] args){
        String str="banana";
        HashMap<Character,Integer>map=new HashMap<>();
        char maxChar=' ';
        int max=0;

        for(char ch:str.toCharArray()){
            int count=map.getOrDefault(ch, 0)+1;
            map.put(ch,count);

            if(count>max){
                count=max;
                maxChar=ch;
            }
        }
        System.out.println("Maximum frequency character :"+maxChar);

    }
}
