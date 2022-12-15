public class Divide implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcFind() == "div"){
            System.out.println(request.getNum1() + " / " + request.getNum2() + " = " + (request.getNum1()/request.getNum2()));
        }else {
            System.out.println("Only for add, subtract,multiply,divide");
        }

    }
}
