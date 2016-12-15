package HomeWork.Task1.calc;

import java.util.Scanner;

/**
 * Created by User on 14.12.2016.
 */
public class Calc {

    public double calc(double a, String ch, double b) {
        double res = 0;
        switch (ch) {
            case "+":
                res = (a + b);
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                res = 0;
        }
        return res;
    }
}
