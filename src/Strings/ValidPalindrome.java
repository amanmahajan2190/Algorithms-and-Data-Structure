package Strings;

/**
 * Created by AMAN on 6/18/2016.
 */

/** Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s){
        if(s.length()<=1){
            return false;
        }
        int start =0;
        int end = s.length()-1;
        while (start<end) {

            if(!isValidChar(s.charAt(start))){
                start++;
                continue;
            }
            if(!isValidChar(s.charAt(end))){
                end--;
                continue;
            }
            if(!isEqualChar(s.charAt(start),s.charAt(end))){
                start++;
                end--;

            }
        }

        return true;
    }
    public boolean isValidChar(char c){
        if(Character.isDigit(c) || Character.isLetter(c)){
            return true;
        }return false;
    }
    public boolean isEqualChar(char c1, char c2){
        return  (c1+"").equalsIgnoreCase(c2+"");
    }

    public static void main(String[] args){
        ValidPalindrome valid = new ValidPalindrome();
        System.out.print(valid.isPalindrome("ab"));
    }


}
