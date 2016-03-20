package cek.kata.angka;

public class OverloadingMeth {

    private int angka;
    private String kata;

    public void overloadingmeth(int angka) {
        this.angka = angka;
        String[] string = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String hasil;
        if (angka < 12) {
            hasil = string[angka];
            System.out.println(hasil);
        } else if (angka < 20) {
            hasil = string[angka - 10] + " belas";
            System.out.println(hasil);
        } else if (angka < 100) {
            hasil = string[angka / 10] + " puluh " + string[angka % 10];
            System.out.println(hasil);
        } else if (angka == 100) {
            System.out.println("seratus");
        }
    }

    public void overloadingmeth(String kata) {
        this.kata = kata;
        String i[] = new String[1];
        if (kata.contains(" ")) {
            kata1(kata);
        } else {
            i[0] = kata;
            if (i[0].equalsIgnoreCase("dua")) {
                System.out.print("2");
            } else if (i[0].equalsIgnoreCase("tiga")) {
                System.out.print("3");
            } else if (i[0].equalsIgnoreCase("empat")) {
                System.out.print("4");
            } else if (i[0].equalsIgnoreCase("lima")) {
                System.out.print("5");
            } else if (i[0].equalsIgnoreCase("enam")) {
                System.out.print("6");
            } else if (i[0].equalsIgnoreCase("tujuh")) {
                System.out.print("7");
            } else if (i[0].equalsIgnoreCase("delapan")) {
                System.out.print("8");
            } else if (i[0].equalsIgnoreCase("sembilan")) {
                System.out.print("9");
            } else if (i[0].equalsIgnoreCase("satu")) {
                System.out.print("1");
            } else if (i[0].equalsIgnoreCase("sepuluh")) {
                System.out.print("10");
            } else if (i[0].equalsIgnoreCase("sebelas")) {
                System.out.print("11");
            } else if (i[0].equalsIgnoreCase("seratus")) {
                System.out.println("100");
            }

        }

    }

    public void kata1(String kata) {
        this.kata = kata;
        String A[] = kata.split(" ");
        if (A[1].equalsIgnoreCase("belas")) {
            System.out.print("1");
        }
        if (A[0].equalsIgnoreCase("dua")) {
            System.out.print("2");
        } else if (A[0].equalsIgnoreCase("tiga")) {
            System.out.print("3");
        } else if (A[0].equalsIgnoreCase("empat")) {
            System.out.print("4");
        } else if (A[0].equalsIgnoreCase("lima")) {
            System.out.print("5");
        } else if (A[0].equalsIgnoreCase("enam")) {
            System.out.print("6");
        } else if (A[0].equalsIgnoreCase("tujuh")) {
            System.out.print("7");
        } else if (A[0].equalsIgnoreCase("delapan")) {
            System.out.print("8");
        } else if (A[0].equalsIgnoreCase("sembilan")) {
            System.out.print("9");
        } else if (A[0].equalsIgnoreCase("satu")) {
            System.out.print("1");
        }
        if (A[1].equalsIgnoreCase("puluh")) {
            if (A.length == 2) {
                System.out.print("0");
            }
        }
        if (A.length == 3) {
            if (A[2].equalsIgnoreCase("dua")) {
                System.out.print("2");
            } else if (A[2].equalsIgnoreCase("satu")) {
                System.out.print("1");
            } else if (A[2].equalsIgnoreCase("tiga")) {
                System.out.print("3");
            } else if (A[2].equalsIgnoreCase("empat")) {
                System.out.print("4");
            } else if (A[2].equalsIgnoreCase("lima")) {
                System.out.print("5");
            } else if (A[2].equalsIgnoreCase("enam")) {
                System.out.print("6");
            } else if (A[2].equalsIgnoreCase("tujuh")) {
                System.out.print("7");
            } else if (A[2].equalsIgnoreCase("delapan")) {
                System.out.print("8");
            } else if (A[2].equalsIgnoreCase("sembilan")) {
                System.out.print("9");
            }
        }
    }

}
