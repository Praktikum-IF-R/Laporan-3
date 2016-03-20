package Apotik;
import java.util.Scanner;
public class MainApotik {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int jumlah, harga;
    int total;
    String pil = "";
    System.out.println("SELAMAT DATANG DI APOTIK BRAWIJAYA");
    System.out.println("==================================");
    System.out.print("Nama : ");
    String nama = in.nextLine();
    System.out.print("Jenis Pembayaran : ");
    String jp = in.nextLine();
    Apotik fd = new Apotik(nama,jp);
    fd.DaftarObat();
    do{
    System.out.print("Obat yang akan anda beli : ");
    int obat = in.nextInt();
    switch(obat){
        case 1 :fd.setObat("Obat Penghilang Kenangan Masa Lalu");
                fd.setObat(5000);
                System.out.print("Jumlah yang dibeli : ");
                jumlah = in.nextInt();
                total = jumlah*5000;
                System.out.println("Nama Obat : "+fd.getNamaObat());
                System.out.println("Total : Rp. "+total+",-");
                System.out.print("Ada lagi yang ingin dibel(Y/N)? ");
                pil = in.next(); break;
        case 2 :fd.setObat("Obat Penghilang Galau");
                fd.setObat(6000);
                System.out.print("Jumlah yang dibeli : ");
                jumlah = in.nextInt();
                total = jumlah*6000;
                System.out.println("Nama Obat : "+fd.getNamaObat());
                System.out.println("Total : Rp. "+total+",-");
                System.out.print("Ada lagi yang ingin dibel(Y/N)? ");
                pil = in.next(); break;
        case 3 :fd.setObat("Obat Memperindah Wajah");
                fd.setObat(7000);
                System.out.print("Jumlah yang dibeli : ");
                jumlah = in.nextInt();
                total = jumlah*7000;
                System.out.println("Nama Obat : "+fd.getNamaObat());
                System.out.println("Total : Rp. "+total+",-");
                System.out.print("Ada lagi yang ingin dibel(Y/N)? ");
                pil = in.next(); break;
        case 4 :fd.setObat("Sianida");
                fd.setObat(8000);
                System.out.print("Jumlah yang dibeli : ");
                jumlah = in.nextInt();
                total = jumlah*8000;
                System.out.println("Nama Obat : "+fd.getNamaObat());
                System.out.println("Total : Rp. "+total+",-");
                System.out.print("Ada lagi yang ingin dibel(Y/N)? ");
                pil = in.next(); break;
        }    
    }while(pil.equalsIgnoreCase("Y"));
    
    System.out.println("\nTerima Kasih dan datang kembali!! ^_^");
       }
    }

