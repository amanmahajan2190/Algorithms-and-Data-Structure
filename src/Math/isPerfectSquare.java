package Math;

/**
 * Created by AMAN on 7/3/2016.
 */
public class isPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 0, right = num;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (num%mid == 0 && mid == num/mid){
                return true;
            }

            else if (mid <= num/mid) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return false;




    }

    public static void main(String[] args){
        isPerfectSquare square = new isPerfectSquare();
        square.isPerfectSquare(32);

    }

}
