package apotek;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        double harga, jumlahobat;
        String nama, alamat;
        double obat1, obat2, obat3;
        String d,p="y";
        int exit;
        

        System.out.print("Masukkan nama   : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = input.nextLine();
        Apotek A1 = new Apotek (nama,alamat);
        
        do{
        System.out.println("====================================");
        System.out.println("Sistem Informasi Penjualan Apotek");
        System.out.println("====================================");
        System.out.println("Pilihan Daftar Obat\tHarga");
        System.out.println("\n1.Obat Flu\t\tRp 4000");
        System.out.println("2.Obat Batuk\t\tRp 5000");
        System.out.println("3.Obat Sakit Kepala\tRp 6000");
        System.out.println("====================================");
        
        System.out.print("Masukkan pilihan : ");
        int pilihan=input.nextInt();
        switch(pilihan){
            case 1 : System.out.print("Masukkan jumlah obat : ");
                     jumlahobat = in.nextInt();
                     A1.setJumlahObat(jumlahobat);
                     A1.setObat1(); break;
            case 2 : System.out.print("Masukkan jumlah obat : ");
                     jumlahobat = in.nextInt();
                     A1.setJumlahObat(jumlahobat);
                     A1.setObat2(); break;
            case 3 : System.out.print("Masukkan jumlah obat : ");
                     jumlahobat = in.nextInt();
                     A1.setJumlahObat(jumlahobat);
                     A1.setObat3(); break;
            default : System.out.println("Obat Tidak tersedia dalam daftar. . ."); break;
        }
            System.out.print("Apakah anda ingin melakukan pembelian obat lagi ? (y/n) : ");
            d=in.next();
        }while (p.equalsIgnoreCase(d));
            A1.HargaObat();
            A1.displayMessage();
    }
}
