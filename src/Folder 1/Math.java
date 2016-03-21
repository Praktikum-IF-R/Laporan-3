import java.util.Scanner;
public class Math {
    public static String huruf[]={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    public static void overloadingMeth(int angka){    
        if(angka<12){
            System.out.println(huruf[angka].toLowerCase());
        }else if(angka > 11 && angka <= 19){
            angka = angka - 10;
            System.out.println(huruf[angka].toLowerCase()+" belas");
        }else if(angka > 19 && angka < 100){
            int angka1 = angka / 10;
            int angka2 = angka % 10;
            System.out.println(huruf[angka1].toLowerCase()+" puluh "+huruf[angka2].toLowerCase());
        }else if(angka == 100){
            System.out.println("Seratus");
        }else{
            System.out.println("Maaf angka yang anda masukkan diluar range");
        }
    }
    public static void overloadingMeth(String bilangan){
        for(int counter = 0; counter <= 11; counter++){
            if(bilangan.equalsIgnoreCase(huruf[0])){
                System.out.println(0);
            }else if(bilangan.equalsIgnoreCase(huruf[counter])){
                System.out.println(counter);
            }else if(bilangan.equalsIgnoreCase(huruf[counter]+" puluh")){
                int puluh = Integer.parseInt("0");
                System.out.println(counter+""+puluh);
            }else if(bilangan.equalsIgnoreCase(huruf[counter]+" belas")){
                int belas = Integer.parseInt("1");
                System.out.println(belas+""+counter);
            }
            for(int counter1 = 0; counter1 <= 11; counter1++){
                if(bilangan.equalsIgnoreCase(huruf[counter]+" puluh "+huruf[counter1])){
                    System.out.println(counter+""+counter1);
                }
            }
        }
        if(bilangan.equalsIgnoreCase("Seratus")){
            System.out.println(100);
        }
    }
}