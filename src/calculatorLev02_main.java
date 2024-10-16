import java.util.Scanner;

public class calculatorLev02_main {
    public static void main(String[] args) {
        calculatorLev02_calculator calculator = new calculatorLev02_calculator();
        System.out.println(" 사칙연산 계산기 입니다! ");

        Scanner sc = new Scanner(System.in);
        calculator.num1 = sc.nextInt();
        calculator.num2 = sc.nextInt();
        String fourOperration = sc.next();

        int result;

        if(fourOperration.equals(calculator.add)){
            result = calculator.add(calculator.num1,calculator.num2);
            System.out.println(result);
        }else {

        }







    }
}
