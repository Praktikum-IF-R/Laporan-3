/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporanbab3;
import java.util.Scanner;
/**
 *
 * @author kiruyos1
 */
public class ConveterMain {
  

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan: ");
        String huruf = in.nextLine();
        in.close();
        String pisah = " ";
        String[] out = huruf.split(pisah);
        for (int i = 0; i < out.length; i++) {
            out[i].toLowerCase();
        }
        ConveterSistem ubah = new ConveterSistem(out);

    }

}


