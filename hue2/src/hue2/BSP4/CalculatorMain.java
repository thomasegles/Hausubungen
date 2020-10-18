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
public class CalculatorMain {

    public static void main(String[] args) {
        RationalCalculator rc = new RationalCalculator((x, y) -> {
            return null; //To change body of generated lambdas, choose Tools | Templates.
        }, (x, y) -> {
            return null;
        }, (x, y) -> {
            return null;
        }, (x, y) -> {
            return null;
        });
    }

    public static void auslagerung() {
        ComplexCalculator cc = new ComplexCalculator((Number x, Number y) -> {
            return new Number(x.getA() + y.getA(), x.getB() + y.getB());
        }, (Number x, Number y) -> {
            return new Number(x.getA() - y.getA(), x.getB() - y.getB());
        }, (Number x, Number y) -> {
            Number a = new Number(x.getA() * y.getA(), x.getA() * y.getB());
            Number b = new Number(x.getB() * y.getA(), x.getB() * y.getB());
            return new Number(a.getA() + b.getB() * (-1), b.getA() + a.getB());
        }, (Number x, Number y) -> {
            Number a = new Number(x.getA() * y.getA(), x.getA() * y.getB() * (-1));
            Number a2 = new Number(x.getB() * y.getA(), x.getB() * y.getB() * (-1));
            Number a3 = new Number(a.getA() + a2.getB() * (-1), a.getB() + a2.getA());

            Number e = new Number(y.getA() * y.getA(), y.getA() * y.getB() * (-1));
            Number e2 = new Number(y.getB() * y.getA(), y.getB() * y.getB() * (-1));
            Number e3 = new Number(e.getA() * e2.getB() * (-1), 0);

            return new Number(a3.getA() / e3.getA(), a3.getB() / e3.getA());
        });
    }
}
