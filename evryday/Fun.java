import java.util.ArrayList;
import java.util.List;
public class Fun {
    public static void main(String[]args){
        String str=null;
        boolean status=true;
        //一.快速定义变量

        int i = 10;//快捷输入10.var;
        double v = 8.88;//快捷输入8.88.var

        //二.快速构造判断 语句
        if (str == null) {
             //快捷输入 str.null
        }
        if (str != null) {
            //快捷输入 str.notnull或者str.nn
        }

       //三.for遍历集合或者数组
        List<String> list=new ArrayList<>();
        for (String s : list) {
            //快捷输入：list.for
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            //快捷输入：list.fori
        }
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            //快捷输入：list.forr
        }
        //四.NOT取反
       // !status
    //快捷输入：statu.not
        //五.if判断
        if (i>10) {
            //快捷输入：i>10.if
        }
    }
}
