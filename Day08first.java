import java.util.Scanner;
public class Day08first {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int i=0;
        for(;i<N;i++){
            if(fib(i)>=N){
                break;
            }
        }
        int p=Math.abs(fib(i)-N);
        int q=Math.abs(fib(i-1)-N);
        if(p>q){
            System.out.println(q);
        }else{
            System.out.println(p);
        }
    }
    private static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
