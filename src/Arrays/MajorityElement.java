package Arrays;

/**
 * Created by AMAN on 4/28/2016.
 */
public class MajorityElement {
    int maj_count=0;
    int maj_element =0;
    int maj_index =0;

    public MajorityElement(){

    }

    public void findMajority(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i==0){
                maj_count=1;
                maj_element=arr[i];
                maj_index=0;
            }else{
                if(arr[i]==maj_element){
                    maj_count++;
                }else{
                    maj_count--;
                    if(maj_count==0){
                        maj_element=arr[i];
                        maj_index=i;
                        maj_count++;
                    }
                }
            }
        }
        System.out.println("Majority emlement is" +maj_element);
    }

    public static void main(String[] args){
        MajorityElement element = new MajorityElement();
        int[] a = new int[]{4,5,5,5,6,7,8,5,6,5,8,5,5,5,9,0};
        element.findMajority(a);
    }

}
