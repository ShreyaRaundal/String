public class substring {
    static int findSubstring(String txt,String pat){
        int n=txt.length();
        int m=pat.length();

        for(int i=0;i<=m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String txt="geeksforgeks";
        String pat="eks";
        System.out.println(findSubstring(txt, pat));
    }
    
}
