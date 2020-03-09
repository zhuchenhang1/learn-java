package 链表;

public class Charge {
    //给内部类加static,让内部类和List类相关,而和对象不相关
    static class ListNode {
        int val;
       ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public boolean chkPalindrome(ListNode A){
        int size=size(A);
        int steps=size/2;
        ListNode B=A;
            //1.找中间节点:
        for(int i=0;i<steps;i++){
          B=B.next;
        }
        //上面循环结束,B就指向A链表的中间节点了
            ListNode cur=B;
        ListNode pre=null;
        //2:从中间节点出发,对链表进行逆置操作
        while(cur!=null){
           ListNode next=cur.next;
           if(next==null){
               //说明此时cur指向链表末尾
               B=cur;
           }
           cur.next=pre;//逆置操作.让cur指向前一节点
           pre=cur;//更新pre
           cur=next;//更新cur
        }
        //3.分别从A和B出发,对两个链表的元素进行比较
            //如果是给出的A链表是奇数个元素,那么两个链表长度相等
            //如果是偶数个元素,那么B链表长度少一个,所以要拿B链表为基准
            while(B!=null){
                if(A.val!=B.val){
                    return false;
                }
                A=A.next;
                B=B.next;
            }
            return true;
        }
        public int size(ListNode A){
            ListNode cur=A;
            int size=0;
            while(cur!=null){
                cur=cur.next;
                size++;
            }
            return size;
        }
    }

}
