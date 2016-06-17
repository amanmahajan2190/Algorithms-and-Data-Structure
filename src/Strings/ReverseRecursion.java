package Strings;

/**
 * Created by AMAN on 6/14/2016.
 */
public class ReverseRecursion {
    private String reverse;
    ReverseRecursion(String str){
        this.reverse = str;
    }

    public  String reverseWithRecur(String str){
        if(null == str || str.length()<=1){
            return str;
        }
        return reverseWithRecur(str.substring(1)) + str.charAt(0);
    }

    public String reverseNormaly(){
        char[] charArray = reverse.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        while(left <right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String afterReverse ="";
        for(int i =0;i<charArray.length;i++){
            afterReverse += charArray[i];
        }
        return afterReverse;

    }
}
