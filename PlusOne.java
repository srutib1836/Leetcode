import java.util.Scanner;
import java.util.Arrays;

class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits; 
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int na [] = new int [n.length()];

        for(int i = 0 ; i < n.length(); i++){
            na[i] = n.charAt(i) - '0';
        }       

        PlusOne ob = new PlusOne();
        int[] res = ob.plusOne(na);

        System.out.println(Arrays.toString(res));
        sc.close();
    }
}