import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class ExpressionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

        System.out.println("Welcome to Expression Calculator!");
        System.out.println("Enter expressions like 19+10+10 or 10*2-5/5");
        System.out.println("Type 'exit' to quit.\n");

        while (true) {
            System.out.print("Enter expression: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break;
            }

            try {
                Object result = engine.eval(input);
                System.out.println("Result: " + result);
            } catch (ScriptException e) {
                System.out.println("Invalid expression. Try again.");
            }
        }

        scanner.close();
    }
}