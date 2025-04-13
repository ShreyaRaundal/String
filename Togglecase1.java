public class Togglecase1 {
    public static void main(String[]args){
        String str="HeLlO WoRLd";
        StringBuilder toggle=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                toggle.append(Character.toLowerCase(ch));
            }else{
                toggle.append(Character.toUpperCase(ch));
            }   
        }
        System.out.println("Toggled : "+toggle);
    }
}
