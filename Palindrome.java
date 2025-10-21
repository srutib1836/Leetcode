import java.util.*;
class Palindrome {
    public boolean isPalindrome(int x) {
        int d = x, r=0;
        while(x>0)
        {
            int a =x%10;
            r = r*10+a;
            x/=10;
        }
        if ( d == r)
            return true;
        else
            return false;
    }
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindrome s = new Palindrome();
        if (s.isPalindrome(n) == true)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
    
}