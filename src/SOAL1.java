package BAB3;
import java.util.*;
public class SOAL1 {
    int satuanTulisan;
    int puluhanTulisan;
    int an;
    String arraySatuan[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SOAL1 masukan = new SOAL1();
        System.out.println("masukkan nilai dalam angka : ");
        int angka = in.nextInt();
        masukan.ganti(angka);
        System.out.println("masukkan nilai dalam huruf : ");
        String angka1 = in.nextLine();
        angka1 = in.nextLine();
        String angka3[] = angka1.split(" ");
        for (int i = 0; i < angka3.length; i++) {
            masukan.ganti(angka3[i]);
        }
        System.out.println(masukan.an);
    }
    void ganti(int angka) {
        satuanTulisan = angka % 10;
        puluhanTulisan = Math.abs(angka / 10);
        if (satuanTulisan == 0) {
            if (puluhanTulisan == 1) {
                System.out.println("sepuluh");
            } else {
                System.out.println(arraySatuan[puluhanTulisan] + " puluh");
            }
        } else if (satuanTulisan == 100) {
            System.out.println("seratus");
        } else if (puluhanTulisan == 0) {
            System.out.println(arraySatuan[satuanTulisan]);
        } else if (puluhanTulisan >= 1) {
            if (satuanTulisan == 1 && puluhanTulisan < 2) {
                System.out.println("sebelas");
            } else if (puluhanTulisan < 2) {
                System.out.println(arraySatuan[satuanTulisan] + " belas");
            } else {
                System.out.println(arraySatuan[puluhanTulisan] + " puluh " + arraySatuan[satuanTulisan]);
            }
        }

    }
    void ganti(String angka) {
        for (int i = 0; i < arraySatuan.length; i++) {
            if (angka.equalsIgnoreCase(arraySatuan[i])) {
                an += i;
                break;
            } else if (angka.equalsIgnoreCase("puluh")) {
                an *= 10;
                break;
            } else if (angka.equalsIgnoreCase("sebelas")) {
                an = 11;
                break;
            } else if (angka.equalsIgnoreCase("seratus")) {
                an = 100;
                break;
            } else if (angka.equalsIgnoreCase("belas")) {
                an += 10;
                break;
            }

        }
    }
}
