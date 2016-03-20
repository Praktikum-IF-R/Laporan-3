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
public class Apotek {

    private String nama;
    private String alamat;
    private String obat;
    public int harga;
    private int total;

    public Apotek() {

    }

    public Apotek(String nama, String obat, String alamat) {
        this.nama=nama;
        this.obat=obat;
        this.alamat=alamat;

    }

    public int Apotek(int harga, int jumlah) {
        total = harga * jumlah;
        return total;
    }

    void tampilkanDaftar() {
        System.out.println("");
        System.out.println("-------Daftar Obat--------");
        System.out.println("1. Parasetamol - Rp.10.000,-");
        System.out.println("2. CTM - Rp.5.000,- ");
        System.out.println("3. OBH - Rp.15.000,-");
        System.out.println("4. Hufagrip - Rp.17.000,-");
        System.out.println("");

    }

   

}
