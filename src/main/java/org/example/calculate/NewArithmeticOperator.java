package org.example.calculate;

/**
 * author :  sanghoonkim
 * date : 2022/12/28
 */
public interface NewArithmeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
