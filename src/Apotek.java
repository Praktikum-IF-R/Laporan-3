package mainapotek;
import java.util.Scanner;
public class Apotek {
    String obat, nama, alamat, jwb = null;
    int jum,daftar;
    double hrg, total = 0, harga = 0;
    Scanner in = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    private String nm[] = new String[5];
    private int jml[] = new int[5];
    public Apotek(){
    }
    public void datapasien(String nm, String al){
        nama = nm;
        alamat = al;
        System.out.println("NAMA        : "+nama);
        System.out.println("ALAMAT      : "+alamat);
    }
    public void obat(){
        do {
            for (int i=0; i<3; i++){
            daftar = i+1;
            System.out.print("Masukkan nama obat   : ");
            nm[i] = in.nextLine();
            System.out.print("Masukkan jumlah obat : ");
            jml[i] = input.nextInt();
                if (nm[i].equalsIgnoreCase("diare")){
                harga = 3000;
                hrg = harga * jml[i];
                total = total + hrg;
                }
            else if (nm[i].equalsIgnoreCase("sakit kepala")){
                harga = 5000;
                hrg = harga * jml[i];
                total = total + hrg;
                }
            else if (nm[i].equalsIgnoreCase("demam")){
                harga = 4500;
                hrg = harga * jml[i];
                total = total + hrg;
                }
            else if (nm[i].equalsIgnoreCase("flu")){
                harga = 4000;
                hrg = harga * jml[i];
                total = total + hrg;
                }
            else 
                System.out.println("Obat Tidak Tersedia!!!");           
            System.out.println("Apakah anda ingin menambah obat ?(y/t)");
            jwb = in.nextLine();
        }
        }  while (jwb.equalsIgnoreCase("y"));     
    }
    public void daftarobat(){
        System.out.println("         ---- DAFTAR OBAT ----       ");   
        for (int j = 0; j < daftar; j++){
            System.out.println("Nama Obat           : Obat "+nm[j]);
            System.out.println("Jumlah Obat         : "+jml[j]);
            System.out.println("");
        }
        System.out.println("HARGA TOTAL         : Rp "+total);
    }
}