/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas
 */
public class NumberTester {

    String fileName;

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int caseAmount = Integer.parseInt(br.readLine());
            for (int i = 0; i < caseAmount; i++) {
                String[] testLine = br.readLine().split(" ");
                int testNum = Integer.parseInt(testLine[0]);
                int numToTest = Integer.parseInt(testLine[1]);
                switch (testNum) {
                    case 1:
                        if (oddTester.testNumber(numToTest)) {
                            System.out.println("ODD");
                        } else {
                            System.out.println("EVEN");
                        }
                        break;
                    case 2:
                        if (primeTester.testNumber(numToTest)) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if (palindromeTester.testNumber(numToTest)) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
