package hu.homework02.jf;

public class CalculatorService {
/*Ha osztható maradék nélkül kettővel, akkor páros, ha nem akkor páratlan */

    public static boolean isItEven(int num) {
        return num % 2 == 0;
    }
/*Második feladat megoldása:*/

    public static float calculate(int x, int y, char operation) {
        float result = 0;
        switch (operation) {
            case '+':
                result = x + y;
            break;
            case '-':
                result=x - y;
            break;
            case '*':
                result=x * y;
            break;
            case '/':
                result= (float)x / y;
            break;
            default:
                System.out.println("error");
        }
        return result;
    }
}
