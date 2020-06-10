//求两个数的最小公倍数
//方法一
import java.util.Scanner;
public class Day06second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 0, max = 0;
        if (m > n) {
            //默认m<n;
            int t = m;
            m = n;
            n = t;
        }
        for (int i = 1; i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                max = i;
            }
        }
        min = m * n / max;
        while (max != 0) {
            System.out.println("最大公倍数为" + min);
        }
    }
}



//方法2  辗转相除法
//import java.util.Scanner;
//public class Day06second{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int z=m*n;//计算此时的m*n
//        int max=0,min=0;
//        if (m > n) {
//            int t=m;
//            m=n;
//            n=t;
//        }
//        int r=n%m;
//        while(m!=0){
//            r=n%m;
//            n=m;
//            m=r;
//        }
//        min=z/n;
//        System.out.println("最小公倍数为"+min);
//    }
//}