public class BuyAndSell {
    private int[] price = new int[]{4,2,8,3,9,12,5,27,6,14,23,17};
    public int findProfit(){
        int profit = 0;
        int buy = 0;
        int sell = 0;
        for(int i = 0;i<price.length;i++){
            for(int j = 0;j<price.length;j++){
                if(profit<(price[j]-price[i])){
                    profit = price[j]-price[i];
                    buy = i+1;
                    sell=j+1;
                }
            }
        }
        System.out.println("Buy on day "+buy);
        System.out.println("Sell on day "+sell);
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSell buyandsell = new BuyAndSell();
//        buyandsell.getInput();
        System.out.println("Profit : " + buyandsell.findProfit());
    }
}