import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String nambah;
        int harga, jumlah, hargatotal;
        Scanner input = new Scanner(System.in);
        System.out.println("      Apotek  Maju Sehat");
        System.out.println("==================================");
        System.out.print("Nama       : ");
        String nama = input.next();
        System.out.print("Alamat     : ");
        String alamat = input.next();

        System.out.println("==================================");
        System.out.println("             Daftar Obat          ");
        System.out.println("==================================");
        System.out.println("1. Paramex                Rp  3000 ");
        System.out.println("2. Boderexin              Rp  5000");
        System.out.println("3. Panadol                Rp  6000");
        System.out.println("4. Enervonce              Rp 15000");
        System.out.println("5. Oskadon                Rp  3000 ");
        System.out.println("==================================");
        Apotek buy = new Apotek(); 
        do{
        System.out.print("Pilih Obat     : ");
        int pil = input.nextInt();
        System.out.print("Jumlah         : ");
        int jml = input.nextInt();
        buy.Obat(pil,jml);
        System.out.print("Beli lagi (Y/N): ");
            nambah = input.next();

        }while(nambah.equalsIgnoreCase("y"));
        System.out.println("==================================");
        buy.Obat();

    }
}