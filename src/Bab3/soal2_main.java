package Bab3;

public class soal2_main {
public static void main(String[] args) {
        System.out.println("             SELAMAT DATANG DI APOTEK SAHABAT");
        soal2 apotek = new soal2();
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - +");
        System.out.printf("| %-4s | %-35s | %-6s |\n","Kode","           Daftar Obat"," Harga");
        System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - - - - |");
        
        for(int i=0;i<10;i++){
            System.out.printf("| %-4s | %-35s | %6s |\n",apotek.soal2[i][0],
                                                          apotek.soal2[i][1],
                                                          apotek.soal2[i][2]);   
        }
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - +");
        
        apotek.Data(apotek.getNama(), apotek.getAlamat());
    }

}
