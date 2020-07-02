package practice;
import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n<2||n>=100){
                break;
            }
            int square=n*n;
            if(n<10){
                if((square-n)%10==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if((square-n)%100==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
