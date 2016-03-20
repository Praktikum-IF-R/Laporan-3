package Laporan3;

/**
 *
 * @author Wahyu Ridiansyah
 */
public class Apotek {

    String nama;
    String alamat;
    int total = 0;
    int harga;

    public Apotek(String n, String a) {
        nama = n;
        alamat = a;
    }

    public Apotek(int h) {
        harga = h;
    }

    public void Obat(int h) {
        harga = h;
        total = total + h;
    }

    public void Obat(String b, String c) {
        nama = b;
        alamat = c;
        System.out.println("===============================================");
        System.out.println("-------------------------------------");
        System.out.println("Nota Pembayaran");
        System.out.println("-------------------------------------");
        System.out.println("*Untuk Mengambil Obat");
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Total Yang Harus dibayar : " + total + " IDR");
        System.out.println("-------------------------------------");
        System.out.println("===============================================");
    }
}
