import java.util.Scanner;

public class ScannerUse {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            Calculator calc = new Calculator();
            int result = calc.add(num1,num2);
            int result1 = calc.add(num1,num2, num3);
            System.out.println("addition of two numbers is:" + result);
            System.out.println("addition of three numbers is:" + result1);
        }
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
