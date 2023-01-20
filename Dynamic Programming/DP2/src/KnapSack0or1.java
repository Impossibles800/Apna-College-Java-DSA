public class KnapSack0or1 {
    public static int knapsack(int []wt, int []val, int W, int i){
        if(W == 0 || i == 0)
            return 0;
        if (wt[i-1]<=W){ //valid
//            include
            int ans1 = val[i-1] + knapsack(wt, val, W-wt[i-1], i-1);
//            exclude
            int ans2 =  knapsack(wt, val, W, i-1);
            return Math.max(ans1,ans2);
        }
        else {// not valid
            return knapsack(wt, val, W, i - 1);
        }
    }
    public static int memorization(int []wt, int []val, int W, int i, int dp[][]){
        if(W == 0 || i == 0)
            return 0;
        if (dp[i][W] != -1)
            return dp[i][W];
        if (wt[i-1]<=W){ //valid
//            include
            int ans1 = val[i-1] + memorization(wt, val, W-wt[i-1], i-1, dp);
//            exclude
            int ans2 =  memorization(wt, val, W, i-1, dp);
            dp[i][W] = Math.max(ans1,ans2);
            return dp[i][W];
        }
        else {// not valid
            dp[i][W] = memorization(wt, val, W, i - 1, dp);
            return dp[i][W];
        }
    }

    public static void main(String[] args) {
        int W = 7;
        int []wt = {2,5,1,3,4};
        int []val = {15,14,10,45,30};
        System.out.println(knapsack(wt, val, W, wt.length));
        int dp[][] = new int[val.length+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(memorization(wt,val,W,val.length,dp));
    }
}
