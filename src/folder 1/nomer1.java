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
public class nomer1 {
   private String s[]={"nol","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas","seratus"};
   private String s2[]={"belas","puluh","ratus","ribu"};
   public void overloadingmeth(int i){
       int b;
       if (i<12){
           System.out.println("hasil konversi: "+s[i]);
       }
       else if(i>11&&i<20){
           i%=10;
           System.out.println("hasil konversi: "+s[i]+s2[0]);
       }
       else if(i>19&&i<100){
           b=i%10;
           if (b!=0){
               System.out.println("hasil konversi: "+s[i/10]+" "+s2[1]+" "+s[b]);
           }
           else{
               System.out.println("hasil konversi: "+s[i/10]+" "+s2[1]);
           }
       }
       else if(i==100){}
       else {
           System.out.println("-");
       }
   }
   public void overloadingmeth(String s){
       String a[]=s.split(" ");
        int angka[] = new int [3];
        for(int i=0; i<a.length; i++){
            if(i!=1){
                if(a[i].equalsIgnoreCase("satu")){
                    angka[i]=1;
                }
                else if(a[i].equalsIgnoreCase("dua")){
                    angka[i]=2;
                }
                else if(a[i].equalsIgnoreCase("tiga")){
                    angka[i]=3;
                }
                else if(a[i].equalsIgnoreCase("empat")){
                    angka[i]=4;
                }
                else if(a[i].equalsIgnoreCase("lima")){
                    angka[i]=5;
                }
                else if(a[i].equalsIgnoreCase("enam")){
                    angka[i]=6;
                }
                else if(a[i].equalsIgnoreCase("tujuh")){
                    angka[i]=7;
                }
                else if(a[i].equalsIgnoreCase("delapan")){
                    angka[i]=8;
                }
                else if(a[i].equalsIgnoreCase("sembilan")){
                    angka[i]=9;
                }
                else{
                    if(a[i].equalsIgnoreCase("sepuluh")){
                        angka[i]=10;
                    }
                    else if(a[i].equalsIgnoreCase("sebelas")){
                        angka[i]=11;
                    }
                    else if(a[i].equalsIgnoreCase("seratus")){
                        angka[i]=100;
                    }
                    else if(a[i].equalsIgnoreCase("nol")){
                        angka[i]=0;
                    }
                }
            }
            else{
                if(a[i].equalsIgnoreCase("belas")){
                    angka[i]=1;
                }
                else if(a[i].equalsIgnoreCase("puluh") && a.length<3){
                    angka[i]=0;
                }                
            }   
        }
        if(a.length==1){
            System.out.println("hasil konversi: "+angka[0]);
        }
        else if(a.length==2){
            if (a[1].equalsIgnoreCase("belas")){
                System.out.println("hasil konversi: "+angka[1]+""+angka[0]);
            }
            else{
            System.out.println("hasil konversi: "+angka[0]+""+angka[1]);
            }
        }
        else{
            System.out.println("hasil konversi: "+angka[0]+""+angka[2]);
        }
   }
}
