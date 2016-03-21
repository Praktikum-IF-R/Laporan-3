package overloading;

import java.util.Scanner;

public class OMeth {

    public static void overloadingMeth(int x) {
        String[] huruf = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima",
            "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        String hasilS = "";
        if (x < 12) {
            System.out.println(huruf[x]);
        } else if (x < 20) {
            System.out.println(huruf[x % 10] + " Belas");
        } else if (x == 100) {
            System.out.println("Seratus");
        } else if (x % 10 == 0) {
            System.out.println(huruf[x / 10] + " Puluh");
        } else if (x < 100) {
            System.out.println(huruf[x / 10] + " Puluh " + huruf[x % 10]);
        }
    }
    public static void overloadingMeth(String y) {
        String[] word = y.split(" ");
        int[] numb = new int[3];
        int [] nomor = {0,1,2,3,4,5,6,7,8,9,10,11,100};
        for (int i = 0; i < word.length; i++) {
            if (i == 1) {
                continue;
            }
            if ((word[i]).equalsIgnoreCase("satu")) {
                numb[i] = nomor[1];
            } else if ((word[i]).equalsIgnoreCase("dua")) {
                numb[i] = nomor[2];
            } else if ((word[i]).equalsIgnoreCase("tiga")) {
                numb[i] = nomor[3];
            } else if ((word[i]).equalsIgnoreCase("empat")) {
                numb[i] = nomor[4];
            } else if ((word[i]).equalsIgnoreCase("lima")) {
                numb[i] = nomor[5];
            } else if ((word[i]).equalsIgnoreCase("enam")) {
                numb[i] = nomor[6];
            } else if ((word[i]).equalsIgnoreCase("tujuh")) {
                numb[i] = nomor[7];
            } else if ((word[i]).equalsIgnoreCase("delapan")) {
                numb[i] = nomor[8];
            } else if ((word[i]).equalsIgnoreCase("sembilan")) {
                numb[i] = nomor[9];
            }
        }
        if (!y.contains(" ")) {
            if (word[0].equalsIgnoreCase("sepuluh")) {
                numb[0] = nomor[10];
            } else if (word[0].equalsIgnoreCase("sebelas")) {
                numb[0] = nomor[11];
            } else if (word[0].equalsIgnoreCase("nol")) {
                numb[0] = nomor[0];
            } else if (word[0].equalsIgnoreCase("seratus")) {
                numb[0] = nomor[12];
            }
            System.out.println(numb[0]);
        } else if (word.length == 2) {
            if (word[1].equalsIgnoreCase("belas")) {
                numb[1] = nomor[1];
                System.out.println(numb[1] + "" + numb[0]);
            } else if (word[1].equalsIgnoreCase("puluh")) {
                numb[1] = nomor[0];
                System.out.println(numb[0] + "" + numb[1]);
            }
        } else {
            System.out.println(numb[0] + "" + numb[2]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("======= CONVERSION TO WORD =======");
        System.out.print("Input Angka  : ");
        int x = in.nextInt();in.nextLine();
        System.out.print("Output Huruf : ");
        overloadingMeth(x);
        System.out.println("");
        System.out.println("======= CONVERSION TO NUMBER =======");
        System.out.print("Input Huruf  : ");
        String y = in.nextLine();
        System.out.print("Output Angka : ");
        overloadingMeth(y);
    }
}
