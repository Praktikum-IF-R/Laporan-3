package Apotek;
import java.util.Scanner;
/**
 * @author DS
 */
//main class dari class Apotek
public class mainApotek {
    public static void main(String[] args) {
        //memasukkan fungsi scanner
        Scanner in = new Scanner(System.in);
        //deklarasi variabel string
        String nama, alamat;
        //instansiasi suatu objek baru
        Apotek farma = new Apotek();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                    APOTEK FARMA");
        System.out.println("          Kesehatan Anda Kebahagiaan Kami");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        //menampilkan daftar obat dengan memanggil method daftarObat
        farma.daftarObat();
        System.out.println("Pembelian Obat, harus disertai Nama dan alamat Anda");
        System.out.println("silahkan masukkan nama dan alamat anda ");
        //memasukkan nama dan alamat
        System.out.println("Nama      : ");
        nama = in.nextLine();
        System.out.println("Alamat    : ");
        alamat = in.nextLine();
        //overloading constructor berdasar inputan variabel nama dan alamat
        farma.Apotek(nama, alamat);
        //pemanggilan method pesan
        farma.Pesan();
        //pemanggilan method Display untuk menampilkan total harga
        farma.Display();
    }
}
