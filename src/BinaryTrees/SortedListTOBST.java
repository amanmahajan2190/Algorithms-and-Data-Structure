package BinaryTrees;

/**
 * Created by AMAN on 8/3/2016.
 */
public class SortedListTOBST {
    public TreeNode sortedListToBST(ListNode head) {
        int size =0;
        ListNode temp= head;
        while(temp !=null){
            size++;
            temp = temp.next;
        }
        if(size<=0){
            return null;
        }
        temp = head;

        int[] a = new int[size];
        int i=0;
        while(temp !=null){
            a[i++] = temp.val;
            temp = temp.next;
        }
        return createTree(a,0,a.length-1);
    }

    public TreeNode createTree(int[] nums, int low , int high){
        if(low<=high){
            int mid = low + (high-low)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = createTree(nums,low,mid-1);
            root.right = createTree(nums,mid+1, high);
            return root;
        }
        return null;
    }

    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        TreeNode node = new SortedListTOBST().sortedListToBST(n1);
    }
}
