import java.util.*;
public class Day01first {
//将第二行字母插入到第一行字母当中，判断能构成回文串的方法数。
    public static boolean huiwen(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++){
            StringBuilder sb=new StringBuilder(str1);
            sb.insert(i,str2);//从0号位置开始插入
            if(huiwen(sb.toString())){
                //说明是回文，计数加一；
                count++;
            }
        }
        System.out.println(count);
    }
}
