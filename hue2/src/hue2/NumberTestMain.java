/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

/**
 *
 * @author Thomas
 */
public class NumberTestMain {

    public static void main(String[] args) {
        NumberTester nbt = new NumberTester("Tests.txt");
        nbt.setOddEvenTester((number) -> {
            if (number % 2 == 0) {
                return false;
            }
            return true;
        });
        nbt.setPrimeTester((number) -> {
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        });
        nbt.setPalindromeTester((number) -> {
            String strNum = number + "";
            return true;
        });
    }
}
