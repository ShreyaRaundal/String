public class CountVowels {
    public static void main(String[] args){
        String str="You Deserve to be in Product baesd company ";
        int count=0;

        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }

        }
        System.out.println("Count Vowel :"+count);
    }
}
