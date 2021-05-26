class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];
        
        // Solution 1
        // 
        // 최대 이익을 찾기위한 2중 포문
        // 당연히 n^2의 시간복잡도로 아웃
        /*
            for(int i=0; i<prices.length; i++){
                for(int j=i+1; j<prices.length; j++) {
                    if(prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
        */
        
        // Solution 2
        // for문을 한번만 쓰면서 값을 찾도록 수정
        for(int i=0; i<prices.length; i++) {
            // minValue가 현재 값보다 작으면 minValue로 넣고
            // 현재 값보다 크면 profit 보고 maxprofit과 비교
            // 같은 값 무시
            if(prices[i] < minValue) {
                minValue = prices[i];
            } else if (prices[i] > minValue) {
                int curProfit = prices[i] - minValue;
                if(curProfit > maxProfit) {
                    maxProfit = curProfit;
                }
            }
            
        }
        
        return maxProfit;
    }
}