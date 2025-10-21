import java.util.Scanner;
class SquareRoot {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x / 2;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) result;
    }

    public static void main(String args[]){
        System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        SquareRoot ob = new SquareRoot();
        int res = ob.mySqrt(n);

        System.out.println("Square root is : " +res);
    }
}
