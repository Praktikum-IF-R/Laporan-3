public class bilangan {
private String huruf[] = {"", "satu", "dua", "tiga", "empat","lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh","sebelas"};
String output=" "; 
public bilangan () {
    this.huruf=huruf;
}
    public String Overloadingmeth (int bil) {
        System.out.print("Ouput : ");
        if (bil >= 0 && bil <= 100) {
            if (bil < 12) {
                System.out.println(huruf[bil]);
            } else if (bil < 20) {
                System.out.println(huruf[bil - 10] + " belas");
            } else if (bil < 100) {
                System.out.println(huruf[bil / 10] + " puluh " + huruf[bil % 10]);
            } else if (bil == 100) {
                System.out.println("seratus");
            }
        }
        else
            System.out.println("Bilangan melebihi range");
        return output; 
    }
    public int Overloadingmeth (String huruf) {
        if (huruf.equalsIgnoreCase ("nol"))
        return 0;
        else if (huruf.equalsIgnoreCase ("satu"))
            return 1;
        else if (huruf.equalsIgnoreCase("dua"))
            return 2;
        else if (huruf.equalsIgnoreCase("tiga"))
            return 3;
        else if (huruf.equalsIgnoreCase("empat"))
            return 4;
        else if (huruf.equalsIgnoreCase("lima"))
            return 5;
        else if (huruf.equalsIgnoreCase("enam"))
            return 6;
        else if (huruf.equalsIgnoreCase("tujuh"))
            return 7;
        else if (huruf.equalsIgnoreCase("delapan"))
            return 8;
        else if(huruf.equalsIgnoreCase("sembilan"))
            return 9;
        else if(huruf.equalsIgnoreCase("sepuluh"))
            return 10;
        else if (huruf.equalsIgnoreCase("sebelas"))
            return 11;
        else 
           return 100;
    
        }
}



