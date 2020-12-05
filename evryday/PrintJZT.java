public class PrintJZT{
        public static void main(String[]args){
            int n=5;
//先循环打印行数
            for(int i=0;i<5;i++){
//再循环打印空格n-i-1;
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
//循环打印字符；
                for(int j=0;j<i+1;j++){
                    System.out.print("1 ");
                }
                System.out.println();
            }
        }
    }

