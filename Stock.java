import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int sn = prices[0]; 
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int current_price = prices[i];
            
            int current_profit = current_price - sn;
            
            if (current_profit > max_profit) {
                max_profit = current_profit;
            }
            
            if (current_price < sn) {
                sn = current_price;
            }
        }
        
        return max_profit;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements.");
        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("Cannot calculate profit with less than 2 days. Profit : 0");
            sc.close();
            return;
        }
        
        System.out.println("Enter prices.");
        int p [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            if (sc.hasNextInt()) {
                p[i] = sc.nextInt();
            } else {
                System.out.println("Invalid price entered. Exiting.");
                sc.close();
                return;
            }
        }

        Solution ob = new Solution();
        int res = ob.maxProfit(p);

        System.out.println("Profit : " + res);
        sc.close();
    }
}