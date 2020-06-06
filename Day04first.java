//买苹果，店家包装六个为一袋和八个为一袋，想购买任意n个苹果，怎样买的袋数最少
import java.util.*;
public class Day04first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
        int n=sc.nextInt();
        System.out.println(count(n));
    }
    }
    public static int count(int n){
        if(n%2!=0||n==10||n<6){//要至少是偶数，其次要比6大，10以上的偶数都可以满足条件
            return -1;
        }else if(n%8==0){
            return n/8;
        }
        return 1+n/8;
    }
}
