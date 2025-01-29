import java.util.*;
public class buysell{
    public static int maximumProfit(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
               int profit= prices[i]-buyPrice;
               maxProfit=Math.max(maxProfit,profit);

            }
            else{
                buyPrice =prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }
}