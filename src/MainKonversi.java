package Laporan3;

/**
 *
 * @author Wahyu Ridiansyah
 */
import java.util.Scanner;

public class MainKonversi {

    public static void main(String[] args) {
        Scanner wahyu = new Scanner(System.in);
        Konversi aa = new Konversi();
        System.out.println("===============================================");
        System.out.println("         SOFTWARE KONVERSI TIPE DATA");
        System.out.println("===============================================");
                System.out.println("Inputkan Dalam Bilangan (0-100)");
                System.out.print("Input : ");
                int a = wahyu.nextInt();
                System.out.println("-----------------------------------------------");
                System.out.println("Output:");
                System.out.println(aa.overloadingMeth(a));
                System.out.println("-----------------------------------------------");
                int angka =0;
                System.out.println("Inpukan Dalam Huruf (Satu-Seratus)");
                System.out.print("Input : ");
                String bla = wahyu.nextLine();
                bla = wahyu.nextLine();
                System.out.println("-----------------------------------------------");
                System.out.println("Output: ");
                String b[] = bla.split(" ");
                for (int i = 0; i < b.length ; i++) {
                    aa.overloadingMeth(b[i], angka);
                }
                System.out.println(aa.angka);
                System.out.println("-----------------------------------------------");
                System.out.println("FINISHED!");
                System.out.println("===============================================");
            
        } 
    }

