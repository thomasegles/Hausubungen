/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.BSP4;

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class CalculatorMain {

    public static void main(String[] args) {
        RationalCalculator rc = new RationalCalculator((Number x, Number y) -> {
            double erg = x.getB() * y.getB();
            Number n = new Number(x.getA() * y.getB(), erg);
            Number n2 = new Number(y.getA() * x.getB(), erg);
            return new Number(n.getA() + n2.getA(), erg);
        }, (Number x, Number y) -> {
            double erg = x.getB() * y.getB();
            Number n = new Number(x.getA() * y.getB(), erg);
            Number n2 = new Number(y.getA() * x.getB(), erg);
            return new Number(n.getA() - n2.getA(), erg);
        }, (Number x, Number y) -> {
            return new Number(x.getA() * y.getA(), x.getB() * y.getB());
        }, (Number x, Number y) -> {
            return new Number(x.getA() / y.getB(), x.getB() / y.getA());
        });
        VectorCalculator vc = new VectorCalculator((Number x, Number y) -> {
            return new Number(x.getA() + y.getA(), x.getB() + y.getB());
        }, (Number x, Number y) -> {
            return new Number(x.getA() - y.getA(), x.getB() - y.getB());
        }, (Number x, Number y) -> {
            double erg1 = x.getA() * y.getB();
            double erg2 = x.getB() * y.getA();
            return new Number(erg1 - erg2, 0);
        }, (Number x, Number y) -> {
            double erg1 = x.getA() * y.getA();
            double erg2 = x.getB() * y.getB();
            return new Number(erg1 + erg2, 0);
        });
        ComplexCalculator cc = new ComplexCalculator((Number x, Number y) -> {
            //add
            return new Number(x.getA() + y.getA(), x.getB() + y.getB());
        }, (Number x, Number y) -> {
            //sub
            return new Number(x.getA() - y.getA(), x.getB() - y.getB());
        }, (Number x, Number y) -> {
            //mul
            Number a = new Number(x.getA() * y.getA(), x.getA() * y.getB());
            Number b = new Number(x.getB() * y.getA(), x.getB() * y.getB());
            return new Number(a.getA() + b.getB() * (-1), b.getA() + a.getB());
        }, (Number x, Number y) -> {
            //div
            Number h = new Number(x.getA() * y.getA(), x.getA() * y.getB() * (-1));
            Number i = new Number(x.getB() * y.getA(), x.getB() * y.getB() * (-1));
            Number j = new Number(h.getA() + i.getB() * (-1), h.getB() + i.getA());
            Number k = new Number(y.getA() * y.getA(), y.getA() * y.getB() * (-1));
            Number l = new Number(y.getB() * y.getA(), y.getB() * y.getB() * (-1));
            Number m = new Number(k.getA() * l.getB() * (-1), 0);
            return new Number(j.getA() / j.getA(), j.getB() / j.getA());
        });

        Scanner scanner = new Scanner(System.in);
        int inpt = 0;
        do {
            System.out.println("Choose Calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");

            inpt = Integer.parseInt(scanner.nextLine());
            if (inpt == 4) {
                break;
            }
            System.out.println("Zahl 1: x  eingeben:");
            double numb1x = Integer.parseInt(scanner.nextLine());
            System.out.println("Zahl 1: y eingeben:");
            double numb1y = Integer.parseInt(scanner.nextLine());

            System.out.println("Zahl 2: x  eingeben:");
            double numb2x = Integer.parseInt(scanner.nextLine());
            System.out.println("Zahl 2: y eingeben:");
            double numb2y = Integer.parseInt(scanner.nextLine());

            Number a = new Number(numb1x, numb1y);
            Number b = new Number(numb2x, numb2y);

            switch (inpt) {

                case 1:

                    switch (operationMenu()) {
                        case 1:
                            System.out.println(rc.add(a, b).getA());
                            System.out.println(rc.add(a, b).getB());
                            break;
                        case 2:
                            System.out.println(rc.subtract(a, b).getA());
                            System.out.println(rc.subtract(a, b).getB());
                            break;
                        case 3:
                            System.out.println(rc.multiply(a, b).getA());
                            System.out.println(rc.multiply(a, b).getB());
                            break;
                        case 4:
                            System.out.println(rc.divide(a, b).getA());
                            System.out.println(rc.divide(a, b).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    switch (operationMenu()) {
                        case 1:
                            System.out.println(vc.add(a, b).getA());
                            System.out.println(vc.add(a, b).getB());
                            break;
                        case 2:
                            System.out.println(vc.subtract(a, b).getA());
                            System.out.println(vc.subtract(a, b).getB());
                            break;
                        case 3:
                            System.out.println(vc.multiply(a, b).getA());
                            break;
                        case 4:
                            System.out.println(vc.divide(a, b).getA());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    switch (operationMenu()) {
                        case 1:
                            System.out.println(cc.add(a, b).getA());
                            System.out.println(cc.add(a, b).getB());
                            break;
                        case 2:
                            System.out.println(cc.subtract(a, b).getA());
                            System.out.println(cc.subtract(a, b).getB());
                            break;
                        case 3:
                            System.out.println(cc.multiply(a, b).getA());
                            System.out.println(cc.multiply(a, b).getB());
                            break;
                        case 4:
                            System.out.println(cc.divide(a, b).getA());
                            System.out.println(cc.divide(a, b).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;

            }

        } while (inpt <= 3);

    }

    public static int operationMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter number again");

        return Integer.parseInt(scanner.nextLine());
    }

}
