import java.util.Arrays;

//给一个整数N，返回一个N位的格雷码
public class Day09 {
    public String[] getGray(int n) {
        String[] result = new String[(int) Math.pow(2, n)];
        if (n == 1) {
            result[0] = "0";
            result[1] = "1";
            return result;
        }
            String[] last = getGray(n - 1);
System.out.println(Arrays.toString(last));
for(int i=0;i<last.length;i++){
    result[i]="0"+last[i];
    result[result.length-i-1]="1"+last;
        }
return result;
    }
}
