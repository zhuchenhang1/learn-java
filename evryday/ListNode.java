package practice;
//链表分割，给定值小于X的排在X的左边，大于X的排在X的右边
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode bigHead = new ListNode(-1);//创建两个新的傀儡节点的新链表
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;
        for (ListNode cur = pHead; cur != null; cur = cur.next) {
            if (cur.val < x) {
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            } else {
                bigTail.next = new ListNode((cur.val));
                bigTail = bigTail.next;
            }
        }
        //将小链表和大链表首尾连接到一块
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}