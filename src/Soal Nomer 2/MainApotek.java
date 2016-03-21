
import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\tSelamat Datang!");
        System.out.println("\t    Apotek     ");
        System.out.print("Silahkan masukan nama anda : ");
        String nama = in.nextLine();
        System.out.print("Silahkan masukan alamat anda : ");
        String alamat = in.nextLine();
        Apotek apotik = new Apotek(nama, alamat);
        int a;
        do {
            System.out.println("Menu");
            System.out.println("1.Tampilkan Daftar Obat");
            System.out.println("2. PIlih Obat");
            System.out.println("3.Keluar");
            System.out.println("Pilih : ");
            a = in.nextInt();
            switch (a) {
                case 1:
                    Daftar();
                    break;
                case 2:
                    Daftar(1);
                    break;
                case 3:
                    System.out.println("Selamat Tinggal");
                default:
                    System.out.println("Coba angka lain coba aja");
                    System.out.println("Siapa tau bisa");
                    
           
            }
        } while (a != 3);
    }

    public static void Daftar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama Obat               Harga");
        System.out.println("Paracetamol         Rp 11.000");
        System.out.println("Meloxicam           Rp 50.000");
        System.out.println("Mariujana           Rp 75.000");
        System.out.println("Morphin             Rp  2.000");
        System.out.println("Fluedent            Rp 25.000");
        System.out.println("NEuralgin           Rp 10.000");
        System.out.println("Kanaldint           Rp  7.500");
    }

    public static void Daftar(int b) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Apotek apotik = new Apotek();
        int a;
        do {
            System.out.println("Masukan nama obat : ");
            String obat = input.nextLine();
            apotik.setObat(obat);
            System.out.println("Masukan Harga : ");
            int harga = in.nextInt();
            apotik.setHarga(harga);
            apotik.Jumlah();
            apotik.displayMessage();
            System.out.println("Apa anda ingin memilih lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println("Pilih : ");
            apotik.displayMessage();
            a = in.nextInt();

        } while (a != 2);
    }
}
