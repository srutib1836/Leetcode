import java.util.*;

class SingleNum {
    public int singleNumber(int[] nums) {
        int sn = 0;
        for (int i = 0 ; i< nums.length ; i++){
            sn = sn ^ nums[i];
        }
        return sn;
    }
    public static void main(String args[]){
        System.out.println("Enter number of elements in array.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter array elements : ");
        int b [] = new int[a];
        for (int i = 0 ; i < a; i++){
            b[i] = sc.nextInt();
        }

        SingleNum ob = new SingleNum();
        int res = ob.singleNumber(b);
        
        System.out.println("Single number is : " +res);
        sc.close();
    }
}