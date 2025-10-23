import java.util.*;

class Palindromestr {
    public boolean isPalindrome(String s) {
        String ns = "";
        String rs = "";

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c)){ 
                ns += c;
            }
        }

        for (int i = ns.length() - 1 ; i >= 0; i--){
            rs += ns.charAt(i);
        }

        return ns.equals(rs);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string.");
        
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }
        
        String a = sc.nextLine().toLowerCase(); 

        Palindromestr ob = new Palindromestr();
        boolean res = ob.isPalindrome(a);
        
        System.out.println("Palindrome result: " + res);

        sc.close();
    }    
}
/*
 * import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String ns = "";
        String rs = "";

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (Character.isLetterOrDigit(c)){ 
                ns += Character.toLowerCase(c);
            }
        }

        for (int i = ns.length() - 1 ; i >= 0; i--){
            rs += ns.charAt(i);
        }

        return ns.equals(rs);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string.");
        
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }
        
        String a = sc.nextLine().toLowerCase(); 

        Solution ob = new Solution();
        boolean res = ob.isPalindrome(a);
        
        System.out.println("Palindrome result: " + res);

        sc.close();
    }    
}
 */