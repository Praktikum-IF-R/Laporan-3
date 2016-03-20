/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

import java.util.Scanner;

public class overloadingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        overloading test = new overloading();
        System.out.println("Angka --> Huruf ");
        test.overloadingMeth(input.nextInt());
        input.nextLine();
        overloading test1 = new overloading();
        System.out.println("======================");
        System.out.println("Huruf --> Angka ");
        test1.overloadingMeth(input.nextLine());
        System.out.println();
    }
}
