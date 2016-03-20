package praktikum3;
import java.util.Scanner;
public class overloadingmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        overloading ardia = new overloading();
        System.out.println("======================");
        System.out.println("Angka ->> Huruf: ");
        ardia.overloadingMeth(input.nextInt());
        input.nextLine();
        overloading regita = new overloading();
        System.out.println("======================");
        System.out.println("Huruf ->> Angka: ");
        regita.overloadingMeth(input.nextLine());
        System.out.println();
    }
}