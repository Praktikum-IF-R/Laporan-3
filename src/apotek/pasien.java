package apotek;

public class pasien {
    private String nama;
    private String alamat;
    
    private String [] pesanObat = new String[5];
    private int [] jumlahObat = new int[5];
    private int [] HargaObat = new int[5];
    
    public pasien(){
        nama = null;
        alamat = null;
    }
    
    public pasien(String n){
        nama = n;
    }
    
    public pasien(String n, String a){
        nama = n;
        alamat = a;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String a){
        alamat = a;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
   
 
    public void daftarObat(){
        String [][] daftarObat = {{"Obat Pusing","15000"},{"Obat Flu","5000"},
                                  {"Obat Batuk","6000"},{"Obat Cinta","7000"},
                                  {"Obat Pegal","5500"}};
        
        System.out.println("\nJenis Obat\tHarga");
        System.out.println("---------------------");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.print(daftarObat[i][j]+"\t");
            }
            System.out.println("");
        } 
    }
    
    private int i=0;
    public void daftarObat(String obat,int jumlah){
        
        if(obat.equalsIgnoreCase("obat pusing"))
            {pesanObat[i]="Obat Pusing";HargaObat[i]=15000;}
        else if(obat.equalsIgnoreCase("obat flu"))
            {pesanObat[i]="Obat Flu";HargaObat[i]=5000;}
        else if(obat.equalsIgnoreCase("obat batuk"))
            {pesanObat[i]="Obat Batuk";HargaObat[i]=6000;}
        else if(obat.equalsIgnoreCase("obat Cinta"))
            {pesanObat[i]="Obat Cinta";HargaObat[i]=7000;}
        else if(obat.equalsIgnoreCase("obat pegal"))
            {pesanObat[i]="Obat Pegal";HargaObat[i]=5500;}
        else{
            System.out.println("Tida ada dalam daftar obat");
        }
            
        
        jumlahObat[i]=jumlah;
        
        i++; 
    }
    
    public void tampilPesan(){
        int total = 0;
        for(int i=0;i<5;i++){
            if(pesanObat[i]==null && jumlahObat[i]==0 && HargaObat[i]==0)
                System.out.print("");
            else
                System.out.println(pesanObat[i]+"\t"+HargaObat[i]+"\tx"+jumlahObat[i]+"\t"+(HargaObat[i]*jumlahObat[i]));
            
            total += (HargaObat[i]*jumlahObat[i]);
        }
            System.out.print("-------------------------------------\n"); 
  
            System.out.println("Total\t\t\t\t"+total);
    }
    
    
    
    
        
    
}
