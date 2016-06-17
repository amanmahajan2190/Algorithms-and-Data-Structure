package Strings;

/**
 * Created by AMAN on 6/16/2016.
 */
public class FirstNonRepeatingCharacter {
    String str;
    FirstNonRepeatingCharacter(String s){
        this.str =s;
    }

    public void findFirst(){
        int[] charArray = new int[256];
        for(int i=0 ; i < str.length();i++){
            charArray[str.charAt(i)]++;
        }
        for(int i=0 ; i < str.length();i++){
            if(charArray[str.charAt(i)]==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
