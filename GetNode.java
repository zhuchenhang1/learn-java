package 链表;

public class GetNode {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
     //求链表长度方法
        public int size(ListNode A){
          ListNode cur=A;
            int size=0;
            while(cur!=null){
                cur=cur.next;
                size++;
            }
            return size;
        }
        public ListNode getInterSectionNode(ListNode headA,ListNode headB){
            int size1=size(headA);
            int size2=size(headB);
            while(headA!=null&&headB!=null){
                if(size1>size2){
                    int offset=size1-size2;
                    for(int i=0;i<offset;i++){
                        headA=headA.next;
                    }
                }else{
                    int offset=size2-size1;
                    for(int i=0;i<offset;i++){
                        headB=headB.next;
                    }
                }
                //此时两个链表起点一样了
            }
           while(headA!=null&&headB!=null) {
               //比较节点是不是相同对象
               if(headA==headB){
                   return headA;
               }
               headA=headA.next;
               headB=headB.next;

           }
          return null;
        }
    }
}
