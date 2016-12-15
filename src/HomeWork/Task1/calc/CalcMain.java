package HomeWork.Task1.calc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by User on 14.12.2016.
 */
public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Start calculator\n");
        double res = 0;

        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            if (str[0].equals("exit")) {
                break;
            } else {
                double a = Double.parseDouble(str[0]);
                String ch = str[1];
                double b = Double.parseDouble(str[2]);
                res = new BigDecimal(calc.calc(a, ch, b) + res).setScale(3, RoundingMode.UP).doubleValue();
                System.out.println("Result: " + res);
            }
        }
    }
}

