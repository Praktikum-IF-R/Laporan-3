/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainkonversi;
import java.util.Scanner;
/**
 *
 * @author ANITA
 */
public class konversi {
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    int ang;
    String kata;
    int angka[] = {0,1,2,3,4,5,6,7,8,9,10};
    String huruf[] = {"nol","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh"};
    
    public void overloadingMeth(int a){
        if (a <= 10)
            System.out.println(huruf[a]);
        else if (a == 11)
            System.out.println("sebelas");
        else if ((a < 20) && (a > 10))
            System.out.println(huruf[a-10]+" belas");
        else if (a % 10 == 0)
            System.out.println(huruf[a/10]+" puluh");
        else if (a < 100)
            System.out.println(huruf[a/10]+" puluh "+huruf[a%10]);
        else
            System.out.println("seratus");
    }
    
    public String overloadingMeth(String a){
        String angka[] = {"0","1","2","3","4","5","6","7","8","9","10"};
        String[] bar = a.split(" ");
        String kata = "";
        for (int i=0; i < bar.length; i++){
            for (int j=0; j < huruf.length; j++){
                if (bar.length == 3){
                    if (bar[i].indexOf(huruf[j]) >= 0){
                        kata = kata + angka[j];
                    }
                } 
                else if (bar.length == 2){
                    if (bar[1].equalsIgnoreCase("puluh") && bar[i].equalsIgnoreCase(huruf[j])){
                        kata = angka[j] + "0";
                    } 
                    else if (bar[1].equalsIgnoreCase("belas") && bar[0].equalsIgnoreCase(huruf[j])){
                        kata = "1" + angka[j];
                    }
                } 
                else if (bar.length == 1){
                    if (bar[0].equalsIgnoreCase("sebelas")){
                       kata = "11";
                    } 
                    else if (bar[0].equalsIgnoreCase(huruf[j])){
                        kata = String.valueOf(angka[j]);
                    } 
                    else if (bar[0].equalsIgnoreCase("seratus")){
                        kata = "100";
                    }
                }
            }
        }
        return kata; 
    }
}