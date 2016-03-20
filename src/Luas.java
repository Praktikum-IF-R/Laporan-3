package Overloading;

import java.util.Scanner;

public class Luas {
   
public static int getLuas(int Panjang, int Lebar){
     int LuasP = Panjang * Lebar;
     return LuasP;
}    
public static int getLuas(int sisi1, int sisi2 , int tinggi){
    int LuasT = (sisi1 + sisi2)* (tinggi)/2;
    return LuasT;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang         \t:");
        int p = input.nextInt();
        System.out.print("Masukan Lebar           \t:");
        int l = input.nextInt();
        System.out.print("Masukan Sisi1           \t:");
        int s1 = input.nextInt();
        System.out.print("Masukan Sisi2           \t:");
        int s2 = input.nextInt();
        System.out.print("Masukan Tinggi          \t:");
        int t = input.nextInt();
        System.out.println("Luas Persegi Panjang    \t:"+getLuas(p,l));
        System.out.println("Luas Trapesium          \t:"+getLuas(s1,s2,t));
        int jumlahluas = 0;
        jumlahluas = (getLuas(p,l))+(getLuas(s1,s2,t));
        System.out.println("Jumlah Kedua Luas       \t:"+jumlahluas);
        
    }
}
