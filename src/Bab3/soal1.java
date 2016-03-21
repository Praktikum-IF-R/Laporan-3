package Bab3;

import java.util.Scanner;

public class soal1 {

    Scanner s = new Scanner(System.in);
    private int angka;
    private String hrf;

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public int getAngka() {
        return angka;
    }

    public void setHuruf(String huruf) {
        this.hrf = huruf;
    }

    public String getHrf() {
        return hrf;
    }

    public void overloadingMeth() {
        String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
            "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        System.out.print("  Input  : ");
        angka = s.nextInt();
        setAngka(angka);

        if (angka < 0 || angka > 100) {
            System.out.println("  Angka yang diinputkan diluar range.");
            overloadingMeth();
        } else if (angka == 0) {
            System.out.println("  Output : Nol");
        } else if (angka < 12) {
            System.out.println("  Output : " + huruf[angka]);
        } else if (angka >= 12 && angka < 20) {
            System.out.println("  Output : " + huruf[angka % 10] + " Belas");
        } else if (angka % 10 == 0 && angka < 100) {
            System.out.println("  Output : " + huruf[angka / 10] + " Puluh");
        } else if (angka % 10 != 0 && angka < 100 && angka > 20) {
            System.out.println("  Output : " + huruf[angka / 10] + " Puluh " + huruf[angka % 10]);
        } else if (angka == 100) {
            System.out.println("  Output : Seratus");
        }
    }

    public void overloadingMeth(String huruf) {
        int Angka[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String H[] = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam",
            "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

        for (int h = 0; h < 10; h++) {
            if (huruf.equalsIgnoreCase(H[h])) {
                System.out.println("  Output : " + Angka[h]);
            }
        }
        if (huruf.equalsIgnoreCase("  sepuluh")) {
            System.out.println("  Output : 10");
        } else if (huruf.equalsIgnoreCase("  sebelas")) {
            System.out.println("  Output : 11");
        } else if (huruf.equalsIgnoreCase("seratus")) {
            System.out.println("  Output : 100");
        } else if (huruf.contains("ratus")) {
            System.out.println("  Huruf yang diinputkan di luar range.");
        } else if (huruf.contains("minus")) {
            System.out.println("  Huruf yang diinputkan di luar range.");
        }
        for (int k = 0; k < 10; k++) {
            if (huruf.equalsIgnoreCase(H[k] + " puluh")) {
                System.out.println("  Output : " + Angka[k] + "0");
            } else {
                continue;
            }
        }
        for (int l = 0; l < 10; l++) {
            if (huruf.equalsIgnoreCase(H[l] + " belas")) {
                System.out.println("  Output : 1" + Angka[l]);
            } else {
                continue;
            }
        }
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (huruf.equalsIgnoreCase(H[m] + " puluh " + H[n])) {
                    System.out.println("  Output : " + Angka[m] + "" + Angka[n]);
                } else {
                    continue;
                }
            }
            continue;
        }
    }

}
