/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;

/**
 *
 * @author Lenovo
 */
public class Convert {
    int bilangan[]={0,1,2,3,4,5,6,7,8,9};
    String teks[]={"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    

    public String overloadingMeth(int angka){
        if(angka<12)
            return teks[angka];
        if (angka>=12&&angka<20)
            return teks[angka%10]+" Belas";
        if(angka>=20&&angka<99)
            return overloadingMeth(angka/10)+" puluh "+teks[angka%10];
        if(angka==100)
            return "seratus";
        return "";
    }
    public int overloadingMeth(String kata){
        int dua = 2;
        String satu = "1";
        int setunggal = Integer.parseInt(satu);
        System.out.println(dua + setunggal);    
         
    
        return dua +setunggal;
    }
}
