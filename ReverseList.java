package 链表;

public class ReverseList {
    //给内部类加static,让内部类和List类相关,而和对象不相关
    static class ListNode{
        int val;
       ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverselist(ListNode head){
        if(head==null){
            //空链表
            return null;
        }
        if(head.next==null){
            //链表中只有一个元素,不需要逆置
            return head;
        }
        ListNode newhead=null;
      ListNode cur=head;
      ListNode pre=null;
      while(cur!=null){
          ListNode next=cur.next;
          if(next==null){
              //当前cur就是原链表的末尾
             cur=newhead;//原链表的末尾变成新链表的开始
          }
          cur.next=pre;//逆置链表核心操作
          pre=cur;
          cur=next;
      }
      return newhead;
    }
}

