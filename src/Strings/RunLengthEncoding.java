package Strings;

/**
 * Created by AMAN on 6/16/2016.
 */
public class RunLengthEncoding {
    String str;
    StringBuffer resultString;
    RunLengthEncoding(String s){
        str =s;
        resultString = new StringBuffer("");
    }

    public void encode(){
        int k =0;
        for(int i=1;i<str.length();i++){
            k++;
            if(str.charAt(i) != str.charAt(i-1)){

                resultString.append(str.charAt(i-1));
                resultString.append(k);
                k=0;
            }
        }

        System.out.print(resultString);

    }

    public static void main(String[] args){
        RunLengthEncoding l = new RunLengthEncoding("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW");
        l.encode();
    }
}
