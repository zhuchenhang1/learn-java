package 链表;

public class List {
    //给内部类加static,让内部类和List类相关,而和对象不相关
    static class ListNode{
         int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeElements(ListNode head,int val){
//删除头部节点和删除中间节点,要分开来对待
        //先删除中间节点,最后再考虑删除头部节点(这样只需要处理一次头部节点)
        if(head==null){
            //空链表情况
            return null;
        }
   ListNode pre=head;
   ListNode cur=head.next;
   //1.首先考虑删除中间节点情况
       while(cur!=null){
           if(cur.val==val){
         pre.next=cur.next;
         cur=pre.next;
           }else {
               pre = pre.next;
               cur = cur.next;
           }
       }
   //2.考虑删除头结点的情况
   if(head.val==val){
       head=head.next;
   }
   return head;
    }
}
