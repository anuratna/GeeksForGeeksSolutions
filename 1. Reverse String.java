class Solution {
    String reverseWords(String S) {
    String[] str = S.split("\\.");
    String reverse="";
    for(int i=str.length-1;i>=0;i--)
    {
       reverse = reverse + str[i];
       if(i!=0)
       {
       reverse = reverse+".";}
    }
    return reverse;
    }
}
