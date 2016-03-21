public class Apotek {
    private String nama, alamat, nambah;
    private String []obat =new String[10];
    private int []jumlah=new int[10];
    private int []harga=new int[10];
    private static int hargatotal;
    private static int o=0;
     public Apotek(){
        this.nama = "";
        this.alamat = "";  
        this.hargatotal = 0; 
    }
    public Apotek(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public void Obat(int pilih, int jml){

            switch(pilih){
                case 1 : obat[o]="Paramex";
                         harga[o]=3000;
                         jumlah[o]=jml;
                         break;
                case 2 : obat[o]="Bodrexin";
                         harga[o]=5000;
                         jumlah[o]=jml;
                         break;
                case 3 : obat[o]="Panadol";
                         harga[o]=6000;
                         jumlah[o]=jml;
                         break;
                case 4 : obat[o]="Enervonce"; 
                         harga[o]=15000;
                         jumlah[o]=jml;
                         break;
                case 5 : obat[o]="Oskadon";
                         harga[o]=3000;
                         jumlah[o]=jml;
                         break;
            }          
            o++;

    }
    public void Obat(){
        System.out.println("Obat      \tJumlah       \tHarga");
        for (int i = 0; i < o ; i++) {

            System.out.println(obat[i]+"    \t"+jumlah[i]+"\t\tRp"+(harga[i]*jumlah[i]));
        }

        for (int i = 0; i < o; i++) {
            hargatotal += (harga[i]*jumlah[i]);

        }
        System.out.println("Total Harga : Rp "+hargatotal);
    }

}


