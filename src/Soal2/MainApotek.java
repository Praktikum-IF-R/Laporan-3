/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.util.Scanner;
public class MainApotek {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        System.out.print("Nama        : ");
        String nm = in.nextLine();
        System.out.print("Alamat      : ");
        String ad = in.nextLine();
        Apotek a1 = new Apotek(nm,ad);
        System.out.println();
        System.out.println("=======Pilihan Obat=======");
        System.out.println(" Nama obat          Harga");
        System.out.println("1. Paracetamol      5500");
        System.out.println("2. Amoxicillin      11000");
        System.out.println("3. Dextamin         12200");
        System.out.println("==========================");
        System.out.println();
        System.out.print("Obat yang dipilih   : ");
        int pil = in.nextInt();
        switch(pil){
            case 1 : System.out.print("Banyaknya obat      : ");
                     int b = in.nextInt();
                     a1.Jumlah(b);
                     a1.obat1();break;
            case 2 : System.out.print("Banyaknya obat      : ");
                     b = in.nextInt();
                     a1.Jumlah(b);
                     a1.obat2();break;
            case 3 : System.out.print("Banyaknya obat      : ");
                     b = in.nextInt();
                     a1.Jumlah(b);
                     a1.obat3();break;
            default: System.out.println("Obat Kosong");
        }
        a1.Total();
        System.out.println();
        a1.displayMessage();
    }
}
