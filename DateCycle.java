package 链表;

public class DateCycle {
    static class ListNode {
        int val;
       ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
        //使用快慢指针
        public ListNode dateCtCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&slow!=null){
            fast=fast.next.next;//快指针一次走两步,慢指针一次走一步,如果带环,则会相遇
            slow=slow.next;
            if(fast==slow){
                //相遇就跳出循环
                break;
            }
        }
            if (fast == null||slow==null){
                //说明不带换
                return null;
            }
            //创建两个节点,一个从链表头部出发,一个从相遇位置出发,再次相遇的位置就是入环第一节点
            ListNode cur1=head;
            ListNode cur2=fast;
            cur1=cur1.next;
            cur2=cur2.next;
            while(cur1!=cur2){
                cur1=cur1.next;
                cur2=cur2.next;
            }
            return cur1;
        }
    }
}
