package mainapotek;
import java.util.Scanner;
public class MainApotek {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        int pilih = 0;
        int harga=0,total=0, jml=0;
        System.out.print("Masukkan Nama   : ");
        String nama = in.next();
        System.out.print("Masukkan Alamat : ");
        String alamat = in.next();
        Apotek pembeli = new Apotek(nama,alamat);
        do{
            System.out.println("No.\tNama Obat\tHarga");
            System.out.println("----------------------------------");
            System.out.println("1.\tObat Batuk\tRp 15000");
            System.out.println("2.\tObat Diare\tRp 10000");
            System.out.println("3.\tObat Cacing\tRp 12000");
            System.out.println("4.\tObat Migrain\tRp 14000");
            System.out.println("5.\tSelesai");
            System.out.println("----------------------------------");
            System.out.print("Masukkan pilihan : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    pembeli.setObat("Obat Batuk");
                    pembeli.setObat(15000);
                    System.out.println("Anda Membeli "+pembeli.getNamaObat());
                    System.out.print("Jumlah beli : ");
                    jml = input.nextInt();              
                    harga = jml*pembeli.getHargaObat();
                    total +=harga;
                    System.out.println("Total Pembayaran : Rp "+total);
                    System.out.println("==================================");break;
                case 2:
                    pembeli.setObat("Obat Diare");
                    pembeli.setObat(10000);
                    System.out.println("Anda Membeli "+pembeli.getNamaObat());
                    System.out.print("Jumlah beli\t : ");
                    jml = input.nextInt();
                    harga = jml*pembeli.getHargaObat();
                    total +=harga;
                    System.out.println("Total Pembayaran : Rp "+total);
                    System.out.println("==================================");break;
                case 3:
                    pembeli.setObat("Obat Cacing");
                    pembeli.setObat(12000);
                    System.out.println("Anda Membeli "+pembeli.getNamaObat());
                    System.out.print("Jumlah beli : ");
                    jml = input.nextInt();
                    harga = jml*pembeli.getHargaObat();
                    total +=harga;
                    System.out.println("Total Pembayaran : Rp "+total);
                    System.out.println("==================================");break;
                case 4:
                    pembeli.setObat("Obat Migrain");
                    pembeli.setObat(14000);
                    System.out.println("Anda Membeli "+pembeli.getNamaObat());
                    System.out.print("Jumlah beli : ");
                    jml = input.nextInt();
                    harga = jml*pembeli.getHargaObat();
                    total +=harga;
                    System.out.println("Total Pembayaran : Rp "+total);
                    System.out.println("==================================");break;
                case 5:
                    System.out.println("Nama\t\t : "+pembeli.getNamaPembeli());
                    System.out.println("Alamat\t\t : "+pembeli.getAlamatPembeli());
                    System.out.println("Total Pembayaran : Rp "+total);
                    System.out.println("==================================");break;
                    
            }
        }while(pilih>=1 && pilih <5);
    }
}