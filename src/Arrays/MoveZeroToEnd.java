package Arrays;

/**
 * Created by AMAN on 5/9/2016.
 */
public class MoveZeroToEnd {
    int[] arr;
    int count = 0;
    MoveZeroToEnd(int[] values){
        this.arr =values;
    }

    public void moving(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length){
            arr[count ++]=0;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,9,0,6,5,4,0,6,0};
        MoveZeroToEnd end = new MoveZeroToEnd(arr);
        end.moving();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
