public class LastWordLength{
    public static void main(String[] args){
        String str="Shreya Raundal";
        str=str.trim();
        int lastSpace=str.lastIndexOf(' ');
        System.out.println("Length of last word : "+(str.length()-lastSpace-1));
    }
}