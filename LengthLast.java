import java.util.Scanner;

class LengthLast {

    public int lengthOfLastWord(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        String[] wordsArray = s.split("\\s+");

        return wordsArray[wordsArray.length - 1].length();
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        LengthLast ob = new LengthLast();
        int res = ob.lengthOfLastWord(str);

        System.out.println("Length: " + res);
        
        sc.close();
    }
}
