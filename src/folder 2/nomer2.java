/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Lenovo
 */
public class nomer2 {
    private String nama,obat,alamat;
    private int harga,total=0;
    public nomer2(){
        nama="";
        alamat="";
    }
    public nomer2(String s,String ss){
        nama=s;
        alamat=ss;
    }
    public void obat(String s){
        obat=s;
    }
    public void obat(int i){
        harga=i;
    }
    public void jumlah(int i){
        total=total+harga*i;
    }
    public void struk(){
        System.out.println("==================================");
        System.out.println("nama pembeli   :"+nama);
        System.out.println("alamat         :"+alamat);
        System.out.println("total harga    :"+total);
        System.out.println("==================================");
    }
}
