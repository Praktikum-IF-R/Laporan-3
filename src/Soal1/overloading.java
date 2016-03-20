/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

/**
 *
 * @author Lenovo
 */
public class overloading {
    private String text;
    private int a;
    public void overloadingMeth(int n){
        String [] huruf = {"nol","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"}; 
        int a = n;
        if (a < 12) {
            System.out.println(huruf[a]);
        } else if (a>=12 && a<=19) {
            System.out.println(huruf[a - 10] + " belas");
        } else if (a>=10 && a<=99) {
            System.out.println(huruf[a / 10] + " puluh " + huruf[a % 10]);
        } else if (a == 100) {
            System.out.println("seratus");
        }
    }
    public  void overloadingMeth(String x){
        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100};
        String text = x;
        String h[] = new String[0];
        if (text.contains(" ")) {
            h3(text);
        } else {
            h[0] = text;
            if (h[0].equalsIgnoreCase("satu")) {
                System.out.print(c[1]);
            } else if (h[0].equalsIgnoreCase("dua")) {
                System.out.print(c[2]);
            } else if (h[0].equalsIgnoreCase("tiga")) {
                System.out.print(c[3]);
            } else if (h[0].equalsIgnoreCase("empat")) {
                System.out.print(c[4]);
            } else if (h[0].equalsIgnoreCase("lima")) {
                System.out.print(c[5]);
            } else if (h[0].equalsIgnoreCase("enam")) {
                System.out.print(c[6]);
            } else if (h[0].equalsIgnoreCase("tujuh")) {
                System.out.print(c[7]);
            } else if (h[0].equalsIgnoreCase("delapan")) {
                System.out.print(c[8]);
            } else if (h[0].equalsIgnoreCase("sembilan")) {
                System.out.print(c[9]);
            } else if (h[0].equalsIgnoreCase("sepuluh")) {
                System.out.print(c[10]);
            } else if (h[0].equalsIgnoreCase("sebelas")) {
                System.out.print(c[11]);
            } else if (h[0].equalsIgnoreCase("seratus")) {
                System.out.print(c[12]);
            }
        }
    }
    public void h3(String s) {
        text = s;
        int b[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] x = s.split(" ");
        if (x[1].equalsIgnoreCase("belas")) {
            System.out.print(b[1]);
        }
        if (x[0].equalsIgnoreCase("dua")) {
            System.out.print(b[2]);
        } else if (x[0].equalsIgnoreCase("tiga")) {
            System.out.print(b[3]);
        } else if (x[0].equalsIgnoreCase("empat")) {
            System.out.print(b[4]);
        } else if (x[0].equalsIgnoreCase("lima")) {
            System.out.print(b[5]);
        } else if (x[0].equalsIgnoreCase("enam")) {
            System.out.print(b[6]);
        } else if (x[0].equalsIgnoreCase("tujuh")) {
            System.out.print(b[7]);
        } else if (x[0].equalsIgnoreCase("delapan")) {
            System.out.print(b[8]);
        } else if (x[0].equalsIgnoreCase("sembilan")) {
            System.out.print(b[9]);
        }
        if (x[1].equalsIgnoreCase("puluh")) {
            if (x.length == 2) {
                System.out.print(b[0]);
            } else if (x.length == 3) {
                if (x[2].equalsIgnoreCase("satu")) {
                    System.out.print(b[1]);
                } else if (x[2].equalsIgnoreCase("dua")) {
                    System.out.print(b[2]);
                } else if (x[2].equalsIgnoreCase("tiga")) {
                    System.out.print(b[3]);
                } else if (x[2].equalsIgnoreCase("empat")) {
                    System.out.print(b[4]);
                } else if (x[2].equalsIgnoreCase("lima")) {
                    System.out.print(b[5]);
                } else if (x[2].equalsIgnoreCase("enam")) {
                    System.out.print(b[6]);
                } else if (x[2].equalsIgnoreCase("tujuh")) {
                    System.out.print(b[7]);
                } else if (x[2].equalsIgnoreCase("delapan")) {
                    System.out.print(b[8]);
                } else if (x[2].equalsIgnoreCase("sembilan")) {
                    System.out.print(b[9]);
                }
            }
        }
    }
}
