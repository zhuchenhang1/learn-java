package 链表;

public class ToLists {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode mergeToLists(ListNode l1, ListNode l2) {
            //按照升序排列两个链表
            if (l1 == null) {
                //链表1为空,组合起来就是l2
                return l2;
            }
            if (l2 == null) {
                //链表2为空,组合起来就是l1
                return l1;
            }
            ListNode cur1 = l1;
            ListNode cur2 = l2;
            ListNode NewHead = null;//新的链表存放合并好的链表
            ListNode NewTail = null;//链表尾插需要遍历链表,找到链表末尾才能插入
            // 为了方便,用NewTail把链表末尾记录下来
            while (cur1 != null && cur2 != null) {
                if (cur1.val < cur2.val) {
                    //那就将cur1插入到新链表末尾
                    //需要考虑两种情况,新链表末尾NewTail是否为空
                    if (NewTail == null) {
                        NewHead = cur1;
                        NewTail = cur1;
                    } else {
                        NewTail.next = cur1;
                        NewTail = NewTail.next;//更新NewTail的位置
                    }
                    cur1 = cur1.next;
                } else {
                    //那就将cur2插入到新链表末尾
                    //需要考虑两种情况,新链表末尾NewTail是否为空
                    if (NewTail == null) {
                        NewHead = cur2;
                        NewTail = cur2;
                    } else {
                        NewTail.next = cur2;
                        NewTail = NewTail.next;//更新NewTail的位置
                    }
                    cur2 = cur2.next;
                }
            }
            //当循环结束时,说明cur1和cur2有一个走到了末尾
            //把没走到末尾的剩下的链表都连在新链表末尾NewTail的后面
            if (cur1 == null) {
                NewTail.next = cur2;
            } else {
                NewTail.next = cur1;
            }
            return NewHead;
        }
    }
}
