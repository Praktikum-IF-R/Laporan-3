/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;


public class Apotek {
    private String nama;
    private String almt;
    private int obat1;
    private int obat2;
    private int obat3;
    private int jmlh;
    private double total;
    private int harga[]={5500, 11000, 12200};
    public Apotek(){
        nama = "";
        almt = "";
    }
    public Apotek(String n, String t){
        nama = n;
        almt = t;
    }
    public void Jumlah(int j){
        jmlh = j;
    }
    public void obat1(){
        obat1 = jmlh*harga[0];
    }
    public void obat2(){
        obat2 = jmlh*harga[1];
    }
    public void obat3(){
        obat3 = jmlh*harga[2];
    }
    public void Total(){
        total = obat1 + obat2 + obat3;
    }
    public double getTotal(){
        return total;
    }
    public void displayMessage(){
        System.out.println("=========Apotek Makmur=========");
        System.out.println("Nama                :   "+nama);
        System.out.println("Alamat              :   "+almt);
        System.out.println("Total pembayaran    :   Rp. "+getTotal());
    } 
}
