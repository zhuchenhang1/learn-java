package practice;
//输出最大字符串
import java.util.Scanner;
public class LongString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String result=" ";
        int count=0;
        char[]arr=string.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            if('0'<=arr[i]&&'9'>=arr[i]){
                count=1;
                int index=i;//在后面的循环存储截至索引
                for (int j = 0; j <arr.length; j++) {
                    if('0'<=arr[i]&&'9'>=arr[i]){
                        count++;
                        index=j;
                    }else{
                        break;
                    }
                }if(count>result.length()){
                    result=string.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}
