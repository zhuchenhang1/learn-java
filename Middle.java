package 链表;

public class Middle {
    //给内部类加static,让内部类和List类相关,而和对象不相关
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode FindKthToTail(ListNode head, int k){
            if(head==null){
                return null;
            }
            int size=size(head);
            if(k<0||k>size){
                return null;
            }
            int steps=size-k;
           ListNode cur=head;
            for(int i=0;i<steps;i++){
                cur=cur.next;
            }
            return cur;
        }

        public int size(ListNode head) {
            //求链表长度
            int size = 0;
            ListNode cur = head;
            while (cur != null) {
                cur = cur.next;
                size++;
            }
            return size;
        }

    }
}