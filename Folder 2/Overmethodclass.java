package overmethod;
public class Overmethodclass {
    
    public String Angka(int a){
        String[] bil = {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
        String x = " ";
        
        if (a < 12){
            x = " "+ bil[a];
            System.out.println(x);
        }
        else if (a < 20){
            x = Angka(a - 10) + " belas ";
            System.out.println(x);
        }
        else if (a < 100){
            x = Angka(a / 10)+ " puluh" + Angka(a%10);
            System.out.println(x);
        }
        else if (a == 100){
            x = "seratus";
            System.out.println(x);
        }
        return x;
    }
    
    public int Huruf(String a){
        int x = 0;
        switch(a){
            case "nol"     :
                x = 0;     break;
            case "satu"    :
                x = 1;     break;
            case "dua"     :
                x = 2;     break;
            case "tiga"    :
                x = 3;     break;
            case "empat"   :
                x = 4;     break;
            case "lima"    :
                x = 5;     break;
            case "enam"    :
                x = 6;     break;
            case "tujuh"   :
                x = 7;     break;
            case "delapan" :
                x = 8;     break;
            case "sembilan":
                x = 9;     break;
            case "sepuluh" :
                x = 10;    break;
            case "sebelas" :
                x = 11;    break;
            case "seratus" :
                x = 100;   break;
        }
        return x;
    }
    
    public void Overmeth(String a){
        String[]ubah = a.split("-");
        
        if(ubah.length == 3)
            System.out.println((Huruf(ubah[0])*10) + Huruf(ubah[2]));
        else if(ubah.length == 2){
            if(ubah[1].equalsIgnoreCase("Puluh")){
                System.out.println((Huruf(ubah[0])*10));
            }
            if(ubah[1].equalsIgnoreCase("belas")){
                System.out.println((Huruf(ubah[0])+10));
            }
        }
        else
            System.out.println(Huruf(ubah[0]));
    }   
}