package mainapotek;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Apotek pas = new Apotek();
        String nm, al, jwb;
        int jml;
        String obat[] = new String [20];
        double harga = 0;
        System.out.println("-------------------------------------");
        System.out.println("  SISTEM INFORMASI PENJUALAN APOTEK  ");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan nama anda      : ");
        nm = in.nextLine();
        System.out.print("Masukkan alamat anda    : ");
        al = in.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("           Daftar Obat               ");
        System.out.println("1. Obat Diare");
        System.out.println("2. Obat Sakit Kepala");
        System.out.println("3. Obat Demam");
        System.out.println("4. Obat Flu");
        pas.obat();
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("     *** DETAIL PEMBAYARAN ***       ");    
        pas.datapasien(nm, al);
        pas.daftarobat();
        System.out.println("");
        System.out.println("        *** TERIMA KASIH ***         ");
        System.out.println("    *** SEMOGA LEKAS SEMBUH ***      ");
        System.out.println("=====================================");
    }   
}