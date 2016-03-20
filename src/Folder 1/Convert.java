package Overloading;
public class Convert {
static String satuan[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", 
                         "delapan", "sembilan", "sepuluh", "sebelas"};
    public static void overloadingMeth(int angka) {
        if (angka == 0) {
        System.out.println("Nol");
        } else if (angka <= 11) {
        System.out.println(satuan[angka]);
        } else if (angka <= 19) {
        System.out.println(satuan[angka - 10] + " belas");
        } else if (angka <= 99) {
        System.out.println(satuan[angka / 10] + " puluh " + satuan[angka % 10]);
        } else if (angka == 100) {
        System.out.println("Seratus");
        }
        }
    public static void overloadingMeth(String huruf) {
        for (int counter = 0; counter <= 11; counter++) {
        if (huruf.equalsIgnoreCase(satuan[0])) {
        System.out.println(0);
        } else if (huruf.equalsIgnoreCase(satuan[counter])) {
        System.out.println(counter);
        } else if (huruf.equalsIgnoreCase(satuan[counter] + " puluh")) {
        int puluh = Integer.parseInt("0");
        System.out.println(counter + "" + puluh);
        } else if (huruf.equalsIgnoreCase(satuan[counter] + " belas")) {
        int belas = Integer.parseInt("1");
        System.out.println(belas + "" + counter);
        }
            for (int counter2 = 0; counter2 <= 11; counter2++) {
        if (huruf.equalsIgnoreCase(satuan[counter] + " puluh " + satuan[counter2])) {
        System.out.println(counter + "" + counter2);
        }
        }
        }
        if (huruf.equalsIgnoreCase("Seratus")) {
        System.out.println(100);
        }
        }
   public static void main(String[] args) {
        System.out.println("Hasil Konversi Angka Ke Huruf   \t:");
        overloadingMeth(90);
        overloadingMeth(13);
        overloadingMeth(80);
        overloadingMeth(54);
        System.out.println("");
        System.out.println("Hasil Koneversi Huruf Ke Angka  \t:");
        overloadingMeth("tiga puluh");
        overloadingMeth("enam puluh enam");
        overloadingMeth("tujuh puluh empat");
        overloadingMeth("lima belas");
        }
        }


 

