package practice;
//木棒拼图
import java.util.*;
public class Day21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>list=new ArrayList<Integer>();//放的是木棒的长度
        for (int i = 0; i <n; i++) {
            int temp=sc.nextInt();
            //1:代表添加 2：代表删除
            if(temp==1){
                list.add(sc.nextInt());
            }else{
                int temp2=sc.nextInt();
                if(list.contains(temp2)){
                    //删除
                    list.remove((Object)temp2);
                    //remove()的参数若是int，代表的是删除此下表的值
                    //转为Object代表要删除的值
                }
            }
            //判断是否能组成简单多边形
            isPolygon(list);
        }
    }
    private static void isPolygon(List list){
        Collections.sort(list);//按升序排序
        int maxLen=(Integer)list.get(list.size()-1);//list.size()-1位置就是木棒最长的
        int len=0;//所有长度的总和
        for (int i = 0; i <list.size()-1; i++) {
            len+=(Integer)list.get(i);
        }
        //最长的>除过最长的其余长的的和 就可以组成简单多边形
        if(len>maxLen){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
