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
public class Overloading {

    public String[] nomor = new String[]{
        "Nol", "Satu", "Dua", "Tiga",
        "Empat", "Lima", "Enam", "Tujuh", "Delapan",
        "Sembilan", "Sepuluh", "Sebelas", "Dua belas",
        "Tiga belas", "Empat belas", "Lima belas", "Enam belas",
        "Tujuh belas", "Delapan belas", "Sembilan belas"};

    public void overloadingMeth(int a) {
        int puluhan = 0, satuan;
        String hasil;
        if (a < 20) {
            hasil = nomor[a];
        } else {
            puluhan = a / 10;
            satuan = a % 10;
            if (satuan == 0) {
                hasil = nomor[puluhan] + " puluh ";
            } else {
                hasil = nomor[puluhan] + " Puluh " + nomor[satuan];
            }
        }
        if (puluhan > 9) {
            hasil = "Seratus";
        }
        System.out.println(hasil);
    }

    public void overloadingMeth(String a) {
        String[] array = a.split(" ", 0);
        int hasil = 0;
        int count = 0;
        switch (array.length) {
            case 1:
                for (int i = 0; i < nomor.length; i++) {
                    if (array[0].equalsIgnoreCase(nomor[i])) {
                        hasil = i;
                        count++;
                        break;
                    }
                    count++;
                }
                if (count == 20) {
                    hasil = 100;
                }
                break;
            case 2:
                for (int i = 0; i < nomor.length; i++) {
                    if (array[0].equalsIgnoreCase(nomor[i]) && array[1].equalsIgnoreCase("puluh")) {
                        hasil = 10 * i;
                    }
                    if (array[0].equalsIgnoreCase(nomor[i]) && array[1].equalsIgnoreCase("belas")) {
                        hasil = i + 10;
                    }
                }
                break;
            default:
                int puluhan = 0,
                 satuan = 0;
                for (int i = 0; i < nomor.length; i++) {
                    if (array[0].equalsIgnoreCase(nomor[i])) {
                        puluhan = 10 * i;
                    }
                }
                for (int i = 0; i < nomor.length; i++) {
                    if (array[2].equalsIgnoreCase(nomor[i])) {
                        satuan = i;
                    }
                }
                hasil = puluhan + satuan;
        }
        System.out.println(hasil);
    }
}
