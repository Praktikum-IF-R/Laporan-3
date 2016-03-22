/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2_overloading;

import java.util.Scanner;

/**
 *
 * @author PERSONAL Co
 */
public class KonversiangkahurufMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Konversiangkahuruf n1 = new Konversiangkahuruf();
        String ulang;
        String b;
        int a;
        do {
            System.out.println("Konversi Angka -> Huruf");
            System.out.print("Masukkan angka : ");
            a = input.nextInt();
            System.out.println(n1.overloadingMeth(a));
            System.out.println("Konversi Huruf -> Angka");
            System.out.print("Masukkan huruf : ");
            b = input.nextLine();
            b = input.nextLine();
            System.out.println(n1.overloadingMeth(b));
            System.out.print("Ingin konversi lagi?[y/n] : ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));

    }
}
