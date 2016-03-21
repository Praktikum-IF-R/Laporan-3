import java.util.Scanner;
public class mainapotek {
    public static void main(String[] args) {
        Scanner aw= new Scanner (System.in);
        System.out.println("***************************************");
        System.out.println("    SISTEM INFORMASI PENJUALAN OBAT    ");
        System.out.println("***************************************");
        System.out.print("Masukkan nama: ");
        String n= aw.nextLine();
        System.out.print("Masukkan alamat: ");
        String a= aw.nextLine();
        apotek sakit = new apotek(n,a);
        sakit.display();
        System.out.print("Ingin membeli berapa jenis obat? ");
        int jum= aw.nextInt();
        System.out.println("***************************************");
        System.out.println(" Anda akan membeli "+jum+" jenis obat ");
        sakit.trans(jum);
        sakit.trans();
    }
}
