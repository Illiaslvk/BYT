public class Divide {
    private Operation operation;

    public Divide (Operation operation) {
        this.operation = operation;
    }

    public void divide(String equation) {
        if (!equation.contains("/")) {
            operation.handle(equation);
        } else {
            double d1 = Double.parseDouble(equation.substring(0, equation.indexOf("/")));
            double d2 = Double.parseDouble(equation.substring(equation.indexOf("/") + 1, equation.length()));
            System.out.println(d1 / d2);
        }
    }
}
