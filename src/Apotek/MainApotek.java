package apotek;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        String obat;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Pelanggan :");
        String nama = input.nextLine();
        System.out.println("Masukkan Alamat Pelanggan :");
        String alamat = input.nextLine();
        Apotek a = new Apotek(nama, alamat);
        a.DaftarObat();
        do {
            System.out.println("Masukkan Nama Obat yang akan anda pilih :");
            obat = input.nextLine();
            a.pesanObat(obat);
        } while ((!(obat.equalsIgnoreCase("stop"))));
        a.totalharga();
    }
}
