package Overloading;

import java.util.Scanner;

public class MainKonversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========KONVERSI=========\n");
        String lagi;
        do{
        System.out.println("Pilihan menu : ");
        System.out.println("1. Konversi angka ke huruf");
        System.out.println("2. Konversi huruf ke angka");
        System.out.print("Pilih menu : ");
        int pil = in.nextInt();
        KonversiAngka ob = new KonversiAngka();
        switch (pil) {
            case 1:
                System.out.println("Masukkan angka : ");
                int angka = in.nextInt();
                ob.KonversiAngka(angka);break;
            case 2:
                System.out.println("Masukkan angka huruf :");
                String huruf = in.nextLine();
                huruf = in.nextLine();
                String a[] = huruf.split(" ");
                for(int i =0;i < a.length;i++){
                    ob.KonversiAngka(a[i]);
                }
                System.out.println(ob.angkaNomor);break;
        }
            System.out.println("Ingin konversi lagi (y/n)? ");
            lagi = in.next();
        }while(lagi.equals("y"));
        System.out.println("TERIMA KASIH");
    }
}
