import java.util.List;
import java.util.Scanner;

public class Lv2main {
    public static void main(String[] args) {
        Lv2calculator play = new Lv2calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String opertator;
        String exit = "go";

        while (exit.equals("go")){

            System.out.println("첫 번째 숫자를 입력하세요");
            num1 = sc.nextInt();

            System.out.println("사칙 연산을 입력하세요");
            opertator = sc.next();

            System.out.println("두 번째 숫자를 입력하세요");
            num2 = sc.nextInt();

           double result = play.calculate(num1,num2,opertator);
            System.out.println(result);

            System.out.println("계속 하려면 go /종료를 원하면 exit 입력하세요");
            exit = sc.next();

        }

        //
        play.deleteList();


        List<Double> resultList = play.getResult();
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }
}
