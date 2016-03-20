/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoading;

/**
 *
 * @author nuel
 */
import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);
        int menus;
        
       
        do {
             Apotek apo = new Apotek();
            System.out.println("-----------APOTEK BRAWIJAYA-----------");
            System.out.println("Menu : ");
            System.out.println("1. Daftar Harga Obat, ");
            System.out.println("2. Pembelian Obat.");
            System.out.println("3. Keluar");

            System.out.print("Masukkan Pilihan Menu : ");
            menus = nuel.nextInt();
            switch (menus) {
                case 1:
                    apo.tampilkanDaftar();
                    break;
                case 2:
                    System.out.println("=====Pembelian Obat=====");
                    System.out.print("Nama Pembeli : ");
                    String nama = nuel.next();
                    System.out.print("Alamat Pembeli : ");
                    String alamat = nuel.next();
                    System.out.print("Masukkan Nama Obat : ");
                    String obat = nuel.next();
                    Apotek s = new Apotek(nama, alamat, obat);

                    if (obat.equalsIgnoreCase("parasetamol")) {
                        int harga = 10000;
                        System.out.print("Masukkan Jumlah Obat : ");
                        int jumlah = nuel.nextInt();
                        System.out.println("Total Pembayaran : Rp." + apo.Apotek(harga, jumlah) + ",-");
                        System.out.println("");
                        
                    } else if (obat.equalsIgnoreCase("ctm")) {
                        int harga = 5000;
                        System.out.print("Masukkan Jumlah Obat : ");
                        int jumlah = nuel.nextInt();
                        System.out.println("Total Pembayaran : Rp." + apo.Apotek(harga, jumlah) + ",-");
                        System.out.println("");
                    } else if (obat.equalsIgnoreCase("obh")) {
                        int harga = 15000;
                        System.out.print("Masukkan Jumlah Obat : ");
                        int jumlah = nuel.nextInt();
                        System.out.println("Total Pembayaran : Rp." + apo.Apotek(harga, jumlah) + ",-");
                        System.out.println("");
                    } else if (obat.equalsIgnoreCase("hufagrip")) {
                        int harga = 17000;
                        System.out.print("Masukkan Jumlah Obat : ");
                        int jumlah = nuel.nextInt();
                        System.out.println("Total Pembayaran : Rp." + apo.Apotek(harga, jumlah) + ",-");
                        System.out.println("");
                    }
                    

                    break;
                case 3:
                    break;
            }
            
        } while (menus != 3);

    }

}
