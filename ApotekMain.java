package apotekmain;
import java.util.Scanner;
public class ApotekMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pil;
        System.out.println(" APOTEK KELUARGA ");
        System.out.println("Jalan Dr.Sutomo no. 16");
        System.out.print("Masukkan Nama : ");
        String a=in.nextLine();
    System.out.print("Masukkan Alamat : ");
    String b=in.nextLine();
    System.out.println("=====================================");
    Apotek o1=new Apotek(a,b);
    do{
        System.out.println("\nNo.\tNama Obat\tHarga");
        System.out.println("---------------------------------");
        System.out.println("1.\tObat Nyamuk\tRp. 3.500");
        System.out.println("2.\tObat Herbal\tRp. 5.000");
        System.out.println("3.\tObat Tidur\tRp. 8.000");
        System.out.println("4.\tObat Terlarang\tRp. 400.000");
        System.out.println("5.\tCetak Struk");
        System.out.println("0.\tKeluar");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Pilihan : ");
        pil=in.nextInt();
        switch(pil){
            case 1: caseIn(pil,o1);
            break;
            case 2: caseIn(pil,o1);
            break;
            case 3: caseIn(pil,o1);
            break;
            case 4:caseIn(pil,o1);
            break;
            case 5: System.out.println();
            break;
            case 0: System.out.println("Bye Bye!");
            System.exit(0);break;
            default: System.out.println("(!)Pilihan tidak tersedia!");
            }
            }
    while(pil!=5);
    o1.displayMessage();
    }
    public static void caseIn(int pil, Apotek a){
        Scanner in=new Scanner(System.in);
        Apotek.setObatHarga(pil);
        System.out.println("Anda memilih "+Apotek.getObat()+" seharga Rp. "+Apotek.getHarga());
        System.out.println("1. Yes\t\t2. No >>> ");
        int n=in.nextInt();
        if(n==1){
            a.hitungHarga();
            System.out.println("Total Belanja: $"+a.getTot());
            }
        else
        System.out.println("Total Belanja: $"+a.getTot());
    }
}