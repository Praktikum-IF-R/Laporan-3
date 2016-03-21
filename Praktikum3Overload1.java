package praktikum3overload1;
import java.util.Scanner;
public class Praktikum3Overload1 {

    public static void main(String[] args) {
        ClassOverloading KonversiAngka = new ClassOverloading();
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka = ");
        int satuan = input.nextInt();
        KonversiAngka.overloadingMeth(satuan);
        
        System.out.print("Input kata = ");
        String a = input.next();
        System.out.print("Hasil = ");
        KonversiAngka.overloadingMeth(a);
        System.out.println();
    } 
}