//Buy and Sell Stocks Problem 
public class  BuyAndSellStocks {
    //Buy And Sell Stocks 
    public static int BuySellStocks(int stocks[]){  //time complexity = O(n)
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;
        
        //loop too calculate max profit 
        for(int i =0; i<stocks.length;i++){
            //if profit is applicable 
            if(buyPrice<stocks[i]){
                int profit = stocks[i]-buyPrice;             //calculate current day profit 
                maxProfit = Math.max(maxProfit, profit);    //update max profit 
            }
            //else update buyprice to the current stock price 
            else{
                buyPrice = stocks[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        System.out.println("Max Profit = "+BuySellStocks(stocks)); 
    }
}
