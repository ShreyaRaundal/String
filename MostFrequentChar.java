import java.util.HashMap;

public class MostFrequentChar {
    public static void main(String[]args){
        String str="acabcccddcc";
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        char mostFreqChar=' ';
        int max=0;

        for(char c:map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                mostFreqChar=c;
            }
        }
        System.out.println("Most frequent character: "+mostFreqChar+" appears "+max+" times");
    }
}
