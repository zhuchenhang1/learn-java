package practice;

public class Day19 {
    public int calculateMax(int[] prices) {
    int len=prices.length;
    int[] iprofit=new int[len];
    int[] rprofit=new int[len];
    int mprofit=0;
    int minprice=prices[0];
    iprofit[0]=0;
    int temp;
    for(int i=1;i<len;i++){
        if(prices[i]<minprice){
            minprice=prices[i];
        }
        if((temp=prices[i]-minprice)>mprofit){
            mprofit=temp;
        }
        iprofit[i]=mprofit;
    }
    mprofit=0;
    rprofit[len-1]=0;
    int maxprice=prices[len-1];
    for(int j=len-2;j>=0;--j){
        if(maxprice<prices[j]){
            maxprice=prices[j];
        }
        if(mprofit<(temp=maxprice-prices[j])){
            mprofit=temp;
        }
        rprofit[j]=mprofit;
    }
    mprofit=0;
    for(int k=0;k<len;++k){
        if((temp=iprofit[k]+rprofit[k])>mprofit){
            mprofit=temp;
        }
    }
    return mprofit;
    }
}
