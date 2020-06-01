import java.util.Scanner;
//三个空水瓶换一个饮料，现有n瓶饮料一共可以喝多少杯饮料；
public class Day02first {
    public static int Max(int n){
        //先把手上的空瓶子三个为一组分好
        int k=0;
        while(n>=3){
            if(n%3==0){
                k=k+n/3;
                n=n/3;
            }else if(n%3>0){
                k=k+n/3;
                int t=n%3;
                n=n/3+t;
            }
        }
        if(n==2){
            k=k+1;
        }
        return k;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            if(num!=0){
                System.out.println(Max(num));
            }
        }
    }
}
