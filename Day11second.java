//验证尼科彻斯定理，任何一个整数的立方都可以携程m个连续奇数之和；
import java.util.*;
public class Day11second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getStr(n));
        sc.close();
    }
    public static String getStr(int n){
        int tar=n*n*n;
        int mid=n*n;
        StringBuilder sb=new StringBuilder();
        int sum=0,dis=mid%2==0?-1:0;
        while(dis<=tar){
            if(dis==0){
                sum+=mid;
                if(sum==tar){
                    break;
                }
                sum+=2*mid;
                dis+=2;
            }
            for(int i=mid-dis;i<=mid+dis;i+=2) {
                if (i == mid + dis) {
                    sb.append(i);
                } else {
                    sb.append(i + "+");
                }
            }
        }
        return sb.toString();
    }
}
//import java.util.Scanner;
//public class Main{
//    Scanner sc=new Scanner(System.in);
//   while(sc.hasNextInt()){
//        int n=sc.nextInt();
//        int res=n*n*n;
//        int mid=n*n;
//        StringBuffer sb=new StringBuffer();
//        int begin=mid+1-n;
//        int end=mid-1+n;
//        for(;begin<=end;begin+=2){
//            if(begin==end){
//                sb.append(begin);
//                break;
//            }
//            sb.append(begin+"+");
//        }
//        System.out.println(sb.toString());
//    }
//   sc.close();
//}
