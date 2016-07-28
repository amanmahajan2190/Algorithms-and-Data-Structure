package Arrays;

/**
 * Created by AMAN on 7/12/2016.
 */
public class JumpAray {
    public int jump(int[] A) {
        int step_count = 0;
        int max_jump =0;
        int last_jump =0;
        for(int i=0;i<A.length;i++){
            max_jump = Math.max(max_jump,i+A[i]);
            if(i==last_jump){
                step_count++;
                last_jump = max_jump;
            }
        }
        return step_count;
    }


    public static void main(String[] args){
        int[] a = new int[]{2,3,1,1,1,1,3,1,0,1};
        JumpAray aray = new JumpAray();
        aray.jump(a);
    }






}
