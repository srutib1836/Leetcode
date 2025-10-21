import java.util.Scanner;

class Parenthesis {
    private int top = -1;
    private char[] stack;

    private void push(char val) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = val;
        }
    }

    private char pop() {
        if (top == -1) {
            return '\0';
        }
        char val = stack[top];
        top--; 
        return val;
    }
    
    private char peek() {
        if (top == -1) {
            return '\0';
        }
        return stack[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public boolean isValid(String s) {
        this.stack = new char[s.length()];
        this.top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {
                
                if (isEmpty()) {
                    return false;
                }
                
                char topChar = peek();

                if ((topChar == '(' && c == ')') || 
                    (topChar == '{' && c == '}') || 
                    (topChar == '[' && c == ']')) 
                {
                    pop();
                } 
                else {
                    return false;
                }
            }
        }
        
        return isEmpty(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a parenthesis expression to check its validity:");
        String exp = sc.nextLine();
        
        Parenthesis ob = new Parenthesis(); 
        
        boolean result = ob.isValid(exp);
        
        System.out.println("The expression \"" + exp + "\" is " + (result ? "Valid" : "Invalid") + ".");
        sc.close();
    }
}