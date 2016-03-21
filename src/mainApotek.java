package apotek;
import java.util.Scanner;
public class mainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pil;
        System.out.print("Nama : ");
        String n =  in.nextLine();
        System.out.print("Alamat : ");
        String almt = in.nextLine();
        Apotek pilihan = new Apotek (n, almt);
        System.out.println("");
        System.out.println("=====Selamat Datang=====");
        System.out.println("====Di Apotek Amanah====");
        System.out.println("Daftar obat        Harga");
        System.out.println("1. Promag          2000");
        System.out.println("2. Paracetamol     5000");
        System.out.println("3. Paramex         7500");
        System.out.println("4. Amoksilin       10000");
        System.out.println("");
            System.out.print("Masukkan pilihan : ");
            pil = in.nextInt();
            switch (pil){
                case 1:
                    System.out.print("Jumlah : ");
                    int a = in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat1();
                    break;
                case 2:
                    System.out.print("Jumlah : ");
                    a = in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat2();
                    break;
                case 3:
                    System.out.print("Jumlah : ");
                    a = in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat3();
                    break;
                case 4:
                    System.out.print("Jumlah : ");
                    a = in.nextInt();
                    pilihan.jumlah(a);
                    pilihan.obat4();
                    break;
                default:
                    System.out.println("Barang tidak tersedia");
            }
            pilihan.Totalharga();
            pilihan.displayMessage();
                    
    }
}
