import java.util.Scanner;

public class circulatorLev01 {
    public static void main(String[] args) {
        System.out.println(" 계산기를 만들어 보자 ");
        String add = "+";
        String divide = "/";
        String multiply = "*";
        String subtract = "-";
        String keep = "yes";

        while (keep.equals("yes")) {
            if (keep.equals("exit")) {
                //여기넣으면 왜 안나오나요???
                //System.out.println("계산기 종료");
                break;
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("첫번쨰 숫자를 입력해 주세요");
                int num1 = sc.nextInt();
                System.out.println("사칙연산을 입력해주세요 - + / *");
                String fourOperration = sc.next();
                System.out.println("두번쨰 숫자를 입력해 주세요");
                int num2 = sc.nextInt();

                if (fourOperration.equals(add)) {
                    int result = num1 + num2;
                    System.out.println("결과: " + num1 + "+" + num2 + "= " + result);
                } else if (fourOperration.equals(divide)) {

                    while (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        System.out.println("다시 입력해 주세요");
                        System.out.println("두번쨰 숫자를 입력해 주세요");
                        num2 = sc.nextInt();
                    }
                    int result = num1 / num2;
                    if (result != 0) {
                        System.out.println("결과: " + num1 + "/" + num2 + "= " + result);
                    } else {
                        System.out.println("결과= " + result + " >두번쨰 숫자가 첫번쨰 숫자보다 큽니다.");
                    }

                } else if (fourOperration.equals(multiply)) {
                    int result = num1 * num2;
                    System.out.println("결과: " + num1 + "*" + num2 + "= " + result);
                } else if (fourOperration.equals(subtract)) {
                    int result = num1 - num2;
                    System.out.println("결과: " + num1 + "-" + num2 + "= " + result);
                } else {
                    System.out.println("사칙연산 기호를 잘못 입력하였습니다.");
                }
                System.out.println("더 계산하시겟습니까? yes/exit");
                keep = sc.next();
            }
        }
        System.out.println("계산기 종료");


    }
}
