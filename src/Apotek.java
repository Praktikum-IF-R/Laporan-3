/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotek;
public class Apotek {
    private String nama;
    private String alamat;
    private int jml;
    private int obat1;
    private int obat2;
    private int obat3;
    private int obat4;
    private int harga[]={8000, 7000, 15000, 10000};
    private double total;     
    public Apotek (String x, String y){
        nama=x;
        alamat=y;
    }
    public void jumlah(int b){
        jml=b;
    }
    public int obat1(){
        return obat1= jml*harga[0];
    }
    public int obat2(){
        return obat2= jml*harga[1];
    }
    public int obat3(){
        return obat3= jml*harga[2];
    }
    public int obat4(){
        return obat4= jml*harga[3];
    }
    public void Total(){
        total= obat1 + obat2 + obat3 + obat4;
    }
    public double getTotal() {
        return total;
    }
    public void displayMessage(){
        System.out.println("Nama        : "+nama);
        System.out.println("Alamat      : "+alamat);
        System.out.println("Total       : Rp. "+getTotal());
    }        
}    
