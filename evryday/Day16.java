package practice;

public class Day16<struct> {
    struct ListNode{
        int val;
         ListNode next=null;
         ListNode(int val){

    }
    public ListNode plusAB(ListNode a,ListNode b){
        if(a==null&&b==null){
            return null;
        }
            int flag=0;
            int sum=0;
            int val_new=0;
            ListNode pHead=new ListNode(0);
            ListNode node=pHead;
            while(a!=null||b!=null||flag!=0){
                int val_a=a!=null?a->val:0;
                int val_b=b!=null?b->val:0
            }
        }
    }
}
