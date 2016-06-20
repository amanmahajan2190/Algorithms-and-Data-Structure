package Strings;

import java.text.DecimalFormat;

/**
 * Created by AMAN on 6/19/2016.
 */
public class StringMultiplication {
        public String multiply(String num1, String num2) {
            Double n1 = convertToNumber(num1);
            Double n2 = convertToNumber(num2);
            String s = (n1*n2)+"";
            StringBuffer stringBuffer = new StringBuffer();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) != '.'){
                    stringBuffer.append(s.charAt(i));
                }else{
                    break;            }
            }
            return stringBuffer.toString();

        }

        public Double convertToNumber(String s){
            int length = s.length();
            Double power =1.0;
            Double sum =0.0;
            int num=0;
            for(int i=length-1;i>=0;i--){
                num =Character.getNumericValue(s.charAt(i));
                sum += num*power;
                power = power*10;
            }
            return sum;
        }

    public static void main(String[] args){
        StringMultiplication multiplication = new StringMultiplication();
        multiplication.multiply("123456789","987654321");
    }
}
