public class CalculatorModel {
    private Number firstNum = 0;
    private Number secondNum = 1;
    private Character operand;

    public CalculatorModel(){

    }

    public void setFirstNum(Number firstNum){
        this.firstNum = firstNum;
    }

    public void setSecondNum(Number secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperand(Character operand) {
        this.operand = operand;
    }

    public Number calculate(){
        Number result = 0;

        switch (operand){
            case '+':
                NumSum numSum = new NumSum();
                result = numSum.sum(firstNum,secondNum);
                break;
            case '-':
                NumDiff numDiff = new NumDiff();
                result = numDiff.diff(firstNum,secondNum);
                break;
            case '*':
                NumComp numComp = new NumComp();
                result = numComp.Comp(firstNum,secondNum);
                break;
            case '/':
                NumDiv numDiv = new NumDiv();
                result = numDiv.div(firstNum,secondNum);
                break;

        }

        return result;
    }
}
