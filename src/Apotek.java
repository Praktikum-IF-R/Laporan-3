
package latihan2;

import java.util.Scanner;
public class Apotek{

    static String[] Obat = {"Batuk   ", "Demam   ", "Cacingan", "Hemofilia", "Maag    ", "Diare   "};
    static int[] hargaObat = {20000, 25000, 15000, 60000, 10000, 20000};
    static String [] beli = new String[50];
    static int [] harga = new int[50];
    static int [] jumlah = new int[50];
    public static String nama, alamat, umur;
    public static int total,i=0;
    static Scanner in = new Scanner(System.in);
    public Apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public Apotek(String umur) {
        this.umur = umur;
    }
    public static void menu() {
        int pilihan = 0;
        do {
            System.out.println("\t\nDAFTAR OBAT");
            System.out.println("\nSAKIT\t\t\tHARGA OBAT");
            for (int i = 0; i < (hargaObat.length); i++) {
                System.out.println((i + 1) + ". " + Obat[i] + "\t\t " + "Rp. "+hargaObat[i]);
            }
            System.out.println("0. BAYAR");
            System.out.print("Pilih Obat yang akan dibeli : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 0:
                    pembelian(nama, alamat, umur);
                    pembelian();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    pembelian(Obat[pilihan-1], hargaObat[pilihan-1] ,(pilihan-1));
                    break;
                default:
                    System.out.println("Obat Tidak Tersedia");
                    break;
            }
        } while (pilihan != 0);
    }   
    public static void pembelian(String beli1, int harga1 ,int nmr){
        System.out.print("Jumlah obat : ");
        jumlah[i] = in.nextInt();
        beli[i] = beli1;
        harga[i] = harga1;
        total += (jumlah[i] * harga[i]);        
        i++;        
    }
    public static void pembelian(String nama, String alamat, String umur){
        System.out.println();
        System.out.println("Data Costumer : ");
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Umur   : "+umur);
        System.out.println("\nObat yg dibeli : ");
        System.out.println("NAMA\t\tHARGA\t\tJMLH");
    }
    public static void pembelian(){
        for(int i = 0; i <beli.length;i++){
            if(jumlah[i]==0){
                break;
            }
            System.out.print(beli[i]);
            System.out.print("\t Rp. "+harga[i]);
            System.out.println("\t"+jumlah[i]);        
        }
        System.out.println("===================================");
        System.out.print("TOTAL : " +"Rp");
        System.out.println(total);
        System.out.println("TERIMA KASIH, LEKAS SEMBUH YA :)");
    }
}

