package practice;
//满二叉树中任意两个结点的公共祖先
import java.util.*;
public class Day22 {
    public int getLCA(int a,int b){
        while(a!=b){
            if(a>b){
                a/=2;
            }else{
                b/=2;
            }
        }
        return a;
    }
}
