/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.BSP4;

/**
 *
 * @author Thomas
 */
public class VectorCalculator extends AbstractCalculator implements CalculateOperation {

    CalculateOperation add;
    CalculateOperation subtract;
    CalculateOperation multiply;
    CalculateOperation divide;

    public VectorCalculator(CalculateOperation add, CalculateOperation subtract, CalculateOperation multiply, CalculateOperation divide) {
        super(add, subtract, multiply, divide);
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number calc(Number x, Number y) {
        return add.calc(x, y);
    }
}
