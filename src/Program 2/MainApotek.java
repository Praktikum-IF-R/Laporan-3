package praktik03;
import static praktik03.Apotek.med;
import java.util.*;
public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Apotek satu = new Apotek();
        int x[] = new int [5];
        boolean loop = true;
        double harga = 0;
        System.out.print("Masukkan Nama: ");
        String a = in.nextLine();
        System.out.print("Masukkan Alamat (Kota): ");
        String b = in.next();
        satu.setNama(a);
        satu.setAlamat(b);
        while(loop){
            System.out.println("1. Lihat Obat");
            System.out.println("2. Beli");
            System.out.println("3. Lihat Daftar Belanja");
            System.out.println("4. Keluar");
            System.out.print("Input: ");
            int c = in.nextInt();
            switch(c){
                case 1: for (int i = 0; i<5; i++){
                    System.out.println(med[1][i]+"\t\t"+"Rp "+med[0][i]);}
                    System.out.println("==================================");
                    break;
                case 2: boolean loop1 = true;
                        while(loop1){
                            System.out.print("Obat yang ingin anda beli: ");
                            String d = in.next();
                            System.out.print("Jumlah obat: ");
                            int e = in.nextInt();
                            if(d.equalsIgnoreCase("diapet")){
                                x[0] += e; harga += (int) med[0][0]*e;}
                            else if(d.equalsIgnoreCase("paramex")){
                                x[1] += e; harga += (int) med[0][1]*e;}
                            else if(d.equalsIgnoreCase("nosib")){
                                x[2] += e; harga += (int) med[0][2]*e;}
                            else if(d.equalsIgnoreCase("viostin")){
                                x[3] += e; harga += (int) med[0][3]*e;}
                            else if(d.equalsIgnoreCase("ambeven")){
                                x[4] += e; harga += (int) med[0][4]*e;}
                            System.out.println("Ingin membeli lagi? (Y/N) = ");
                            String f = in.next();
                            if(f.equalsIgnoreCase("N")){
                                loop1 = false;}
                            System.out.println("==========================");}
                    break;
                case 3: for(int i = 0; i<5; i++){
                    if(x[i] !=0){
                        System.out.println(med[1][i]+"\t: "+x[i]);}}
                        System.out.println("Total Harga:\tRp "+harga);
                        System.out.println("==============================");
                    break;
                case 4: satu.display();
                        for(int i = 0; i<5; i++){
                        if(x[i] !=0){
                        System.out.println(med[1][i]+"\t: "+x[i]);}}
                        System.out.println("Total Harga:\tRp "+harga);
                        System.out.println("=============================");
                    loop = false;
                    break;
                default: System.out.println("Pilihan tidak ditemukan..");
            }
        }
    }
}