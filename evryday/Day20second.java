package practice;
//进制转换,16进制转换为10进制
import java.util.*;
public class Day20second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next().substring(2);
            int n=Integer.parseInt(s,16);
            System.out.println(n);
        }
    }
}
