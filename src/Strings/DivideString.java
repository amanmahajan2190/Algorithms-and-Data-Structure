package Strings;

/**
 * Created by AMAN on 6/16/2016.
 */
public class DivideString {
    String str;
    DivideString(String s){
        this.str =s;
    }

    public  void divideStringintoN(int N){

        if(str.length()%N !=0){
            System.out.println("String cannot be equally divided");
        }
        int partSize = str.length()/N;

        for(int i=0;i<str.length();i++) {
            if(partSize%i == 0){
                System.out.println("");
            }
            System.out.print(str.charAt(i));
        }
    }
}
