/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI APOTEK BRAWIJAYA");
        System.out.println("\n\nSilahkan registrasi terlebih dahulu");
        System.out.print("Masukkan Nama   : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = in.nextLine();
        Apotek identitas = new Apotek(nama, alamat);
        System.out.print("Masukkan Umur   : ");
        String Umur = in2.next();
        Apotek umur = new Apotek(Umur);
        Apotek.menu();   
    }
}


