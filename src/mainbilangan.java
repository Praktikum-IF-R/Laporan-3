import java.util.Scanner;
public class mainbilangan {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        String beta[]= new String[3];
        bilangan bil = new bilangan();
        System.out.println("-----------------------------");
        System.out.println("      PROGRAM KONVERSI       ");
        System.out.println("=============================");
        System.out.println("         Pilih menu          ");
        System.out.println("1.Konversi angka ke huruf");
        System.out.println("2.Konversi huruf ke angka");
        for (int i=0; i<3; i++){
        System.out.print("Masukan pilihan anda : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Range Angka (1-100)");
                System.out.print("Masukan angka : ");
                int ang = input.nextInt();
                bil.Overloadingmeth(ang);
                break;
            case 2:
                System.out.println("Range Angka(1-100 dalam teks)");
                System.out.print("Masukkan bilangan huruf : ");
                String huruf = input.nextLine();
                huruf = input.nextLine();
                beta=huruf.split(" ");
                if (beta.length == 1) {
                    System.out.println("Output: "+bil.Overloadingmeth(huruf));}
                    else if(beta.length==2){
                      if(beta[1].equalsIgnoreCase("belas"))
                      System.out.printf("Output: %d%d\n",1,bil.Overloadingmeth(beta[0]));
                      else
                        System.out.printf("Output: %d%d\n",bil.Overloadingmeth(beta[0]),0);
                    }
                    else {
                        System.out.printf("Output: %d%d\n",bil.Overloadingmeth(beta[0]),bil.Overloadingmeth(beta[2]));
                    }
    } 
}
}
      }


   
 

