package praktikum3_2;
import java.util.Scanner;
public class ApotekMain {
    public static void main(String[] args) {
        Apotek ardia = new Apotek();
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("\tApotek Insha Allah Sehat");
        System.out.println("=======================================");
        System.out.println("Nama obat \t\tHarga obat");
        System.out.println("1. Paracetamol \t\tRp 3000");
        System.out.println("2. Tolak Angin \t\tRp 4500");
        System.out.println("3. Betadine \t\tRp 5000");
        System.out.println("4. Minyak Kayu Putih \tRp 7000");
        System.out.println("5. OBH \t\t\tRp 10000");
        System.out.println("6. Mefinal \t\tRp 13000");
        System.out.println("7. Total");
        System.out.println("=======================================");
        System.out.println();
        System.out.print("Nama anda: \t");
        ardia.setNama(in.nextLine());
        System.out.print("Alamat anda: \t");
        ardia.setAlamat(in.nextLine());
        System.out.println();
        while (ardia.getPilihan() <= 6) {
            System.out.print("Masukkan pilihan anda: \t");
            ardia.setPilihan(in.nextInt());
            if (ardia.getPilihan() != 7) {
                System.out.print("Jumlah obat: \t\t");
                ardia.setJumlah(in.nextInt());
            }
            System.out.println();
            ardia.getHarga();
        }
        System.out.println("Pembeli atas nama " + ardia.getNama() + "\nBeralamat di " + ardia.getAlamat());
        System.out.println("------------------------------------");
    }
}