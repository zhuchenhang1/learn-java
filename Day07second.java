//找出数组中最小的k个数
import java.util.*;
public class Day07second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int k=list.get(list.size()-1);
        list.remove(list.size()-1);
        int[] array=new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            array[i]=list.get(i);
        }
        Arrays.sort(array);
        for (int i = 0; i<k-1; i++) {
            System.out.print(array[i]+"");
        }
        System.out.println(array[k-1]);
    }
}
