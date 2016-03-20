package Laporan3;

/**
 *
 * @author Wahyu Ridiansyah
 */
public class Konversi {

    String[] bilangan = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    int angka;

    public String overloadingMeth(int number) {
        String ang = " ";
        if (number < 12) {
            ang = " " + bilangan[number];

        } else if (number < 20) {
            ang = overloadingMeth(number - 10) + " Belas";

        } else if (number < 100) {
            ang = overloadingMeth(number / 10) + " Puluh" + overloadingMeth(number % 10);

        } else if (number == 100) {
            ang = "seratus";

        }

        return ang;
    }

    public int overloadingMeth(String word, int angka) {

        for (int i = 0; i < bilangan.length; i++) {
            if (word.equalsIgnoreCase(bilangan[i])) {
                this.angka += i;
                break;
            } else if (word.equalsIgnoreCase("belas")) {
                this.angka += 10;
                break;
            } else if (word.equalsIgnoreCase("seratus")) {
                this.angka = 100;
                break;
            } else if (word.equalsIgnoreCase("puluh")) {
                this.angka *= 10;
                break;
            }

        }
        return this.angka;
    }
}
