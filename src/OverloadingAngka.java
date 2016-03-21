/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

public class OverloadingAngka {

    public static String ovlMethod(int x) {
        if (x == 0) {
            return "nol";
        } else if (x == 1) {
            return "satu";
        } else if (x == 2) {
            return "dua";
        } else if (x == 3) {
            return "tiga";
        } else if (x == 4) {
            return "empat";
        } else if (x == 5) {
            return "lima";
        } else if (x == 6) {
            return "enam";
        } else if (x == 7) {
            return "tujuh";
        } else if (x == 8) {
            return "delapan";
        } else if (x == 9) {
            return "sembilan";
        } else if (x >= 10 && x <= 19) {
            switch (x) {
                case 10:
                    return "sepuluh";
                case 11:
                    return "sebelas";
                default:
                    return ovlMethod(x % 10) + " belas";
            }
        } else if (x >= 20 && x <= 99) {
            if (x % 10 == 0) {
                return ovlMethod(x / 10) + " puluh";
            } else {
                return ovlMethod(x / 10) + " puluh " + ovlMethod(x % 10);
            }
        } else {
            return "seratus";
        }
    }

    public static String ovlMethod(String s) {
        String uji[] = new String[4];
        if (s.equalsIgnoreCase("nol")) {
            return "0";
        } else if (s.equalsIgnoreCase("satu")) {
            return "1";
        } else if (s.equalsIgnoreCase("dua")) {
            return "2";
        } else if (s.equalsIgnoreCase("tiga")) {
            return "3";
        } else if (s.equalsIgnoreCase("empat")) {
            return "4";
        } else if (s.equalsIgnoreCase("lima")) {
            return "5";
        } else if (s.equalsIgnoreCase("enam")) {
            return "6";
        } else if (s.equalsIgnoreCase("tujuh")) {
            return "7";
        } else if (s.equalsIgnoreCase("delapan")) {
            return "8";
        } else if (s.equalsIgnoreCase("sembilan")) {
            return "9";
        } else if (s.equalsIgnoreCase("sepuluh")) {
            return "10";
        } else if (s.equalsIgnoreCase("sebelas")) {
            return "11";
        } else if (s.equalsIgnoreCase("seratus")) {
            return "100";
        } else {
            uji = s.split(" ");
            if (uji.length == 2) {
                if (uji[1].equalsIgnoreCase("belas")) {
                    return 1 + ovlMethod(uji[0]);
                } else {
                    return ovlMethod(uji[0]) + "0";
                }
            } else {
                return ovlMethod(uji[0]) + ovlMethod(uji[2]);
            }
        }
    }
}
