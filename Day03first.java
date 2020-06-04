import java.util.Scanner;
//读入一个字符串，输出字符串中连续最长的数字串
public class Day03first {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        int count=0;//当作计算器
        char[]arr=str.toCharArray();//转换为字符数组；
        for(int i=0;i<arr.length;i++){
            if('0'<=arr[i]&&arr[i]<='9'){
                //说明这些字符是数字
                count=1;//初始化计算器
                int index=i;
                for(int j=i+1;j<arr.length;j++){
                    if('0'<arr[j]&&arr[j]<='9'){
                        count++;
                        index=j;
                    }else{
                        break;
                    }
                }if(count>result.length()){
                    result=str.substring(i,index+1);//返回i到index位置的字符串；
                }
            }else{
                continue;
            }
        }
    System.out.println(result);
    }
}




