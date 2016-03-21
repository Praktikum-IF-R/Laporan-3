package overmethod;
import java.util.Scanner;
public class Overmethod {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Overmethodclass a = new Overmethodclass();
        System.out.println("===================");
        System.out.println("1.Angka ke Huruf");
        System.out.println("2.Huruf ke Angka");
        System.out.print("Pilihan : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Masukkan angka 1 - 100 : ");
                int p = in.nextInt();
                a.Angka(p);
                break;
            case 2:
                System.out.println("Masukkan angka memakai huruf 1 - 100");
                System.out.println("Ex : lima-belas");
                System.out.println("Inputan : ");
                String q = in.next();
                a.Overmeth(q);
                break;
            default:
                System.out.println("Inputan salah");
        }
        
    }
}
