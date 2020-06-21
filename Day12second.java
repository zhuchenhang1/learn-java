import java.util.Scanner;
//读入N名学生的成绩，将获得某一给定分数的学生人数输出。
public class Day12second {
    public static void main(String[] args) {
        int[] arrScor=new int[101];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            int x=sc.nextInt();
            arrScor[x]++;
        }
        int find=sc.nextInt();
        while(find!=0){
            int temp=sc.nextInt();
            if(find!=1){
                System.out.print(arrScor[temp]+" ");
            }else{
                System.out.print(arrScor[temp]);
            }
            find--;
        }
    }
}
