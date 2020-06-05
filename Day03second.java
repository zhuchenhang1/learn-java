import java.util.*;
//对于一个字符串，判断其是否为一个合法的括号串,public class Parenthesis{}
public class Day03second {
public boolean chkParenthesis(String A,int n){
    Stack<Character> s=new Stack<>();
    char[]c=A.toCharArray();
    for (int i = 0; i <n ; i++) {
        if(c[i]=='('){
            s.push('(');
        }else if(c[i]==')'){
            //考虑到栈空
            if(s.size()==0){
                return false;
            }else{
                s.pop();
            }
        }else{
            return false;
        }
    }
    if(s.size()!=0){
        return false;
    }else{
        return true;
    }
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=s.length();
    System.out.println(new Day03second().chkParenthesis(s,n));
}
}
