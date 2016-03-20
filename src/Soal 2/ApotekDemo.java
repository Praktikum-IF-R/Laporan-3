/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

import java.util.Scanner;

/**
 *
 * @author Enggar
 */
public class ApotekDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, almt;
        int pilih , obat;
        Apotek.setHarga(20000, 25000, 10000, 30000, 15000);
        System.out.println("========Masukan Data Anda========");
        System.out.print("Nama                          \t: ");
        nama = in.nextLine();
        System.out.print("Alamat                        \t: ");
        almt = in.nextLine();
        Apotek p1 = new Apotek(nama, almt);
        Apotek.getDaftarObat();
        do{
        System.out.println("===========Menu Pembelian============");
            System.out.println("1. Pilih obat");
            System.out.println("2. Selesai");
            System.out.print("Pilihan                  \t: ");
            pilih = in.nextInt();
        if (pilih == 1){
            System.out.print("Masukkan pilihan obat    \t: ");
            obat = in.nextInt();
            p1.pilihObat(obat);
        }
        else if (pilih != 2){
            System.out.println("Pilihan salah");
        }
        }while (pilih != 2);
    p1.getTotal();
    }
}

    

