package Strings;

/**
 * Created by AMAN on 6/14/2016.
 */
public class MaxOccurence {
    int max = 0;
    char maxCharacter ='S';
    String  str;
    MaxOccurence(String s){
        this.str = s;
    }

    public void printMaxCharacter(){
        int[] charArray = new int[256];
        for(int i =0;i<str.length();i++){
            charArray[str.charAt(i)]++;
        }
        for(int i =0 ;i<str.length();i++){
            if(charArray[str.charAt(i)] >max){
                max = charArray[str.charAt(i)];
                maxCharacter = str.charAt(i);
            }
        }
        System.out.print(max);
        System.out.print(maxCharacter);
    }
}
