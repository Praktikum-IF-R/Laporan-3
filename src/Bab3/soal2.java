package Bab3;

import java.util.Scanner;

public class soal2 {

    Scanner s = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    private String nama;
    private String alamat;
    private int total = 0;

    String soal2[][] = {{"111", "Amoxicillin 500 mg", "500"},
    {"112", "Tolak Angin Cair Madu 15 ml", "2500"},
    {"113", "Panadol 500 mg Kaplet", "700"},
    {"114", "CDR (Calcium D Redoxon) Tablet 20s", "73500"},
    {"115", "Sangobion Drop 15 ml", "38200"},
    {"116", "Hemaviton Skin Nutrient Capsul", "26300"},
    {"117", "Thyrax 100 mcg Tablet", "2600"},
    {"118", "Paracetamol 500 mg Kaplet", "100"},
    {"119", "Dulcolax 5 mg Tablet", "1250"},
    {"120", "Neurobion Tablet ", "1550"}};

    public soal2() {

    }

    public soal2(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void Data(String nama, String alamat) {
        System.out.print("\nEnter nama   : ");
        nama = s.nextLine();
        getNama();
        System.out.print("Enter alamat : ");
        alamat = s.nextLine();
        getAlamat();
        Data();
    }

    public void Data() {
        System.out.print("Input banyak obat yang ingin dipesan : ");
        int banyak = s2.nextInt();
        int Harga[] = {500, 2500, 700, 73500, 38200, 26300, 2600, 100, 1250, 1550};

        for (int j = 0; j < banyak; j++) {
            System.out.print("\nMasukkan Kode Obat ke-" + (j + 1) + "   : ");
            int kode = s2.nextInt();
            int x = kode - 111;
            System.out.println("Keterangan Obat : \n" + soal2[x][1] + " (Rp. " + soal2[x][2] + ")");

            total += Harga[x];
        }
        System.out.println("\n-------------------------------------------------------");
        System.out.println(" Total yang harus dibayar : Rp. " + total);
        System.out.println("-------------------------------------------------------");
        System.out.printf("\n%-20s %-20s", " ", "   TERIMAKASIH");
        System.out.printf("\n %-18s %-25s", " ", "SEMOGA LEKAS SEMBUH\n");
    }

}
