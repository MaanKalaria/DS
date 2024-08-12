//Write a program for evaluation of postfix Expression using Stack
import java.util.Stack;
import java.util.Scanner;
public class EvaluationOfPostfix {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String infix = sc.next();
        int val = 0;
        infix = infix + " ";
        while (infix.charAt(val) != ' ') {
            if (Character.isDigit(infix.charAt(val))) {
                st.push(Integer.parseInt("" + infix.charAt(val)));
            } else {
                int operand1 = st.pop();
                int operand2 = st.pop();
                int result = 0;
                if (infix.charAt(val) == '+') {
                    result = operand1 + operand2;
                } else if (infix.charAt(val) == '-') {
                    result = operand1 - operand2;
                } else if (infix.charAt(val) == '*') {
                    result = operand1 * operand2;
                } else if (infix.charAt(val) == '/') {
                    result = operand1 / operand2;
                } else if (infix.charAt(val) == '^') {
                    result = (int) Math.pow(operand2, operand1);
                } else {
                    System.out.println("invalid string");
                }
                st.push(result);
            }
            val++;
        }
        if(st.size()==1){
        System.out.println(st.pop());
        }
        else{
            System.out.println("invalid string");
        }
    }
}