package Praktik03;
import java.util.*;
public class Satu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String a, b;
        int d, e;
        System.out.println("KONVERSI\n==================================");
        System.out.println("1. Angka -> Kata\n2. Kata -> Angka");
        System.out.print("Pilihan: ");
        e = in.nextInt();
        System.out.println("==================================");
        switch(e){
            case 1: System.out.print("Masukkan angka:");
                    e = in.nextInt();
                    Konversi re = new Konversi(e);break;
            case 2: System.out.println("1.Satu-Sembilan Belas dan Seratus\n2.Puluhan\n3.Keluar");
                    System.out.print("Pilihan: ");
                    d = in.nextInt();
                    switch(d){
                case 1:     System.out.print("Input: ");
                            a = in.nextLine(); a = in.nextLine();
                            re = new Konversi(a);break;
                case 2:     System.out.print("Input: ");
                            a = in.next();
                            b = in.nextLine(); b = in.nextLine();
                            re = new Konversi(a,b);break;
                case 3:     System.exit(0);
                default:    System.out.println("Tidak ditemukan..");
                    }
                    break;
            default: System.out.println("Tidak ada...");
        }
        
}
}