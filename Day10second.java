//设计一个算法实现两个超长整数相加
//import java.math.BigInteger;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.next().trim();
//        String b=sc.next().trim();
//        sc.close();
//        BigInteger x=new BigInteger(a);
//        BigInteger y=new BigInteger(b);
//        BigInteger z=x.add(y);
//        System.out.println(z.toString());
//    }
//}
import java.util.*;
import java.math.*;
public class Day10second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String a=sc.next();
            String b=sc.next();
            BigInteger sum=new BigInteger((a));
            BigInteger sum1=new BigInteger(b);
            BigInteger res=sum.add(sum1);
            System.out.println(res);
        }
    }
}