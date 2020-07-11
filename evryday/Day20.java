package practice;
//统计字符串中大写字母个数
import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        System.out.print("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int bigCount = 0;
        for (int i = 0, len = str.length(); i < len; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }
        }
        System.out.println("大写字母:"+bigCount);
    }
}