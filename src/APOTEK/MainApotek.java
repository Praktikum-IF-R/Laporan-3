/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BARU2;
import java.util.Scanner;
/**
 *
 * @author Deltaviyahya
 */
public class MainApotek {
     public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI APOTEK BRAWIJAYA");
        System.out.println("\n\nSilahkan Isi Data Terlebih Dahulu");
        System.out.print("Masukkan Nama Anda   : ");
        String nama = c.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        String alamat = c.nextLine();
        Apotek identitas = new Apotek(nama, alamat);
        System.out.print("Masukkan Umur Anda  : ");
        String Umur = c2.next();
        Apotek umur = new Apotek(Umur);
        Apotek.menu();   
    }
}
