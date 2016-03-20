package OverMeth;
import java.util.Scanner;
public class MainOverMeth {
  
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    OverMeth fd = new OverMeth();
    int a;
    System.out.print("Masukkan angka (1-100) : ");
    a = in.nextInt();
    System.out.println(fd.OverloadingMeth(a));
    System.out.println("==========================");
    System.out.print("Masukkan angka dalam huruf (1-100) : ");
    String h = in.next();
    System.out.println(fd.OverloadingMeth(h));
    
    }
}
