package Overloading;

import java.util.Scanner;

public class Apotekmain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama     = ");
        String nam = in.nextLine();
        System.out.print("Masukkan alamat   = ");
        String al = in.next();
        Apotek id = new Apotek(nam, al);
        id.open();
        String obat[] = {"Konidin", "Paracetamol", "OBH", "Amoxcilin"};
        int harga[] = {8000, 5000, 9000, 10000};
        String  oba;
        int har,jum;
        Apotek ob = new Apotek();
            System.out.println("Pilih :");
            int pil = in.nextInt();
            switch (pil) {
                case 1:System.out.println("Banyak obat : ");
                    jum = in.nextInt();
                    oba = obat[pil-1];
                    har = harga[pil-1];
                    id.Obat(oba);
                    id.Obat(har, jum);
                    break;
                case 2:System.out.println("Banyak obat : ");
                    jum = in.nextInt();
                    oba = obat[pil-1];
                    har = harga[pil-1];
                    id.Obat(oba);
                    id.Obat(har, jum);
                    break;
                case 3:System.out.println("Banyak obat : ");
                    jum = in.nextInt();
                    oba = obat[pil-1];
                    har = harga[pil-1];
                    id.Obat(oba);
                    id.Obat(har, jum);
                    break;
                case 4:System.out.println("Banyak obat : ");
                    jum = in.nextInt();
                    oba = obat[pil-1];
                    har = harga[pil-1];
                    id.Obat(oba);
                    id.Obat(har, jum);
                    break;
            }
            id.display();
    }
}
