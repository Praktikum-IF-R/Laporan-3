package Ubah;
import java.util.Scanner;
/**
 *
 * @author DS
 */
public class mainUbah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("  PROGRAM MENGUBAH HURUF <-> ANGKA");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("sebagai contoh berikut eksekusi langsung di main method");
        System.out.println("lihat pada (kodingan) main class");
        //HURUF diubaH menjadi ANGKA
        System.out.println(Ubah.overloadingMeth("dua puluh lima"));
        //ANGKA diubah menjadi HURUF
        Ubah.overloadingMeth(70);
        System.out.println();
        //program berdasar inputan user
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("       PROGRAM USER FRIENDLY");        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("      MENGUBAH HURUF -> ANGKA");
        System.out.println("-----*************************-------");
        System.out.println("Masukkan Huruf dari sebuah angka (1-100) : ");
        String huruf = in.nextLine();
        System.out.println("Angka tersebut adalah : " +Ubah.overloadingMeth(huruf));
        System.out.println();
        System.out.println("      MENGUBAH ANGKA -> HURUF");
        System.out.println("-----*************************-------");
        System.out.print("Masukkan sebuah Angka dari angka (1-100) : ");
        int angka = in.nextInt();
        System.out.println("Jika diubah menjadi huruf, maka akan menjadi : ");
        Ubah.overloadingMeth(angka);
    }  
}

