package javaapplication84;
import java.util.Scanner;
public class Main {
    public static void menu() {
        System.out.println("========================");
        System.out.println("Selamat Datang Di APOTEK ANITA");
        System.out.println("========================");
        System.out.println("1.Daftar Obat");
        System.out.println("2.Beli Obat");
        System.out.println("3.Cetak Struk");
        System.out.println("4.Lihat Data Penjualan");
        System.out.println("5.Selesai");
        System.out.print("Masukkan nomor : ");
    }
    public static void main(String[] args) {
        String penjualan[][] = new String[10][3];
        String obat[][] = {{"Antalgin", "1500"}, 
                           {"Antimo Anak", "2000"}, 
                           {"Antimo Dewasa", "2500"}, 
                           {"Promag", "3000"}, 
                           {"Paracetamol", "3500"},
                           {"Panadol", "1500"},
                           {"Bodrex", "2000"},
                           {"Minyak kayu putih", "9000"},
                           {"Antangin", "2500"},
                           {"Diapet", "3000"}};

        Scanner input = new Scanner(System.in);
        JavaApplication84 anita = new JavaApplication84();
        for (int o = 0; o < penjualan.length; o++) {
    penjualan[o][0] = "Kosong";
    penjualan[o][1] = "Kosong";
    penjualan[o][2] = "0";
        }
        anita.baru(penjualan, obat);
        boolean ulangi = true;
        while (ulangi) {
            menu();
            
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    anita.displayObat();
                    break;
                case 2:
                    System.out.print("Masukkan nama pembeli : ");
                    penjualan[anita.terjual][0] = input.nextLine();
                    penjualan[anita.terjual][0] = input.nextLine();
                    System.out.print("Masukkan alamat pembeli : ");
                    penjualan[anita.terjual][1] = input.nextLine();
                    while (ulangi) {
                        anita.displayObat();
                        System.out.print("Masukkan Nomor Obat  : ");
                        int pilih = input.nextInt();
                        System.out.print("Masukkan jumlah Obat : ");
                        int jum = input.nextInt();
                        anita.Obat(pilih, jum);
                        System.out.print("Apakah Anda ingin Menambah Pembelian Obat lagi (Y/N)? ");
                        String x = input.next();
                        if (x.equalsIgnoreCase("Y")) {
                            ulangi = true;
                        } else if (x.equalsIgnoreCase("N")) {
                        penjualan[anita.terjual][2] = String.valueOf(anita.total);
                            anita.total = 0;
                            ulangi = false;
                        } else {
                            ulangi = true;
                        }
                    }
                    ulangi = true;
                    anita.terjual = anita.terjual + 1;
                    break;
                case 3:
                    for (int o = 0; o < penjualan.length; o++) {
                        int nomor = o + 1;
                        System.out.println(nomor + "." + penjualan[o][0]);
                    }
                    System.out.print("Pilih Nomor Penjualan : ");
                    int nom = input.nextInt();
                    anita.Obat(nom);
                    ulangi = true;
                    break;
                case 4:
                    anita.displayPenjualan();
                    ulangi = true;
                    break;
                case 5:
                    ulangi = false;
                    System.out.println("Terimakasih Telah Berbelanja di Apotek Anita ,Maaf Atas Ketidak Nyamanan Anda");
                    break;
                default:
                    ulangi = true;
                    break;
                    
            }
        }
    }
}
