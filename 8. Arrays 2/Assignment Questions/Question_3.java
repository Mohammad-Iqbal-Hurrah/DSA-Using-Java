/*You are given an array prices where prices[i] is the price of a given stock on 
the ith day. 
Return the maximum profit you can achieve from this transaction. If you cannot 
achieve any profit, return 0. 
 
Example: 
Input: 
prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
Explanation:  
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
Note that buying on day 2 and selling on day 1 is not allowed because 
you must buy before you sell. */

public class Question_3 {

    //Buy and Sell Stocks 
    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        System.out.println("Question 3 of arrays: ");
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Possible Profit: " + maxProfit(prices));
    }
}
