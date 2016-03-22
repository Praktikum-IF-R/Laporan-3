/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2_overloading;

/**
 *
 * @author PERSONAL Co
 */
public class Konversiangkahuruf {
    public int overloadingMeth(String a) {
        String[] huruf = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        int temp = 0;
        String b[] = a.split(" ");
        String simpanangka1, simpanangka2;
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (huruf[i].equalsIgnoreCase(a)) {
                    temp = i;
                } else if (b[j].equalsIgnoreCase("belas")) {
                    simpanangka1 = b[j - 1];
                    temp = overloadingMeth(simpanangka1) + 10;
                } else if (b[j].equalsIgnoreCase("puluh")) {
                    if(b.length==2){
                        simpanangka1 = b[j - 1];
                        temp = overloadingMeth(simpanangka1) * 10;
                    } else {
                        simpanangka1 = b[j - 1];   
                        simpanangka2 = b[j + 1];
                        temp = overloadingMeth(simpanangka1) * 10 + overloadingMeth(simpanangka2);
                    }
                } else if (a.equalsIgnoreCase("Seratus")) {
                    temp = 100;
                }
            }
        }
        return temp;
    }

    public String overloadingMeth(int b) {
        String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        String cetak = "";
        if (b == 100) {
            cetak = ("Seratus");
        } else if (b < 12) {
            cetak = (huruf[b]);
        } else if (b < 20) {
            cetak = (overloadingMeth(b - 10) + " Belas");
        } else if (b < 100 && b % 10 == 0) {
            cetak = (overloadingMeth(b / 10) + " Puluh ");
        } else if (b < 100 && b % 10 != 0) {
            cetak = (overloadingMeth(b / 10)
                    + " Puluh " + overloadingMeth(b % 10));
        } else {
            System.out.println("Angka yang Anda masukkan terlalu besar");
        }
        return cetak;

    }
}
