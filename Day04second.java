//输入两个字符串，从第一个字符串中，删除第二个字符串中的所有字符。
import java.util.Scanner;
public class Day04second {
    public void delete(String s1,String s2){
        for(int i=0;i<s2.length();i++){
            int index=0;
            while((index=s1.indexOf(s2.charAt(i)))!=-1){
                s1=s1.substring(0,index)+s1.substring(index+1);
            }
        }
        System.out.println("删除后的字符串为："+s1);
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String s1=sc.next();
        System.out.println("请输入第二个字符串");
        String s2=sc.next();
        Day04second d=new Day04second();
        d.delete(s1,s2);
    }
}
