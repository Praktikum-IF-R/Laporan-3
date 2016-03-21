import java.util.Scanner;
public class mainApotek {
    public static void main(String[]args){
        Apotek A = new Apotek();
        Scanner i = new Scanner (System.in);
        System.out.println("======= APOTEK K24 JAM =======");
        System.out.println("Daftar Obat yang Tersedia:");
        String[][]obat2 = {{"Nama Obat","\t||Harga/pil"},
            {"1. Inzana           ||","650"},
            {"2. Panadol          ||","300"},
            {"3. Bodrex Flu       ||","400"},
            {"4. Bodrex Flu & Btk ||","700"},
        };
        for (String[] obat21 : obat2) {
            System.out.println(obat21[0] + obat21[1]);
        }
        System.out.println("====== FORM PEMESANAN ======");
        System.out.print("Nama: ");
        String nama = i.next();
        i.nextLine();
        System.out.print("No. HP: ");
        String hp = i.next();
        i.nextLine();
        System.out.print("Alamat: ");
        String alamat = i.next();
        i.nextLine();
        System.out.print("Input pilihan obat yg ingin dibeli: ");
        int pilih = i.nextInt();
        int ubah = Integer.parseInt(obat2[pilih][1]);
        System.out.print("Input jumlah obat yg ingin dibeli: ");
        A.setJumlah(i.nextInt());
        A.hitungtotal();
        int total = ubah*A.hitungtotal();
        System.out.println("Total pembelian anda Rp"+total);
    }
}