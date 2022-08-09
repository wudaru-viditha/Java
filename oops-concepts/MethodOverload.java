import java.io.IOException;

import javax.swing.SingleSelectionModel;

public class MethodOverload {
    public static void main(String[] args) throws IOException{
        int num1 = System.in.read() - 48; // It's displaying ASCII values. ASCII value of '0' is 48. So subtracted that
        // This is not the right way so using scanner class
        System.out.println("num1 value is:" + num1);
        int num2 = 6;
        int num3 = 7;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        int result1 = calc.add(num1,num2, num3);
        System.out.println("addition of two numbers is:" + result);
        System.out.println("addition of three numbers is:" + result1);
    }
}

class Calculator{
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public int add(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
