package konversi;

public class konversi {
    private String [] angka = {"","satu","dua","tiga","empat","lima",
                       "enam","tujuh","delapan","sembilan"};
    
    private int tempD(String temp) {
        int num =0;
        switch (temp) {
            case "satu"    :num += 1;
                break;
            case "dua"     :num += 2;
                break;
            case "tiga"    :num += 3;
                break;
            case "empat"   :num += 4;
                break;
            case "lima"    :num += 5;
                break;
            case "enam"    :num += 6;
                break;
            case "tujuh"   :num += 7;
                break;
            case "delapan" :num += 8;
                break;
            case "sembilan":num += 9;
                break;
            case "sepuluh" :num += 10;
                break;
            case "sebelas" :num += 11;
                break;
            case "seratus" :num += 100;
                break;
        }
        return num;
    }
    
    public String overloadingMeth(int a){
     if (a < 0) 
        return "negatif " + overloadingMeth(-a);
     else if (a < 10)
        return angka[a];
     else if (a == 10)  // khusus untuk sepuluh
        return "sepuluh ";
     else if (a == 11)  // khusus untuk sebelas
        return "sebelas ";
     else if (a < 20) 
        return angka[a-10] + " belas ";
     else if (a < 100)
        return angka[(a-(a%10))/10] + " puluh " + overloadingMeth(a % 10);
     else if (a == 100) // khusus untuk seratus
        return "seratus";
     else 
        return "Angka lebih besar dari 100 (harus kurang dari 100)";
    
    }
    
    public int overloadingMeth(String a){
        int hasil = 0;
        String [] temp = a.split(" ");
        if(temp[0].equalsIgnoreCase("negatif")){
            if (temp.length == 5){
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
            }
            else if (temp.length == 4){
                if(temp[1].equalsIgnoreCase("seratus"))
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
                else
                    hasil = -tempD(temp[1])*10 + -tempD(temp[3]);
            }
            else if(temp.length == 3)
            {
                if(temp[1].equalsIgnoreCase("seratus"))
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
                else if(temp[2].equalsIgnoreCase("Puluh"))
                    hasil = -tempD(temp[2])*10;
                else if(temp[2].equalsIgnoreCase("belas"))
                    hasil = -tempD(temp[1])-10;
            }
            else
                    hasil = -tempD(temp[1]);
            
        }
        else {
            if (temp.length == 4){
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
            }
            else if (temp.length == 3){
                if(temp[0].equalsIgnoreCase("seratus"))
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
                else
                    hasil = tempD(temp[0])*10 + tempD(temp[2]);
            }
            else if(temp.length == 2)
            {
                if(temp[0].equalsIgnoreCase("seratus"))
                    System.out.println("Angka lebih besar dari 100 (harus kurang dari 100)");
                else if(temp[1].equalsIgnoreCase("Puluh"))
                    hasil = tempD(temp[0])*10;
                else if(temp[1].equalsIgnoreCase("belas"))
                    hasil = tempD(temp[0])+10;
            }
            else
                hasil = tempD(temp[0]);
        }
       
        
        return hasil;
        
    }
       
}
