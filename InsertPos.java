import java.util.Scanner;

class InsertPos {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements in the sorted array: ");
        int n = sc.nextInt();
        
        System.out.println("Enter sorted elements in the array:");
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter target: ");
        int t = sc.nextInt();
        
        InsertPos ob = new InsertPos();
        int res = ob.searchInsert(a, t);

        System.out.println("Result index: " + res);
        
        sc.close();
    }
}