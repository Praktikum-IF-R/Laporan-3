package cek.kata.angka;

import java.util.Scanner;


public class mainOverloadingMethod {
    public static void main(String[] args) {
        Scanner inI = new Scanner(System.in);
        Scanner inS = new Scanner (System.in);
        OverloadingMeth a= new OverloadingMeth();
        OverloadingMeth b = new OverloadingMeth();
        System.out.println("  ANGKA => HURUF BILANGAN dan HURUF BILANGAN => ANGKA   ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.print("Masukkan angka            : ");
        int angka = inI.nextInt();
        System.out.print("HASILNYA:                  ");
        a.overloadingmeth(angka);
        System.out.println();
        System.out.print("Masukkan Huruf Bilangan   : ");
        String huruf = inS.nextLine();
        System.out.print("HASILNYA:                  ");
        b.overloadingmeth(huruf);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
    }  
}