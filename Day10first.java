//输入一行给定边长和组成正方形变得某种字符C，间隔一个空格，输出由字符C组成的正方形
import java.util.Scanner;
public class Day10first {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]str2=new String[str.length()];
        int pop=0;
        int low=0;
        for (int i = 0;i <str.length();i++) {
            if(str.charAt(i)!=' '){

            }else{
                str2[pop]="";
                for (int j = 0;j <i;j++) {
                    str2[pop]+=str.charAt(j);//获取截取的第一个字符串
                }
                pop++;
                low=i+1;
            }
        }
        str2[pop]="";
        for (int j=low;j<str.length();j++) {
            str2[pop]+=str.charAt(j);//获取截取的第一个字符串
        }
        int nums=Integer.parseInt(str2[0]);//边长转换为能用的整数
        String key=str2[1];
        for (int i = 0; i <(nums+1)/2; i++) {   //列数为四舍五入之后的数字
            if(i==0||i==(nums+1)/2-1){         //第一行和最后一行需要输出一整行
              for(int j=0;j<nums;j++){
                  System.out.print(key);
                }
              if(i==0){
                  System.out.println();    //第一行之后需要换行而最后一行不用
              }
            }else{
                for(int j=0;j<nums;j++){
                    if(j==0||j==nums-1){  //只有第一行和最后一个字符需要输出
                        System.out.print(key);
                    }else {
                        System.out.print(' ');
                    }
                }
                System.out.println();//每行输出完要换行
            }
        }
    }
}
