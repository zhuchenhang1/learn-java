package practice;
//微信红包，判断红包数组出现相同金额的次数是否大于红包总数的一半
import java.util.Arrays;
public class Day14first {
    public int getValue(int[]gifts,int n){
        Arrays.sort(gifts);
        int mid=gifts[n/2];
        int num=0;
        for (int i = 0; i <n; i++) {
            if(gifts[i]==mid){
                num++;
            }
        }
        return num>n/2?mid:0;
    }
}
