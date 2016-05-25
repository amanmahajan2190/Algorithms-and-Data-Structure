package Sort;

/**
 * Created by AMAN on 5/6/2016.
 */
public class MergeSort {


    int[] number;
    int[] helper;
    public  MergeSort(int[] values){
        this.number= values;
        this.helper = new int[values.length];
    }

    public void MergeSort(int low , int high){
        if(low<high){
            int mid = low + (high-low)/2;

            MergeSort(low,mid);
            MergeSort(mid+1,high);
            merge(low,mid,high);

        }

    }

    public void merge(int low ,int mid ,int high){
        int a = low;
        int b=mid+1;

        for(int i=low;i<=high;i++){
            helper[i] = number[i];
        }
        int k =low;
        while(a<=mid && b<=high){

            if(helper[a]<helper[b]){

                number[k] = helper[a];
                a++;
            }else{
                number[k] = helper[b];
                b++;
            }
            k++;
        }
        while(a<=mid){
            number[k] =helper[a];
            a++;
            k++;
        }
        while (b<=high){
            number[k] =helper[b];
            b++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,3,6,2,5,1,3,5};
        MergeSort sort = new MergeSort(arr);
        sort.MergeSort(0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }

}

