package Overloading;

public class KonversiAngka {
    String angkahuruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
    int angkaNomor = 0;

    public void KonversiAngka(int angka) {
        for (int i = 0; i <= angkahuruf.length; i++) {
            if (angka == i) {
                System.out.println(angkahuruf[i]);
                break;
            } else if (angka == 10) {
                System.out.println("sepuluh");
                break;
            } else if (angka == 11) {
                System.out.println("sebelas");
                break;
            } else if (angka % 10 >= 1 && angka < 20) {
                System.out.println(angkahuruf[i] + " belas");
                break;
            } else if (angka / 10 >= 1) {
                System.out.println(angkahuruf[Math.abs(angka / 10)] + " puluh " + angkahuruf[angka % 10]);
                break;
            } else if (angka % 10 == 0) {
                System.out.println(angkahuruf[i] + " puluh");
                break;
            }
        }
    }

    public void KonversiAngka(String angka) {

        for (int i = 0; i <= angkahuruf.length; i++) {
            if (angka.equalsIgnoreCase(angkahuruf[i])) {
                angkaNomor += i;
                break;
            } else if(angka.equalsIgnoreCase("puluh")){
                angkaNomor*= 10;
                break;
            }else if(angka.equalsIgnoreCase("belas")){
                angkaNomor +=10;
                break;
            }else if(angka.equalsIgnoreCase("seratus")){
                angkaNomor= 100;
                break;
            }else if(angka.equalsIgnoreCase("sebelas")){
                angkaNomor= 11;
                break;
            }
        }
    }
}
