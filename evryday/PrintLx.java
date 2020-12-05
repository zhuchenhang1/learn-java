public class PrintLx {
    public static void main(String[]args){
        int n=3;
        //先打印前三行;
        for(int i=0;i<3;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
        //System.out.println();
        //在打印后两行；
        for(int i=4;i<6;i++){
            for(int j=0;j<i-n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<6-i;j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
