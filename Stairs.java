import java.util.*;

class Stairs {
    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1; 
        int b = 2; 
        int currentWays = 0;

        for (int i = 3; i <= n; i++) {
            currentWays = a + b;
            a = b;
            b = currentWays;
        }
        
        return currentWays;
    }

    public static void main(String args[]){
        System.out.println("Enter steps.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        Stairs ob = new Stairs();
        int res = ob.climbStairs(num);

        System.out.println("Ways to climb : " + res);
    }
}