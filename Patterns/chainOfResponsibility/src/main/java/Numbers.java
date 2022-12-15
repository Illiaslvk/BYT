public class Numbers {
    private int num1;
    private int num2;

    private String calcFind;
    public Numbers(int newNum1,int newNum2, String newCalcFind){
        num1 = newNum1;
        num2 = newNum2;
        calcFind = newCalcFind;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getCalcFind() {
        return calcFind;
    }

}
