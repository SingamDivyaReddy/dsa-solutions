class Solution {
    public String reverseWords(String s) {
        String s1=s.replaceAll("\\s+"," ").trim();
        String[] str=s1.split(" ");
        StringBuilder str1=new StringBuilder("");
        for(int i=str.length-1;i>=0;i--){
            str1.append(str[i]);
            if(i>0){
            str1.append(" ");
            }
        }
        String str2=str1.toString();
        return str2;
    }
}