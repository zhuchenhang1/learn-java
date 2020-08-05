package practice;
//一串数中寻找最小的K个数
import java.util.ArrayList;
import java.util.Arrays;
public class Small {
public ArrayList<Integer>GetLeastNumbers_Solution(int[]input,int k){
   ArrayList<Integer>result=new ArrayList<Integer>();
   if(k>input.length){
       return result;
   }
   Arrays.sort(input);
    for (int i = 0; i <k; i++) {
        result.add(input[i]);
    }
    return result;
}
}
