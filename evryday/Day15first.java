package practice;

import java.util.Scanner;

//统计每个月兔子总数，三个月之后每只兔子生一个小兔子
public class Day15first {
    public static void main(String[] args) {
       int month;
       Scanner sc=new Scanner(System.in);
       System.out.println("几个月后的兔子数量，请输入月份:");
       month=sc.nextInt();
       int[]sums=new int[month];
       sums[0]=2;
       sums[1]=2;
        for (int i = 0; i <month; i++) {
            sums[i]=sums[i-1]+sums[i-2];
            System.out.println(("有"+sums[i]+"只兔子"));
        }
    }
}