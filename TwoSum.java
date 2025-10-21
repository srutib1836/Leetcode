import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) 
            {
                if (i != j && nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // return empty array if no solution found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a number to sum for:");
        int t = sc.nextInt();

        TwoSum sol = new TwoSum();        // create object
        int[] result = sol.twoSum(a, t);      // call method on object

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
        sc.close();
    }
}
