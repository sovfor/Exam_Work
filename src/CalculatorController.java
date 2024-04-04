import java.util.Scanner;

public class CalculatorController {
    Scanner scanner = new Scanner(System.in);
    public CalculatorController(){

    }

    CalculatorModel calculatorModel = new CalculatorModel();
    CalculatorView calculatorView = new CalculatorView();

    public void start(){
        boolean isEnd = false;
        while(!isEnd) {

            calculatorView.display();

            calculatorModel.setFirstNum(calculatorView.getFirstNum());
            calculatorModel.setSecondNum(calculatorView.getSecondNum());
            calculatorModel.setOperand(calculatorView.getOperand());

            calculatorView.printResult(calculatorModel.calculate());
            while (true) {
                System.out.println("\n Введите 0, что бы завершить");
                String num = scanner.nextLine();
                if(num.equals("0")){
                    isEnd = true;
                    break;
                }
                else {
                    System.out.println("Неизвнстная комманда");
                }
            }

        }
    }
}
