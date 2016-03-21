
package laporanbab3;


public class ConveterSistem {
   

    public int dataInt;
    public String[] dataStr;
    private int angka;

    ConveterSistem(String[] huruf) {
        if (huruf[0].charAt(0) >= 48 && huruf[0].charAt(0) <= 57) {

            dataInt = Integer.valueOf(huruf[0]);

            overloadingMeth(dataInt);
            
        } else {
            dataStr = huruf;
            overloadingMeth(dataStr);
        }

    }


    public void overloadingMeth(String[] huruf) {
         
        for (int i = 0; i < huruf.length; i++) {
            switch (huruf[i]) {
                case "satu": angka += 1; break;
                case "dua": angka += 2; break;
                case "tiga": angka += 3; break;
                case "empat": angka += 4; break;
                case "lima": angka += 5; break;
                case "enam": angka += 6; break;
                case "tujuh": angka += 7; break;
                case "delapan": angka += 8;  break;
                case "sembilan": angka += 9; break;
                case "sepuluh": angka += 10; break;
                case "sebelas": angka = 11; break;
                case "belas": angka += 10;  break;
                case "puluh":  angka *= 10; break;
                case "nol": angka = 0; break;
                case "seratus":  angka = 100;  break;
                case "ratus": angka *= 100; break;
                default:System.out.println("Diluar range program");  System.exit(0);
            }
        } System.out.println(angka);
    }
    
    public void overloadingMeth(int angka) {
       int depan = angka/10;
       int belakang = angka%10;
       String huruf="";
       
        if (depan==0) {
            huruf = satuan(angka);
        }        
        if (depan==1 && belakang>1) {
            huruf = satuan(belakang)+" belas";
        }
        if (depan>=2 && belakang==0) {
            huruf = satuan(depan)+" puluh";
        }
        if (depan>=2 && belakang>0) {
            huruf = satuan(depan)+" puluh "+satuan(belakang);
        }
        if (angka==10) {
            huruf="sepuluh";
        }
        if (angka==11) {
            huruf="sebelas";
        }
        if (angka==100) {
            huruf = "seratus";
        }
        System.out.println(huruf);
   }
    
   public String satuan(int angka){
       
       switch(angka){
                case 0: return "nol";
                case 1: return "satu"; 
                case 2: return "dua"; 
                case 3: return "tiga"; 
                case 4: return "empat"; 
                case 5: return "lima"; 
                case 6: return "enam"; 
                case 7: return "tujuh"; 
                case 8: return "delapn"; 
                case 9: return "sembilan"; 
            }
       return "";
   }
}
    
