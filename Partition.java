package 链表;

public class Partition {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode partition(ListNode pHead,int x){
        if(pHead==null){
            return null;
        }
        if(pHead.next==null){
            return pHead;
        }
        ListNode BigHead=new ListNode( -1);//引入傀儡节点
        ListNode BigTail=BigHead;
        ListNode SmallHead=new ListNode(-1);
        ListNode SmallTail=SmallHead;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            //把大于X和小于X的数分别插入到两个链表
            if(cur.val<x){
                SmallTail.next=new ListNode(cur.val);
                SmallTail=SmallTail.next;
            }else{
                BigTail.next=new ListNode(cur.val);
                BigTail=BigTail.next;
            }
        }
        SmallTail.next=BigHead.next;
        return SmallHead.next;
        }
    }
}
