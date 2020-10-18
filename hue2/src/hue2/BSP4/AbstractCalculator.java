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
public abstract class AbstractCalculator {

    protected CalculateOperation add;
    protected CalculateOperation subtract;
    protected CalculateOperation multiply;
    protected CalculateOperation divide;

    public AbstractCalculator(CalculateOperation add, CalculateOperation subtract, CalculateOperation multiply, CalculateOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);

    public abstract Number subtract(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);
}
