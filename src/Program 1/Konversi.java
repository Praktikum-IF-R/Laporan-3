package Praktik03;
public class Konversi {
     public String arr1[] = {"Nol","Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
     public String arr3[] = {"","Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
     public String arr2[] = {"Belas", "Puluh", "Sebelas", "Sepuluh", "Seratus"};
     public int n[] = new int [2];
     
     public Konversi(int a){
          if (a<=10){
            if(a==10){
                System.out.println(arr2[4]);}
            else{
            System.out.println(arr1[a]);}
        }
        else if(a<20){
            if(a==11){
                System.out.println(arr2[2]);}
            else if(a>11){
                System.out.println(arr1[a%10]+" "+arr2[0]);}            
        }
        else if(a>19){
            if(a<100){
                System.out.println(arr1[a/10]+" "+arr2[1]+" "+arr3[a%10]);}
            else if(a==100){
                System.out.println(arr2[4]);}
        }
     }
     public Konversi(String a){
         switch (a){
            case "satu" : n[0] +=1;break;
            case "dua"  : n[0] +=2;break;
            case "tiga" : n[0] +=3;break;
            case "empat": n[0] +=4;break;
            case "lima" : n[0] +=5;break;
            case "enam" : n[0] +=6;break;
            case "tujuh": n[0] +=7;break;
            case "delapan": n[0] +=8;break;
            case "sembilan": n[0] +=9;break;
            case "sepuluh": n[0] +=10;break;
            case "sebelas": n[0] +=11;break;
            case "dua belas": n[0] +=12;break;
            case "tiga belas": n[0] +=13;break;
            case "empat belas": n[0] +=14;break;
            case "lima belas": n[0] +=15;break;
            case "enam belas": n[0] +=16;break;
            case "tujuh belas": n[0] +=17;break;
            case "delapan belas": n[0] +=18;break;
            case "sembilan belas": n[0] +=19;break;
            case "seratus": n[0] +=100;break;
            }
        System.out.println(n[0]);
     }
     public Konversi(String a, String b){
         switch (a){
            case "dua"  : n[1] +=20;break;
            case "tiga" : n[1] +=30;break;
            case "empat": n[1] +=40;break;
            case "lima" : n[1] +=50;break;
            case "enam" : n[1] +=60;break;
            case "tujuh": n[1] +=70;break;
            case "delapan": n[1] +=80;break;
            case "sembilan": n[1] +=90;break;
            }
        switch (b){
            case "puluh": ;break;
            case "puluh satu" : n[1] +=1;break;
            case "puluh dua"  : n[1] +=2;break;
            case "puluh tiga" : n[1] +=3;break;
            case "puluh empat": n[1] +=4;break;
            case "puluh lima" : n[1] +=5;break;
            case "puluh enam" : n[1] +=6;break;
            case "puluh tujuh": n[1] +=7;break;
            case "puluh delapan": n[1] +=8;break;
            case "puluh sembilan": n[1] +=9;break;
            }
        System.out.println(n[1]);
     }
}