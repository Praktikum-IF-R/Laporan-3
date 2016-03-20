package mainoverloading;
public class Overloading {
    private String a[] = {"nol","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public void overloadingMeth(String h){
        String kata[]=h.split(" ");
        int angka[] = new int [3];
        for(int i=0; i<kata.length; i++){
            if(i!=1){
                if(kata[i].equalsIgnoreCase("satu")){
                    angka[i]=1;
                }
                else if(kata[i].equalsIgnoreCase("dua")){
                    angka[i]=2;
                }
                else if(kata[i].equalsIgnoreCase("tiga")){
                    angka[i]=3;
                }
                else if(kata[i].equalsIgnoreCase("empat")){
                    angka[i]=4;
                }
                else if(kata[i].equalsIgnoreCase("lima")){
                    angka[i]=5;
                }
                else if(kata[i].equalsIgnoreCase("enam")){
                    angka[i]=6;
                }
                else if(kata[i].equalsIgnoreCase("tujuh")){
                    angka[i]=7;
                }
                else if(kata[i].equalsIgnoreCase("delapan")){
                    angka[i]=8;
                }
                else if(kata[i].equalsIgnoreCase("sembilan")){
                    angka[i]=9;
                }
                else{
                    if(kata[i].equalsIgnoreCase("sepuluh")){
                        angka[i]=10;break;
                    }
                    else if(kata[i].equalsIgnoreCase("sebelas")){
                        angka[i]=11;break;
                    }
                    else if(kata[i].equalsIgnoreCase("seratus")){
                        angka[i]=100;break;
                    }
                    else if(kata[i].equalsIgnoreCase("nol")){
                        angka[i]=0;break;
                    }
                }
            }
            else{
                if(kata[i].equalsIgnoreCase("belas")){
                    angka[i]=1;break;
                }
                else if(kata[i].equalsIgnoreCase("puluh") && kata.length<3){
                    angka[i]=0;break;
                }                
            }   
        }
        if(kata.length==1){
            System.out.println(angka[0]);
        }
        else if(kata.length==2){
            System.out.println(angka[1]+""+angka[0]);
        }
        else{
            System.out.println(angka[0]+""+angka[2]);
        }
    }
    public void overloadingMeth(int b){
        if (b>=1 && b<=11){
            System.out.println(a[b]);
        }
        else if(b>11 && b<20){
            b%=10;
            System.out.println(a[b]+" belas");
        }
        else if(b>20 && b<100){
            System.out.print(a[b/10]);
            if(b%10==0){
                System.out.println(" puluh");
            }
            else{
                System.out.println(" puluh "+a[b%10]);
            }
        }
        else if (b==100){
            System.out.println("seratus");
        }
        else{
            System.out.println("-");
        }
    }
}