package javaapplication84;
public class JavaApplication84 {
   int total,terjual=0;
   String [][]daftarobat;
   String [][]penjualan;
public void baru(String Jual[][],String Obat[][]){
    this.penjualan = new String[Jual.length][Jual.length];
    this.penjualan = Jual;
    this.daftarobat = new String[Obat.length][Obat.length];
    this.daftarobat = Obat;
}    
public void Obat(int nomor){
        int o = nomor -1;
        System.out.println("======================================");
        System.out.println("Nama Pembeli    : "+penjualan[o][0]);
        System.out.println("Alamat Pembeli  : "+penjualan[o][1]);
        System.out.println("======================================");
        System.out.println("Total Biaya Obat:Rp."+penjualan[o][2]);
        System.out.println("======================================");
    }
public  void displayObat(){
        for(int o =0; o < daftarobat.length; o++){
        int nomor = o + 1;
        System.out.println(nomor+"."+daftarobat[o][0]+"\t"+ daftarobat[o][1]);
        }
    }
    public  void displayPenjualan(){
        int totalpenjualan=0;
        System.out.println("=======================================");
        System.out.println("nomor\t nama \t alamat \t total harga");
        for(int o =0; o < penjualan.length; o++){
        int nomor = o + 1;
        System.out.println(nomor+".\t"+ penjualan[o][0]+"\t"+ penjualan[o][1]+"\tRp."+penjualan[o][2]);
        }
        for(int o = 0; o < penjualan.length; o++){
        int sementara = Integer.parseInt(penjualan[o][2]);
        totalpenjualan = totalpenjualan + sementara;
        }
        System.out.println("=======================================");
        System.out.println("Total Penjualan = Rp."+totalpenjualan);
    }
    public  void Obat(int pilihan,int jumlah){
        int nomor = pilihan - 1;
        int harga = Integer.parseInt(daftarobat[nomor][1]);
        int dibeli = harga*jumlah;
        total = total + dibeli;
    }
}

