import java.util.Scanner;
    public class Calculator {
        public static int arithmetic(int op1, int op2, String operator) {
            switch (operator) {
                case "+":
                    return op1 + op2;
                case "-":
                    return op1 - op2;
                case "x":
                    return op1 * op2;
                case "/":
                    return op1 / op2;
                default:
                    return 0;
            }
        }

        public static int calculate(String expression) {
            String op1 = "";
            String op2 = "";
            String operator = "";
            for (char c : expression.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    if (operator.isEmpty()) {
                        op1 += c;
                    } else {
                        op2 += c;
                    }
                } else {
                    operator += c;
                }
            }

            return arithmetic(Integer.parseInt(op1), Integer.parseInt(op2), operator);
        }

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter an expression (or 'exit' to quit): ");
                String expression = scanner.nextLine();

                if (expression.equalsIgnoreCase("exit")) {
                    break;
                }

                else{
                    System.out.println(expression + " = " + calculate(expression));
                }
//            assert(calculate("23+5") == 28);
//            assert(calculate("123-7777") == -7654);
//            assert(calculate("15x3") == 45);
//            assert(calculate("153") == 45);

            }
        }
    }
