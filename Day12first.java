import java.util.Scanner;
//洗牌问题,总结规律，数组下标小于n/2时，洗牌后改元素下标改为2*原来下标
//当数组下标大于n/2时，洗牌后元素下标改为2*(下标-n)+1
public class Day12first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            while(m!=0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                int[]arr=new int[2*n];
                for(int i=0;i<2*n;i++){
                    int temp=i;
                    for(int j=0;j<k;j++){
                        if(temp<n){
                            //数组下标小于n/2时，洗牌后改元素下标改为2*原来下标
                      temp=2*temp;
                        }else{
                            //当数组下标大于n/2时，洗牌后元素下标改为2*(下标-n)+1
                            temp=2*(temp-n)+1;
                        }
                    }
                    arr[temp]=sc.nextInt();
                }
                //输出
                for(int i=0;i<2*n;i++){
                    if(i==2*n-1){
                        System.out.print(arr[i]);
                    }else{
                        System.out.print(arr[i]+" ");
                    }
                }
                System.out.println();
                m--;
            }
        }
    }
}
