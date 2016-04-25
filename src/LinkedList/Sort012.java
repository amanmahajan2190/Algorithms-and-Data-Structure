package LinkedList;

/**
 * Created by AMAN on 4/16/2016.
 */
public class Sort012 {
    LinkedListOps ops;

    Sort012() {
        ops = new LinkedListOps();
    }

    public void createLL() {
        ops.addNode(new Node(0));
        ops.addNode(new Node(2));
        ops.addNode(new Node(1));
        ops.addNode(new Node(1));
        ops.addNode(new Node(0));
        ops.addNode(new Node(2));
    }

    public void sortLL() {
        int count0=0;
        int count1 =0;
        int count2=0;
        int size =ops.getSize();
        Node first =ops.top;
        for(int i=1;i<=size;i++){
            if(first.value==0){
                count0++;
            }
            if(first.value==1){
                count1++;
            }
            if(first.value==2){
                count2++;
            }
            first=first.next;
        }

        int k=1;
        first=ops.top;
        while (k<=count0){
            first.value =0;
            first=first.next;
            k++;
        }
        k=1;
        while (k<=count1){
            first.value =1;
            first=first.next;
            k++;
        }
        k=1;
        while (k<=count2){
            first.value =2;
            first=first.next;
            k++;
        }
        ops.printLinkedList();

    }
    public static void main(String[] args){
        Sort012 sort012 = new Sort012();
        sort012.createLL();
        sort012.sortLL();
    }


}


