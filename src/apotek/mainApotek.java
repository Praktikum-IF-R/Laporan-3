package apotek;

import java.util.Scanner;


public class mainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        String nama, obat, alamat,pilih;
        int jumlah, i=0;
        boolean cek = true;
        
        System.out.print("Masukan nama pasien :");
        nama = in.nextLine();
        System.out.print("Masukan alamat      :");
        alamat = in.nextLine();
            
        pasien p1 = new pasien(nama,alamat);
       
        p1.daftarObat();
        
        do{
             
            System.out.print("\nMasukan nama obat   :");
            obat = in2.nextLine();
            System.out.print("Masukan jumlah      :");
            jumlah = in.nextInt();
            
            p1.daftarObat(obat, jumlah);
            
            System.out.print("Menambah pesanan obat ?(y/n) :");
            pilih = in2.nextLine();
            i++;
            
            if(i==4)
                cek = false;
            
            if(pilih.equalsIgnoreCase("y"))
                cek = true;
            else
                cek = false;
            
          
        }while(cek!=false);
        
        System.out.println("\n=====================================");
        System.out.println("Nama pasien :"+p1.getNama());
        System.out.println("Alamat      :"+p1.getAlamat());
        System.out.println("-------------------------------------");
        p1.tampilPesan();
      
        System.out.println("=====================================");
    
    }
    
}
