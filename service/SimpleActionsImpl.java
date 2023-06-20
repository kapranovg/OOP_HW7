package service;

import java.util.logging.Logger;

public class SimpleActionsImpl implements SimpleActions {
    Logger logger = Logger.getLogger("logger");

    @Override
    public void summation(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " + " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 + number3) + " + " + (number2 + number4)
                + " * i ");
        logger.info("Сумма двух комплексных чисел");
    }

    @Override
    public void subtraction(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " - " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 - number3) + " + " + (number2 - number4)
                + " * i ");
        logger.info("Разность двух комплексных чисел");
    }

    @Override
    public void multiplication(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " * " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = " + (number1 * number3 - number2 * number4) + " + "
                + (number1 * number4 + number2 * number3)
                + " * i ");
        logger.info("Умножение двух комплексных чисел");
    }

    @Override
    public void division(double number1, double number2, double number3, double number4) {
        System.out.println("(" + number1 + " + " + number2 + " * i " + ")" + " / " + "(" + number3 + " + " + number4
                + " * i " + ")" +
                " = "
                + (number1 * number3 + number2 * number4)
                        / (number3 * number3 + number4 * number4)
                + " + "
                + (number2 * number3 - number1 * number4)
                        / (number3 * number3 + number4 * number4)
                + " * i ");
        logger.info("Деление двух комплексных чисел");
    }
}