package OverMeth;

public class OverMeth {

    private String AngkaKeHuruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    public String OverloadingMeth(int a){
        if (a<12){
            return AngkaKeHuruf[a];
        }
        if (a>12 && a <=19){
            return (AngkaKeHuruf[a%10])+" belas";        
        }
        if (a==20){
            return "dua puluh";
        }
        if (a>20 && a <=99){
            return AngkaKeHuruf[a/10]+" puluh "+AngkaKeHuruf[a%10];
        }
        if (a == 100){
            return "seratus";
        }
        return "";
    }
    public String OverloadingMeth(String h){
         String kata[]=h.split(" ");
         int angka[] = new int [3];
         for(int i=0; i<kata.length; i++){
             if(i!=1){
                 if(kata[i].equalsIgnoreCase("satu")){
                     angka[i]=1;
                 }
                 else if(kata[i].equalsIgnoreCase("dua")){
                     angka[i]=2;
                 }
                 else if(kata[i].equalsIgnoreCase("tiga")){
                     angka[i]=3;
                 }
                 else if(kata[i].equalsIgnoreCase("empat")){
                     angka[i]=4;
                 }
                 else if(kata[i].equalsIgnoreCase("lima")){
                     angka[i]=5;
                 }
                 else if(kata[i].equalsIgnoreCase("enam")){
                     angka[i]=6;
                 }
                 else if(kata[i].equalsIgnoreCase("tujuh")){
                     angka[i]=7;
                 }
                 else if(kata[i].equalsIgnoreCase("delapan")){
                     angka[i]=8;
                 }
                 else if(kata[i].equalsIgnoreCase("sembilan")){
                     angka[i]=9;
                 }
                 else{
                     if(kata[i].equalsIgnoreCase("sepuluh")){
                         angka[i]=10;
                     }
                     else if(kata[i].equalsIgnoreCase("sebelas")){
                         angka[i]=11;
                     }
                     else if(kata[i].equalsIgnoreCase("seratus")){
                         angka[i]=100;
                     }
                     else if(kata[i].equalsIgnoreCase("nol")){
                         angka[i]=0; 
                     }
                 }
             }
             else{
                 if(kata[i].equalsIgnoreCase("belas")){
                     angka[i]=1; 
                 }
                 else if(kata[i].equalsIgnoreCase("puluh") && kata.length<3){
                     angka[i]=0; 
                 }                
             }   
         }
         if(kata.length==1){
             return (angka[0])+"";
         }
         else if(kata.length==2){
             return (angka[1]+""+angka[0]);
         }
         else{
             return (angka[0]+""+angka[2]);
         }
     }
    }
    

