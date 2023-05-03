package arraylogics;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int array[] = {7,1,5,3,6,4};
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        buyAndSellStock.buyAndSell(array);
    }

    public void buyAndSell(int[] array) {
        int profit;
        int overallProfit = 0;
        int leastPrice = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < leastPrice){
                leastPrice = array[i];
            }
            profit = array[i]-leastPrice;
            if(overallProfit<profit){
                overallProfit = profit;
            }
        }
        System.out.println(overallProfit);
    }
}
