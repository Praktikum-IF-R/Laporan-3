package BAB3;
import java.util.*;
public class SOAL2 {
    String obatPil[] = {" ", "morfin", "nikotin", "oskadon", "panadol", "bisolfon", "kokain", "bodrexin", "paramex", "OBH", "tetra"};
    Scanner in = new Scanner(System.in);
    int hargaPil[] = {90000, 30000, 340000, 90000, 10000};
    String nama;
    String alamat;
    String obat;
    int pilih, banyak;
    static SOAL2 user[] = new SOAL2[100];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan banyak pasien (max 100): ");
        int banyak = in.nextInt();
        for (int i = 0; i < banyak; i++) {
            user[i] = new SOAL2();
            user[i].setNama();
            user[i].setAlamat();
            user[i].getObat(i);
            user[i].print(i);
            user[i] = new SOAL2(user[i].nama, user[i].alamat);
            user[i] = new SOAL2(user[i].obat);
        }
    }
    public SOAL2() {
    }
    public SOAL2(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public SOAL2(String obat) {
        this.obat = obat;
    }
    void setNama() {
        System.out.println("masukkan nama pasien : ");
        this.nama = in.nextLine();
    }
    void setAlamat() {
        System.out.println("mauskkan alamat pasien : ");
        this.alamat = in.nextLine();
    }
    String getObat(int i) {
        System.out.println("~~~~~~~~~~nama obat~~~~~~~~~~~");
        System.out.println("1. morfin\t6. kokain");
        System.out.println("2. nikotin\t7. bodrexin");
        System.out.println("3. oskadon\t8. paramex");
        System.out.println("4. panadol\t9. OBH");
        System.out.println("5. bisolvon\t10. tetra");
        System.out.println("5. bisolvon\t10. tetra");
        boolean t = true;
        while (t) {
            System.out.println("pilih obat : ");
            pilih = in.nextInt();
            t = user[i].pilihanObat(pilih);
        }
        this.obat = obatPil[pilih];
        return String.format("%s %s", "obat yang anda pilih adalah", obatPil[pilih]);
    }
    boolean pilihanObat(int pilih) {
        boolean t = false;
        System.out.println("obat anda adalah " + obatPil[pilih]);
        System.out.println("berapa obat : ");
        banyak = in.nextInt();
        return t;
    }
    String getHarga(int pilih) {
        int harga = pilih % 5;
        return String.format("%s %d", "harga yang harus dibayar pasien : Rp.", (hargaPil[harga]) * banyak);
    }
    void print(int i) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~ nama : " + user[i].nama);
        System.out.println("~ alamat : " + user[i].alamat);
        System.out.println("~ obat : " + user[i].obat);
        System.out.println(user[i].getHarga(pilih));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
