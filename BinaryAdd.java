import java.util.*;

class BinaryAdd {
    public String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        
        return Integer.toBinaryString(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary string:");
        String a = sc.next();
        System.out.println("Enter second binary string:");
        String b = sc.next();
        sc.close();

        BinaryAdd ob = new BinaryAdd();
        String res = ob.addBinary(a, b); 

        System.out.println("Addition: " + res);
    }
}