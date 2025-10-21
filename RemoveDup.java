import java.util.Scanner;


class RemoveDup {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers (for a sorted array):");
        
        try {
            int n = sc.nextInt();
            int[] nums = new int[n]; 

            System.out.println("Enter the sorted array elements (e.g., 1 1 2 2 3):");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            RemoveDup ob = new RemoveDup();
            int newLength = ob.removeDuplicates(nums); 

            System.out.println("--- Result ---");
            System.out.println("New length of array with unique elements: " + newLength);
            
            System.out.print("Array after removing duplicates (first " + newLength + " elements are unique): ");
            for(int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + (i == newLength - 1 ? "" : " "));
            }
            System.out.println();
            
        } catch (Exception e) {
             System.out.println("An error occurred during input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}