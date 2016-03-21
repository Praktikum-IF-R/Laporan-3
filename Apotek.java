package laporan_bab_3;
 import java.util.Scanner;
public class Apotek {

    Scanner input = new Scanner(System.in);
    private String Nama;
    private String Alamat;
    private double Harga;
    private double barang;
    private double total;

    public Apotek(String Nama) {
        this.Nama = Nama;
    }

    public Apotek(String Nama, String Alamat) {
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public void menuApotek() {
        System.out.println("\n-------------APOTEK BRAWIJAYA--------------- ");
        System.out.println("1. Kalpanax\t\t: 5.000");
        System.out.println("2. Panadol\t\t: 2.000");
        System.out.println("3. Caladine\t\t: 7.000");
        System.out.println("4. Antangin\t\t: 2.000");
        System.out.println("5. Keluar");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        pilihanObat(pilihan);
    }

    public void pilihanObat(int nomorObat) {
        int kalpanax = 4000;
        int panadol = 2000;
        int caladine = 8500;
        int antangin = 2500;
        switch (nomorObat) {
            case 1:
                System.out.println("Kalpanax\t: Rp" + kalpanax);
                total += kalpanax;
                break;
            case 2:
                System.out.println("Panadol\t: Rp." + panadol);
                total += panadol;
                break;
            case 3:
                System.out.println("Caladine\t: Rp." + caladine);
                total += caladine;
                break;
            case 4:
                System.out.println("Antangin\t: Rp." + antangin);
                total += antangin;
                break;
            case 5:
                System.out.println("Keluar dari pilihan");
                System.exit(0);
            default:
                System.out.println("Input anda salah");
                System.exit(0);
        }
        System.out.println("Total pembayaran : Rp." + total);
    }

    public void displayMessage() {
        System.out.println("Nama\t: " + Nama);
        System.out.println("Alamat\t: " + Alamat);
    }
}


