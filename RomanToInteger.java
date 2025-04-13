import java.util.HashMap;

public class RomanToInteger {
  public static void main(String[] args){
    String roman="XVV";
    HashMap<Character,Integer>map=new HashMap<>();
    map.put('I',1);map.put('V',5);map.put('X',10);
    map.put('L',50);map.put('C',100);
    map.put('D',100);map.put('M',1000);

    int result=0;

    for(int i=0;i<roman.length();i++){
        int curr=map.get(roman.charAt(i));
        int next=(i+1<roman.length())?map.get(roman.charAt(i+1)):0;

        if(curr<next)result-=curr;
        else result += curr;
    }
    System.out.println("Integer :"+result);
  }  
}
