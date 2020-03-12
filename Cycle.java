package 链表;

public class Cycle {
    static class ListNode {
        int val;
     ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
     public boolean hasCycle(ListNode head){
        //创建快慢指针来判断
         ListNode fast=head;
         ListNode slow=head;
         while(fast!=null&&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(fast==slow){
                 //判断两个节点是否是想同节点
                 return true;
             }
         }
         return false;
        }
    }
}

