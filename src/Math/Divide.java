package Math;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 8/13/2016.
 */
public class Divide {

    public int divide(int dividend, int divisor) {
        boolean neg= false;
        if(divisor==0){
            return Integer.MAX_VALUE;
        }
        if(dividend ==0){
            return 0;
        }
        if(divisor <0 && dividend<0){
            dividend = -dividend;
            divisor = -divisor;
        }else if(dividend<0){
            neg =true;
            dividend =-dividend;
        } else if(divisor<0){
            neg =true;
            divisor = -divisor;
        }


        int count =0;

        int rem = dividend;
        int i= 1;
        int sum = 0;
        while(true){
            if(rem>=divisor*i){
                rem =rem -divisor*i;
                count=divisor*i;
                i= i*i;
            }else{

                    if(i==1){
                        break;
                    }else{
                        i=1;
                        sum =sum+count;
                        count=0;


                    }

            }

        }
        if(neg){
            return -sum;
        }
        else return sum;
    }

    public static void main(String [] args){
        Divide d = new Divide();
        System.out.print(d.divide(50,2));
        Map<Integer,Integer>  l = new HashMap<Integer, Integer>();
    }

}
