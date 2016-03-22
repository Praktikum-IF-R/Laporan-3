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
public class Apotekmain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" SISTEM INFORMASI PENJUALAN APOTEK");
        System.out.println("===================================");
        System.out.println();

        Apotek pembeli1 = new Apotek();
        System.out.print("Masukkan nama Anda  : ");
        pembeli1.setNama(input.nextLine());
        System.out.print("Maukkan alamat      : ");
        pembeli1.setAlamat(input.nextLine());
        System.out.println("-----------------------------------");
        pembeli1.pilihobat();
        pembeli1.total();
        System.out.println();
        System.out.println("===================================");
        System.out.println();

        Apotek pembeli2 = new Apotek("Astelin");
        System.out.print("Masukkan nama Anda    : ");
        pembeli2.setNama(input.nextLine());
        System.out.print("Maukkan alamat        : ");
        pembeli2.setAlamat(input.nextLine());
        pembeli2.Apotek("Astelin");
        pembeli2.pilihobat("diare");
        pembeli2.total();
        System.out.println("===================================");
        System.out.println();

        Apotek pembeli3 = new Apotek("Amoxil", "Diamox");
        System.out.print("Masukkan nama Anda    : ");
        pembeli3.setNama(input.nextLine());
        System.out.print("Maukkan alamat        : ");
        pembeli3.setAlamat(input.nextLine());
        pembeli3.Apotek("Amoxil", "Diamox");
        pembeli3.total();
        System.out.println("===================================");
        System.out.println();
    }
}
