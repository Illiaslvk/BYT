public class Operation {
    private Add add;
    private Substract substract;
    private Multiply multiply;
    private Divide divide;

    public void setOps(Add add, Substract substract, Multiply multiply, Divide divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public void handle(String equation) {
        if (equation.contains("+")) {
           add.add(equation);
        }
        if (equation.contains("-")) {
            substract.substract(equation);
        }
        if (equation.contains("*")) {
            multiply.multiply(equation);
        }
        if (equation.contains("/")) {
            divide.divide(equation);
        }
        else {
            System.out.println("Error input");;
        }
    }
}
