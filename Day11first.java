//输入十个非负整数，返回组成的最小的数
import java.util.Scanner;
public class Day11first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]times=new int[10];
        for (int i= 0; i <10; i++) {
            times[i]=sc.nextInt();
        }
        sc.close();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <10; i++) {
            if(times[i]!=0){
                sb.append(i);
                times[i]--;
                break;
            }
        }
        for(int j=0;j<10;j++){
            while(times[j]!=0){
                sb.append(j);
                times[j]--;
            }
        }
        System.out.println(sb);
    }
}
