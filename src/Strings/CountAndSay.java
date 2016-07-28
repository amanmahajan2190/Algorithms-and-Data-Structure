package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 6/21/2016.
 */
public class CountAndSay {
    public String countAndSay(int n) {
       /* Map<String,String> characterMap = new HashMap<String, String>();
        characterMap.put("1" ,"one");
        characterMap.put("2" ,"two");
        characterMap.put("3" ,"three");
        characterMap.put("4" ,"four");
        characterMap.put("5" ,"five");
        characterMap.put("6" ,"six");
        characterMap.put("7" ,"seven");
        characterMap.put("8" ,"eight");
        characterMap.put("9" ,"nine");
        characterMap.put("0" ,"zero");*/
        //11111

        String number = n+"";
        char[] numberArray = number.toCharArray();
        if(numberArray.length == 1 ){
            return  numberArray[0]+"";
        }
        StringBuilder str = new StringBuilder();
        int counter =1;
        for(int i=1 ;i<numberArray.length;i++) {
            if (numberArray[i] == numberArray[i - 1]) {
                counter++;
            } else {
                //str.append(characterMap.get(counter + "") + " ");
                str.append(counter);
                str.append(numberArray[i - 1] + "");

                counter = 1;

            }
        }
        str.append(counter);
        str.append(numberArray[numberArray.length-1] +"");

        return str.toString();

    }
    public static  void main(String[] args){
        CountAndSay say = new CountAndSay();
        System.out.print(say.countAndSay(1122334));

    }
}
