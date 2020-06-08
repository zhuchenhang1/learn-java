//用两个栈来实现一个队列，完成队列的pop和Push操作；
import java.util.Stack;
public class Day05 {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    //入栈函数
    public void push(int num){
        stack1.push(num);
    }
    //出栈函数
    public int pop(){
        Integer re=null;
    if(!stack2.empty()){
        //如果栈2非空，那么就把栈顶元素取出来出栈
        re=stack2.pop();
    }else{
        //如果栈2为空，就把栈1里面的数一个一个取出来放到栈2中；
        while(!stack1.empty()){
            re=stack1.pop();
            stack2.push(re);
        }
        //栈2非空之后，再次把里面的元素出栈
        if(!stack2.empty()){
            re=stack2.pop();
        }
    }
    return re;
    }
}
