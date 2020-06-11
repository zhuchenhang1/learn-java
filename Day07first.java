//一个数组中每隔两个数字删除一个，求最后一个被删除的数的原始下标位置。
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Day07first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for (int i = 0; i <arr.length; i++) {
                arr[i]=i;
            }
            System.out.println(delete(arr));
        }
        sc.close();
    }
    public static int delete(int[]arr){
        Queue<Integer>queue=new LinkedList<>();
        for (int i = 0; i <arr.length; i++) {
            queue.add(arr[i]);
        }
        while(queue.size()!=1){
            int count=0;
            while(count!=2){
                queue.add(queue.peek());
                queue.poll();
                count++;
            }
            queue.poll();
        }
        return queue.element();
    }
}
