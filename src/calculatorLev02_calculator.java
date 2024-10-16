public class calculatorLev02_calculator {

    String add = "+";
    String divide = "/";
    String multiply = "*";
    String subtract = "-";
    int num1 ;
    int num2 ;
    int result ;
    String  keep ="yes";

    public calculatorLev02_calculator(){
        System.out.println("calculatorLev02_calculator");
    }

    int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    int divide(int num1, int num2){
        if(num2 != 0){
            result = num1 / num2;
            if(result == 0){
                System.out.println("결과= " + result + " >두번쨰 숫자가 첫번쨰 숫자보다 큽니다.");
            }
        }

        return result;
    }
    int multiply(int num1, int num2){
        result = num1 * num2;
        return result;
    }
    int subtract (int num1, int num2){
        result = num1 - num2;
        return result;
    }
}


