package angka;
import java.util.Scanner;
public class Angka {
private static String nomor[]={"Nol","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
public static void overloadingMeth(int angka){
    String huruf;
    if (angka<=11){
        huruf=nomor[angka];
        System.out.println(huruf);
    }
    else if (angka<=19){
        huruf=nomor[angka-10];
        System.out.println(huruf+" belas");
    }
    else if(angka<=29){
        huruf=nomor[angka-20];
        System.out.println("dua puluh "+huruf);
    }
    else if(angka<=39){
        huruf=nomor[angka-30];
        System.out.println("tiga puluh "+huruf);
    }
    else if(angka<=49){
        huruf=nomor[angka-40];
        System.out.println("empat puluh "+huruf);
    }
    else if(angka<=59){
        huruf=nomor[angka-50];
        System.out.println("lima puluh "+huruf);
    }
    else if(angka<=69){
        huruf=nomor[angka-60];
        System.out.println("Enam puluh "+huruf);
    }
    else if(angka<=79){
        huruf=nomor[angka-70];
        System.out.println("Tujuh puluh "+huruf);
    }
    else if(angka<=89){
        huruf=nomor[angka-80];
        System.out.println("Delapan puluh "+huruf);
    }
    else if(angka<=99){
        huruf=nomor[angka-90];
        System.out.println("Sembilan puluh "+huruf);
    }
    else if(angka==100){
        System.out.println("Seratus");
    }
    else if(angka>100){
        System.out.println("Anda melebihi jumlah maksimum input");
    }
    }
public static void overloadingMeth(String huruf){
     String[] a = huruf.split(" ", 0);
        int angka = 0;
        int count=0;
        int puluhan=0;
        int satuan=0;
        if(a.length==1){ 
            for (int i = 0; i < nomor.length; i++) {
            if(a[0].equalsIgnoreCase(nomor[i])){
            angka = i; count++; break;}
            count++;}
            if(count==20)
            angka=100;
        }
        else if(a.length==2) {
            for (int i = 0; i < nomor.length; i++) {
            if(a[0].equalsIgnoreCase(nomor[i])&&a[1].equalsIgnoreCase("puluh"))
            angka = 10*i;
            if(a[0].equalsIgnoreCase(nomor[i])&&a[1].equalsIgnoreCase("belas"))
            angka = 10+i;}
        }        
        else {
            for (int i = 0; i < nomor.length; i++) {
            if(a[0].equalsIgnoreCase(nomor[i]))
            puluhan=10*i;}   
            for (int i = 0; i < nomor.length; i++) {
            if(a[2].equalsIgnoreCase(nomor[i]))
            satuan=i;}   
            angka = puluhan+satuan;}
            System.out.println(angka);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Mengubah angka ke huruf");
        System.out.println("Masukkan angka :");
        int angka=input.nextInt();
        overloadingMeth(angka);
        System.out.println("Mengubah huruf ke angka");
        System.out.println("Masukkan huruf :");
        String huruf=in.nextLine();
        overloadingMeth(huruf);        
    }
}
