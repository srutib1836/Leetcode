import java.util.Scanner;

class FirstOccurence {
    public int strStr(String haystack, String needle) {
        int in = 0;
        if (haystack.contains(needle)){
            in = haystack.indexOf(needle);
            return in;
        }
        else{
            return -1;
        }


    }
    public static void main (String args[]){
        System.out.println("Enter the haystack");
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        System.out.println("Enter the needle");
        String n = sc.nextLine();
        FirstOccurence ob = new FirstOccurence();
        int res = ob.strStr(h,n);

        System.out.println("The starting index is : " +res);
        sc.close();
    }
}