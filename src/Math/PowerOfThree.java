package Math;

/**
 * Created by AMAN on 7/3/2016.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {

        while(n > 1){
            int remainder = n%3;
            if(remainder !=0 ){
                return false;
            }
            n = n/3;
        }

        return true;

    }

    public static void main(String [] args){
        PowerOfThree three = new PowerOfThree();
        System.out.print(three.isPowerOfThree(3*3*3*3*3*3*3));
    }


}
