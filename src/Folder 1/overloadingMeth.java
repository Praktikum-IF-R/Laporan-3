import java.util.Scanner;
public class overloadingMeth {
    public static void main (String[]args){
        Math B = new Math();
        Scanner i = new Scanner (System.in);
        Scanner u = new Scanner (System.in);
        System.out.println("====================");
        System.out.println("Konversi angka menjadi bilangan");
        System.out.println("====================");
        System.out.print("Input angka: ");
        int angka = i.nextInt();
        B.overloadingMeth(angka);
        System.out.println("====================");
        System.out.println("Konversi bilangan menjadi angka");
        System.out.print("Input bilangan: ");
        String bilangan = u.nextLine().toLowerCase();
        B.overloadingMeth(bilangan);
    }
}
