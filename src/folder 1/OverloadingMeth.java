package cek.kata.angka;

public class OverloadingMeth {

    private String kata;
    private int angka;
    String[] ejakata = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public void overloadingmeth(int angka) {
        this.angka = angka;
        String hasil;
        if (angka <= 11) {
            hasil = ejakata[angka];
            System.out.println(hasil);
        } else if (angka < 20) {
            hasil = ejakata[angka - 10] + " belas";
            System.out.println(hasil);
        } else if (angka < 100) {
            hasil = ejakata[angka / 10] + " puluh " + ejakata[angka % 10];
            System.out.println(hasil);
        } else if (angka == 100) {
            System.out.println("seratus");
        }
    }

    public static void overloadingmeth(String a) {
        String kata[] = a.split(" ");
        int ang[] = new int[3];
        for (int i = 0; i < kata.length; i++) {

            if (i == 1) {
                continue;
            }
            if ((kata[i]).equalsIgnoreCase("satu")) {
                ang[i] = 1;
            } else if (kata[i].equalsIgnoreCase("dua")) {
                ang[i] = 2;
            } else if (kata[i].equalsIgnoreCase("tiga")) {
                ang[i] = 3;
            } else if (kata[i].equalsIgnoreCase("empat")) {
                ang[i] = 4;
            } else if (kata[i].equalsIgnoreCase("lima")) {
                ang[i] = 5;
            } else if (kata[i].equalsIgnoreCase("enam")) {
                ang[i] = 6;
            } else if (kata[i].equalsIgnoreCase("tujuh")) {
                ang[i] = 7;
            } else if (kata[i].equalsIgnoreCase("delapan")) {
                ang[i] = 8;
            } else if (kata[i].equalsIgnoreCase("sembilan")) {
                ang[i] = 9;
            }
        }
        if (!a.contains(" ")) {

            if (kata[0].equalsIgnoreCase("sepuluh")) {
                ang[0] = 10;
            } else if (kata[0].equalsIgnoreCase("sebelas")) {
                ang[0] = 11;
            } else if (kata[0].equalsIgnoreCase("nol")) {
                ang[0] = 0;
            } else if (kata[0].equalsIgnoreCase("seratus")) {
                ang[0] = 100;
            }

            System.out.println(ang[0]);

        } else if (kata.length == 2) {

            if (kata[1].equalsIgnoreCase("belas")) {
                ang[1] = 1;
                System.out.println(ang[1] + "" + ang[0]);

            } else if (kata[1].equalsIgnoreCase("puluh")) {
                ang[1] = 0;
                System.out.println(ang[0] + "" + ang[1]);
            }
        } else {
            System.out.println(ang[0] + "" + ang[2]);
        }
    }
}
