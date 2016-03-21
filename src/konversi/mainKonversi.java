package konversi;

import java.util.Scanner;

public class mainKonversi {

    public static void main(String[] args) {
        
        konversi k1 = new konversi();
        
        int angka,pilih;
        String kalimat,p;
        boolean cek = true;
        
         Scanner in = new Scanner(System.in);
         Scanner in2 = new Scanner(System.in);
         System.out.println("+--------------------------+");
         System.out.println("|Program Konversi Mantapsss|");
         System.out.println("+--------------------------+");
         do{
            System.out.println("Pilihan: ");
            System.out.println("1. Konversi Angka ke Huruf");
            System.out.println("2. Konversi Huruf ke Angka");
            System.out.println("3. Keluar");
            System.out.print("\nMasukkan pilihan anda: ");
            pilih = in.nextInt();
            System.out.println("");
            switch(pilih){
                case 1 :
                    System.out.print("Masukkan angka (1-100):");
                    angka = in.nextInt();
                    System.out.println("Terbilang :"+k1.overloadingMeth(angka));
                    System.out.println();
                break;
                    
                case 2 :
                    System.out.print("Masukkan angka terbilang\n(contoh: lima puluh):");
                    kalimat = in2.nextLine();
                    System.out.println("Angka :"+k1.overloadingMeth(kalimat));
                    System.out.println();
                break;
                    
                case 3 :
                    System.out.println("Exit");
                    System.exit(0);
                break;
                
                default :
                      System.out.println("Maaf pilihan yang Anda masukkan tidk tersedia");     
            }
            
            System.out.print("Memilih kembali ?(y/n) :");
            p = in2.nextLine();
 
            if(p.equalsIgnoreCase("y"))
                cek = true;
            else
                cek = false;
            System.out.println("");
        }while(cek!=false);
         
        System.out.println("Exit");
    }
//     
       
}
