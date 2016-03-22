package praktikum2_overloading;

import java.util.Scanner;

public class Apotek {

    private String nama, alamat, obat1, obat2, pilihan;
    private int harga, total;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    

    public Apotek() {
    }

    public Apotek(String a) {
        obat1 = a;
    }

    public Apotek(String a, String b) {
        obat1 = a;
        obat2 = b;
    }

    public void Apotek(String obat1) {
        if (obat1.equalsIgnoreCase("1") || obat1.equalsIgnoreCase("Amoxil")) {
            total += 10000;
        } else if (obat1.equalsIgnoreCase("2") || obat1.equalsIgnoreCase("Astelin")) {
            total += 15000;
        } else if (obat1.equalsIgnoreCase("3") || obat1.equalsIgnoreCase("Atrovent")) {
            total += 20000;
        } else if (obat1.equalsIgnoreCase("4") || obat1.equalsIgnoreCase("Deltasone")) {
            total += 25000;
        } else if (obat1.equalsIgnoreCase("5") || obat1.equalsIgnoreCase("Diamox")) {
            total += 30000;
        }
    }

    public void Apotek(String obat1, String obat2) {
        if (obat1.equalsIgnoreCase("1") || obat1.equalsIgnoreCase("Amoxil")) {
            total += 10000;
        } else if (obat1.equalsIgnoreCase("2") || obat1.equalsIgnoreCase("Astelin")) {
            total += 15000;
        } else if (obat1.equalsIgnoreCase("3") || obat1.equalsIgnoreCase("Atrovent")) {
            total += 20000;
        } else if (obat1.equalsIgnoreCase("4") || obat1.equalsIgnoreCase("Deltasone")) {
            total += 25000;
        } else if (obat1.equalsIgnoreCase("5") || obat1.equalsIgnoreCase("Diamox")) {
            total += 30000;
        }
        if (obat2.equalsIgnoreCase("1") || obat2.equalsIgnoreCase("Amoxil")) {
            total += 10000;
        } else if (obat2.equalsIgnoreCase("2") || obat2.equalsIgnoreCase("Astelin")) {
            total += 15000;
        } else if (obat2.equalsIgnoreCase("3") || obat2.equalsIgnoreCase("Atrovent")) {
            total += 20000;
        } else if (obat2.equalsIgnoreCase("4") || obat2.equalsIgnoreCase("Deltasone")) {
            total += 25000;
        } else if (obat2.equalsIgnoreCase("5") || obat2.equalsIgnoreCase("Diamox")) {
            total += 30000;
        }
    }

    public void pilihobat(String sakit) {
        if (sakit == "flu") {
            System.out.println("Sakit Anda            : "+sakit);
            System.out.println("Obat Anda             : Amoxil");
        } else if (sakit == "diare") {
            System.out.println("Sakit Anda            : "+sakit);
            System.out.println("Obat Anda             : Astelin");
        } else if (sakit == "alergi") {
            System.out.println("Sakit Anda            : "+sakit);
            System.out.println("Obat Anda             : Atrovent");
        } else if (sakit == "panas") {
            System.out.println("Sakit Anda            : "+sakit);
            System.out.println("Obat Anda             : Deltason");
        } else if (sakit == "pusing") {
            System.out.println("Sakit Anda            : "+sakit);
            System.out.println("Obat Anda             : Diamox");
        }

    }

    public void pilihobat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilihan Daftar Obat");
        System.out.println("1. Amoxil \t\t Rp. 10000");
        System.out.println("2. Astelin \t\t Rp. 15000");
        System.out.println("3. Atrovent \t\t Rp. 20000");
        System.out.println("4. Deltasone \t\t Rp. 25000");
        System.out.println("5. Diamox \t\t Rp. 30000");
        System.out.println("--------------------------------------");
        String ulang;
        do {
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = in.next();

            if (pilihan.equalsIgnoreCase("1") || pilihan.equalsIgnoreCase("Amoxil")) {
                total += 10000;
            } else if (pilihan.equalsIgnoreCase("2") || pilihan.equalsIgnoreCase("Astelin")) {
                total += 15000;
            } else if (pilihan.equalsIgnoreCase("3") || pilihan.equalsIgnoreCase("Atrovent")) {
                total += 20000;
            } else if (pilihan.equalsIgnoreCase("4") || pilihan.equalsIgnoreCase("Deltasone")) {
                total += 25000;
            } else if (pilihan.equalsIgnoreCase("5") || pilihan.equalsIgnoreCase("Diamox")) {
                total += 30000;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
            System.out.print("Apakah Anda mau membeli obat lagi? [y/n] : ");
            ulang = in.next();
        } while (ulang.equalsIgnoreCase("y"));
    }

    public void total() {
        System.out.println("Total harga           : Rp " + total);
    }
}
