package apotek;

import java.util.Scanner;

public class MainApotek {
    public static String data[];
    public static int data2[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(">>>>>APOTEK BHAKTI FARMA<<<<<");
        System.out.println("");
        System.out.print("Nama   : ");
        String nama = in.nextLine();
        System.out.print("Alamat : ");
        String alamat = in.nextLine();
        apotek a1 = new apotek(nama, alamat);
        System.out.print("Jumlah obat yang akan dibeli : ");
        int banyak = in.nextInt();
        System.out.println("ooooooooooooooooooooooooooooooooooo");
        System.out.println("DAFTAR NAMA OBAT YANG TERSEDIA");
        System.out.println("1.  Paracetamol       : Rp  2500,-");
        System.out.println("2.  Amoxilin          : Rp  3000,-");
        System.out.println("3.  Bodrex            : Rp  2500,-");
        System.out.println("4.  Paramex           : Rp  3000,-");
        System.out.println("5.  Panadol           : Rp  4000,-");
        System.out.println("6.  Recohin           : Rp 10000,-");
        System.out.println("7.  Antalgin          : Rp  4000,-");
        System.out.println("oooooooooooooooooooooooooooooooooo");
        data = new String[banyak];
        data2 = new int[banyak];
        for (int i = 0; i < data.length; i++) {
            System.out.println("");
            System.out.print("Obat yang dibeli : ");
            data[i] = in.next();
            System.out.print("Jumlah           : ");
            data2[i] = in.nextInt();
            apotek a2 = new apotek(data[i], data2[i]);
        }
        System.out.println("------------------------------------------------------");
        a1.display();
    }
}

