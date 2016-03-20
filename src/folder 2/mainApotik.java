package sisteminformasiapotik;

import java.util.Scanner;

public class mainApotik {

    public static void main(String args[]) {
        int a;
        Apotik pengguna1 = new Apotik();
        Scanner inI = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        System.out.println("\t SELAMAT DATANG DI APOTIK CIPTA SEHAT");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.print("Masukkan Nama   : ");
        String nama = inS.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = inS.nextLine();
        pengguna1.setInformasi(nama, alamat);
        Apotik pc1 = new Apotik(nama, alamat);
        System.out.println("");
        do {
            System.out.println("==> MENU TAMPILAN OBAT PADA APOTIK CIPTA");
            System.out.println("1. obat batuk ");
            System.out.println("2. obat pilek ");
            System.out.println("3. obat pusing ");
            System.out.println("4. obat demam ");
            System.out.println("5. obat mata ");
            System.out.println("6. obat kulit ");
            System.out.print("Masukkan nama obat: ");
            String namaobat = inS.nextLine();
            System.out.print("Berapa banyak: ");
            int banyak = inI.nextInt();

            pengguna1.Hitungtotal(namaobat, banyak);
            pengguna1.setInformasi(namaobat, banyak);
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("");
            System.out.println("==> BELI OBAT LAGI? ");
            System.out.println(" 1. IYA ");
            System.out.println(" 2. TIDAK ");
            System.out.print("MASUKKAN PILIHAN : ");
            a = inI.nextInt();
            System.out.println("");
        } while (a == 1);
        pengguna1.TampilAkhir();
    }
}
