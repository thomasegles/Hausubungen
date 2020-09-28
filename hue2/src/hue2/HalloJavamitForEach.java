/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Thomas
 */
public class HalloJavamitForEach {

    static List<String> strLis = new ArrayList();

    public static void main(String[] args) {
        strLis.add("Java");
        strLis.add("C#");
        strLis.add("C++");
        System.out.println("For Each Schleife:");
        for (String s : strLis) {
            System.out.println(s);
        }
        System.out.println("For Each List:");
        Consumer<String> consumer = (p) -> System.out.println(p);
        strLis.forEach(consumer);
        //kürzer wäre strLis.forEach(System.out::print);
    }

}
