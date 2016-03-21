package soalBab3no2;
public class apotik {  
        private int harga;
        private String nama;  
        private String alamat;  
        private String obat;  
        public apotik(){  
            nama = "-";  
            alamat = "-";  
            harga = 0;  
        }  
        public apotik(String a, String n){  
            setIdentitas(n,a);  
        }  
        public void setIdentitas(String a, String n){  
            nama = n;  
            alamat = a;  
        }  
        public String NamaPembeli(){  
            return nama;  
        }  
        public String AlamatPembeli(){  
            return alamat;  
        }  
        public void Obat(String n){  
            obat = n;  
        }  
        public void Obat(int h){  
            harga = h;  
        } 
        public String NamaObat(){  
            return obat;  
        }
        public int HargaObat(){  
            return harga;  
        }  
    }