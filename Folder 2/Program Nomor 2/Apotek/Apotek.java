package Apotek;
import java.util.Scanner;
/**
 * @author DS
 */
public class Apotek {
//deklarasi variabel apa saja yang dibutuhkan
    private String nama, alamat, obat, perulangan;
    private int Harga, perlu;
    private int jumlah1, jumlah2, jumlah3, jumlah4, jumlah5;
//overloading constructor yang digunakan untuk mendeklarasikan nama dan alamat
    public void Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
//method getNama untuk mendapatkan nama
    public String getNama() {
        return nama;
    }
//method getAlamat untuk mendapat alamat
    public String getAlamat() {
        return alamat;
    }
 //method daftarObat untuk menampilkan daftar obat
 public void daftarObat() {
        System.out.println("***********************************");
        System.out.println("No.  Nama Obat              Harga ");
        System.out.println("************************************");
        System.out.println("1.   Bodrex                 3.000");
        System.out.println("2.   Betadine              10.000");
        System.out.println("3.   Remason                8.000");
        System.out.println("4.   Amoksilin              9.000");
        System.out.println("5.   Sea Quil              20.000");
        System.out.println("-------------------------------------");
    }
 //method pesan yang digunakan untuk menampilkan dan menseleksi pilihan
    public void Pesan() {
        Scanner in = new Scanner(System.in);
        //perulangan pemilihan obat
        do {
            System.out.print("Masukkan Nomor obat : ");
            obat = in.next();
            if (obat.equalsIgnoreCase("1")) {     
                System.out.println("Bodrex berharga         Rp." + 3000);
                System.out.print("Berapa yang anda perlukan : ");
                perlu = in.nextInt();
                jumlah1 = perlu * 3000;
            }
            else if (obat.equalsIgnoreCase("2")) {
                System.out.println("Betadine Berharga       Rp." + 10000);
                System.out.print("Berapa yang anda perlukan : ");
                perlu = in.nextInt();
                jumlah2 = perlu * 10000;
            }
            else if (obat.equalsIgnoreCase("3")) { 
                System.out.println("Remason Berharga        Rp. " + 8000);
                System.out.print("Berapa yang anda perlukan : ");
                perlu = in.nextInt();
                jumlah3 = perlu * 8000;
            }
            else if (obat.equalsIgnoreCase("4")) {   
                System.out.println("Amoksilin Berharga      Rp. " + 9000);
                System.out.print("Berapa yang anda perlukan : ");
                perlu = in.nextInt();
                jumlah4 = perlu * 9000;
            }
            else if (obat.equalsIgnoreCase("5")) {               
                System.out.println("Sea Quil Berharga         Rp. " + 20000);
                System.out.print("Berapa yang anda perlukan : ");
                perlu = in.nextInt();
                jumlah5 = perlu * 20000;
            }
            System.out.println("Apakah anda ingin pesan lagi (ya/tidak): ");
            perulangan = in.next();
        } while (!perulangan.equalsIgnoreCase("tidak"));
    }
//method getTotal untuk menghitung jumlah obat yang dibeli   
    public int getHarga() {
        Harga = jumlah1 + jumlah2 + jumlah3 + jumlah4 + jumlah5;
        return Harga;
    }
//method Display yang digunakan untuk menampilkan struck user    
    public void Display() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                    APOTEK FARMA");
        System.out.println("          Kesehatan Anda Kebahagiaan Kami");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("Nama            : " + getNama());
        System.out.println("Alamat          : " + getAlamat());        
        System.out.println("Total Harga     : Rp. " + getHarga());
        System.out.println();
        System.out.println("        [=][=][=] TERIMA KASIH [=][=][=][=]");
        System.out.println("        ---------**************------------");
    }
}
