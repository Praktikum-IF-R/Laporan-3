package Laporan3;

/**
 *
 * @author Wahyu Ridiansyah
 */
import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner wahyu = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("      Sistem Informasi Penjualan WR-Apotek");
        System.out.println("===============================================");
        System.out.print("Nama    : ");
        String n = wahyu.next();
        System.out.print("Alamat  : ");
        String a = wahyu.next();
        Apotek user = new Apotek(n, a);
        Apotek price = new Apotek(0);

        int pilihan;
        int hargaObat;

        System.out.println("-----------------------------------------------");
        System.out.println("[Daftar Obat dan Harga]");
        System.out.println("-----------------------------------------------");
        System.out.println("[Code: 001] Aclam Caplet              (200.000 IDR)");
        System.out.println("[Code: 002] Aclam Dry Syrup           (55.000 IDR)");
        System.out.println("[Code: 003] Bactoprim Combi Syrup     (13.000 IDR)");
        System.out.println("[Code: 004] Baquinor Tetes Mata       (37.000 IDR)");
        System.out.println("[Code: 005] Calcidin Tablet           (21.000 IDR)");
        System.out.println("+ [Code 006] Proses Pesanan Obat ->");

        do {
            System.out.println("-----------------------------------------------");
            System.out.print("Input Code : ");
            pilihan = wahyu.nextInt();

            switch (pilihan) {
                case 001:
                    hargaObat = 200000;
                    user.Obat(hargaObat);
                    System.out.println("-> Aclam Caplet: 200.000 IDR");
                    break;
                case 002:
                    hargaObat = 55000;
                    user.Obat(hargaObat);
                    System.out.println("-> Aclam Dry Syrup: 55.000 IDR");
                    break;
                case 003:
                    hargaObat = 13000;
                    user.Obat(hargaObat);
                    System.out.println("-> Bactoprim Combi Syrup: 13.000 IDR");
                    break;
                case 004:
                    hargaObat = 37000;
                    user.Obat(hargaObat);
                    System.out.println("-> Baquinor Tetes Mata: 37.000 IDR");
                    break;
                case 005:
                    hargaObat = 21000;
                    user.Obat(hargaObat);
                    System.out.println("-> Calcidin Tablet: 21.000 IDR");
                    break;
                case 006:
                    user.Obat(n, a);
                default:
            }
        } while (pilihan != 6);
    }
}
