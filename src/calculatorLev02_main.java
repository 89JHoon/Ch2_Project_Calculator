import java.util.Scanner;

public class calculatorLev02_main {
    public static void main(String[] args) {
        calculatorLev02_calculator calculator = new calculatorLev02_calculator();
        System.out.println(" 사칙연산 계산기 입니다! ");

        Scanner sc = new Scanner(System.in);
        String keep = calculator.keep;


        while (keep.equals("yes")) {

            System.out.println("첫번쨰 숫자를 입력해 주세요");
            calculator.num1 = sc.nextInt();
            System.out.println("사칙연산을 입력해주세요 - + / *");
            String fourOperration = sc.next();
            System.out.println("두번쨰 숫자를 입력해 주세요");
            calculator.num2 = sc.nextInt();


            int num1 = calculator.num1;
            int num2 = calculator.num2;
            int result = calculator.result;


            if (fourOperration.equals(calculator.add)) {
                result = calculator.add(num1, num2);
                System.out.println(result);
                System.out.println("더 계산하시겟습니까? yes/exit");
                keep = sc.next();

            } else if (fourOperration.equals(calculator.divide)) {
                result = calculator.divide(num1, num2);
                System.out.println(result);


            } else if (fourOperration.equals(calculator.subtract)) {
                result = calculator.subtract(num1, num2);
                System.out.println(result);
            } else {
                result = calculator.multiply(num1, num2);
                System.out.println(result);
            }
        }
        System.out.println("계산기 종료");


    }
}
