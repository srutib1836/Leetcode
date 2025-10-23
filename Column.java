import java.util.*;
class Column {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            result = letter + result;
            columnNumber = columnNumber / 26;
        }
        return result;       
    }
    public static void main(String args[]){
        System.out.println("Enter column numb er.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Column ob = new Column();
        String res = ob.convertToTitle(n);

        System.out.println("Column Title : "+res);
        sc.close();
    }
}