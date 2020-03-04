package 链表;

public class Delete {
    //给内部类加static,让内部类和List类相关,而和对象不相关
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    public ListNode Delete(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;//创建新链表的头尾节点,把不重复节点插入到新链表中
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                //短路求值,先判断后赋值
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                //上面while循环结束,就说明cur现在指向重复元素的最后一个元素
                cur = cur.next;
            } else {
                //把那些不重复的元素插入到新链表的后面
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
    }
}
