import org.junit.Test;

public class TestAll {
    @Test
    public static void main(String[] args) {
        Chain chainCalc1 = new Add();
        Chain chainCalc2 = new Subtract();
        Chain chainCalc3 = new Multiply();
        Chain chainCalc4 = new Divide();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(5,2,"mult");

        chainCalc1.calculate(request);
    }
}
