import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lv2calculator {

    // 연산 결과를 저장하는 컬렉션 타입
    private List<Double> result = new ArrayList();


    //사칙연산을 수행 후, 결과값 반환 메서드
    public double calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            result.add((double) (num1+num2));
            return num1 + num2;
        } else if (operator.equals("-")) {
            result.add((double) (num1-num2));
            return num1 - num2;
        } else if (operator.equals("*")) {
            result.add((double) (num1*num2));
            return num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("0 으로는 나눌수 없습니다.");
            } else {
                result.add((double) (num1/num2));
                return (double) num1 / num2;
            }
        } else {
            System.out.println("읿력이 잘 못되었습니다.");
        }
        return 0;
    }

    //  main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
    //   간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
    //   간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)

    public List<Double> getResult(){
        return result;
    }

    public void setResult(Double result){
        this.result.add(result);
    }

    //가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드
    public void deleteList(){
        result.remove(0);
    }

}
