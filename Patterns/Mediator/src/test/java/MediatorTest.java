import org.junit.Test;

public class MediatorTest {

    @Test
    public void Calc() {
        Operation operation = new Operation();
        Add add = new Add(operation);
        Substract substract = new Substract(operation);
        Multiply multiply = new Multiply(operation);
        Divide divide = new Divide(operation);

        operation.setOps(add,substract,multiply,divide);


        add.add("6 / 2");
    }
}
