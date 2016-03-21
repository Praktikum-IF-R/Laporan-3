package overconsturctor;
import java.util.Scanner;
public class Overconsturctor {
    
    
    public static void menu(){
        System.out.println("Selamat Datang Di Apotik Sayang Bingung");
        System.out.println("=======================================");
        System.out.println("1.Panadol / Rp 20000");
        System.out.println("2.Paramex / Rp 30000");
        System.out.println("3.Bisolvon / Rp 50000");
        System.out.println("4.Actived / Rp 80000");
        System.out.println("5.Decolgen / Rp 90000");
    }


    public static void main(String[] args) {
        int a = 0; String pilihan;
        Overconstructorclass obat[] = new Overconstructorclass[10];
        Scanner in = new Scanner(System.in); 
        System.out.print("Masukkan nama : ");
        String nama = in.next();
        System.out.print("Masukkan alamat :");
        String alamat = in.next();
        System.out.println("");
        do{
            obat[a]= new Overconstructorclass();
            menu();
            System.out.println("Masukkan obat yang mau di beli : ");
            int pilih = in.nextInt();
            System.out.println("Masukkan jumlah obat : ");
            int jumlah = in.nextInt();
            switch(pilih){
                case 1: obat[a].setobat("Panadol");
                        obat[a].setobat(2000,jumlah);
                        break;
                case 2: obat[a].setobat("Paramex");
                        obat[a].setobat(3000, jumlah);
                        break;
                case 3: obat[a].setobat("Bisolvo");
                        obat[a].setobat(5000,jumlah);
                        break;
                case 4: obat[a].setobat("Actived");
                        obat[a].setobat(8000,jumlah);
                        break;
                case 5: obat[a].setobat("Decolgen");
                        obat[a].setobat(9000,jumlah);
                        break;
                default : System.out.println("inputan salah");
            }
            
            System.out.println("Ingin tambah obat (y/n) : ");
            pilihan = in.next();
            
            a++;
        }while(pilihan.equalsIgnoreCase("Y"));
        
        System.out.println("    Pesanan Anda     ");
        System.out.println("=====================");
        System.out.println("Nama    : "+nama);
        System.out.println("Alamat  : "+alamat);
        for(int b = 0; b <= (a-1); b++){
            obat[b].display();
        }
        System.out.println("Total Harga : "+Overconstructorclass.gettotalharga());
        System.out.println("");
        System.out.println("Terimakasih");
        
    }
}
