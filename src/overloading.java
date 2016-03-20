package praktikum3;
public class overloading {
    private String huruf2;
    private int angka2;
    public void overloadingMeth(int n) {
        String[] huruf = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        int angka2 = n;
        String hurufnya;
        if (angka2 < 12) {
            hurufnya = huruf[n];
            System.out.println(hurufnya);
        } else if (angka2 < 20) {
            hurufnya = huruf[angka2 - 10];
            System.out.println(hurufnya + " belas");
        } else if (angka2 < 100) {
            hurufnya = huruf[angka2 / 10] + " puluh " + huruf[angka2 % 10];
            System.out.println(hurufnya);
        } else if (angka2 == 100) {
            System.out.println("seratus");
        }
    }
    public void overloadingMeth(String x) {
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};
        String huruf2 = x;
        String h[] = new String[0];
        if (huruf2.contains(" ")) {
            huruf3(huruf2);
        } else {
            h[0] = huruf2;
            if (h[0].equalsIgnoreCase("satu")) {
                System.out.print(angka[1]);
            } else if (h[0].equalsIgnoreCase("dua")) {
                System.out.print(angka[2]);
            } else if (h[0].equalsIgnoreCase("tiga")) {
                System.out.print(angka[3]);
            } else if (h[0].equalsIgnoreCase("empat")) {
                System.out.print(angka[4]);
            } else if (h[0].equalsIgnoreCase("lima")) {
                System.out.print(angka[5]);
            } else if (h[0].equalsIgnoreCase("enam")) {
                System.out.print(angka[6]);
            } else if (h[0].equalsIgnoreCase("tujuh")) {
                System.out.print(angka[7]);
            } else if (h[0].equalsIgnoreCase("delapan")) {
                System.out.print(angka[8]);
            } else if (h[0].equalsIgnoreCase("sembilan")) {
                System.out.print(angka[9]);
            } else if (h[0].equalsIgnoreCase("sepuluh")) {
                System.out.print(angka[10]);
            } else if (h[0].equalsIgnoreCase("sebelas")) {
                System.out.print(angka[11]);
            } else if (h[0].equalsIgnoreCase("seratus")) {
                System.out.print(angka[12]);
            }
        }
    }
    public void huruf3(String c) {
        huruf2 = c;
        int angka[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] H = c.split(" ");
        if (H[1].equalsIgnoreCase("belas")) {
            System.out.print(angka[1]);
        }
        if (H[0].equalsIgnoreCase("dua")) {
            System.out.print(angka[2]);
        } else if (H[0].equalsIgnoreCase("tiga")) {
            System.out.print(angka[3]);
        } else if (H[0].equalsIgnoreCase("empat")) {
            System.out.print(angka[4]);
        } else if (H[0].equalsIgnoreCase("lima")) {
            System.out.print(angka[5]);
        } else if (H[0].equalsIgnoreCase("enam")) {
            System.out.print(angka[6]);
        } else if (H[0].equalsIgnoreCase("tujuh")) {
            System.out.print(angka[7]);
        } else if (H[0].equalsIgnoreCase("delapan")) {
            System.out.print(angka[8]);
        } else if (H[0].equalsIgnoreCase("sembilan")) {
            System.out.print(angka[9]);
        }
        if (H[1].equalsIgnoreCase("puluh")) {
            if (H.length == 2) {
                System.out.print(angka[0]);
            } else if (H.length == 3) {
                if (H[2].equalsIgnoreCase("satu")) {
                    System.out.print(angka[1]);
                } else if (H[2].equalsIgnoreCase("dua")) {
                    System.out.print(angka[2]);
                } else if (H[2].equalsIgnoreCase("tiga")) {
                    System.out.print(angka[3]);
                } else if (H[2].equalsIgnoreCase("empat")) {
                    System.out.print(angka[4]);
                } else if (H[2].equalsIgnoreCase("lima")) {
                    System.out.print(angka[5]);
                } else if (H[2].equalsIgnoreCase("enam")) {
                    System.out.print(angka[6]);
                } else if (H[2].equalsIgnoreCase("tujuh")) {
                    System.out.print(angka[7]);
                } else if (H[2].equalsIgnoreCase("delapan")) {
                    System.out.print(angka[8]);
                } else if (H[2].equalsIgnoreCase("sembilan")) {
                    System.out.print(angka[9]);
                }
            }
        }
    }
}