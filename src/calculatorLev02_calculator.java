public class calculatorLev02_calculator {

    String add = "+";
    String divide = "/";
    String multiply = "*";
    String subtract = "-";
    int num1 ;
    int num2 ;
    int result = 0;

    public calculatorLev02_calculator(){
        System.out.println("calculatorLev02_calculator");
    }

    int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    int divide(int num1, int num2){
        result = num1 / num2;
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


