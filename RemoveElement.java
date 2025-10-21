import java.util.*;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]){
        System.out.println("Enter the number of elements in array.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input array elements : ");
        int array [] =new int [n];
        for (int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter value to be removed.");
        int v = sc.nextInt();
        RemoveElement ob = new RemoveElement();
        int res = ob.removeElement(array, v);

        System.out.println("Array with removed element is : " +res);
        sc.close();
    }
}