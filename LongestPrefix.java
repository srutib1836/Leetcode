import java.util.Scanner;
class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {

                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words in string.");
        int n = sc.nextInt();
        System.out.println("Enter words in array : ");
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine().toLowerCase();
        }
        LongestPrefix ob = new LongestPrefix();
        ob.longestCommonPrefix(a);
        sc.close();
    }
}