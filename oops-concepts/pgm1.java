public class pgm1 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 6;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
}

class Calculator{
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
