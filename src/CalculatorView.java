
import java.util.Scanner;

public class CalculatorView {
    private Number firstNum;
    private Number secondNum;
    private Character operand;

    Scanner scanner = new Scanner(System.in);
    public CalculatorView(){

    }

    public Number getFirstNum() {
        return firstNum;
    }

    public Character getOperand() {
        return operand;
    }

    public Number getSecondNum() {
        return secondNum;
    }

    public void display(){

        while (true) {
            System.out.println("Введите действие: \n");

            String[] arr = scanner.nextLine().split(" ");
            if(arr.length != 3){
                System.out.println("Неправильно введено действие");
                continue;
            }


            try {
                firstNum = Double.parseDouble(arr[0]);
            }
            catch (Exception e){
                System.out.println("Вы ввели неверно первую цифру");
                continue;
            }


                operand = arr[1].charAt(0);
            if(operand != '+' && operand != '-' && operand != '*' && operand != '/' ){
                System.out.println("Вы ввели неверно знак арифметической операции");
                continue;
            }

            try {
                secondNum = Double.parseDouble(arr[2]);

                if(secondNum.intValue() == 0 && operand == '/'){
                    System.out.println("На ноль не делят");

                }
                else{break;}

            }
            catch (Exception e){
                System.out.println("Вы ввели неверно вторую цифру");

            }




        }

    }
    public void printResult(Number result){
        System.out.println();

        Integer a = result.intValue();
        Double c = Double.parseDouble(a.toString());

        Double b = result.doubleValue();
        if(b.equals(c)){
            System.out.println(a);
        }
        else {

            System.out.println(result);
        }




    }

}
