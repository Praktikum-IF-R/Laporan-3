package praktikum3overload1;
public class ClassOverloading{
   private String Angka[]={"Nol","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas",};
   public void overloadingMeth(int satuan){
      
       if (satuan<12){
           System.out.println("Konversi: "+Angka[satuan]);
       }
       else if(satuan<20){
           satuan%=10;
           System.out.println("Konversi: "+Angka[satuan]+" Belas");
       }
       else if(satuan>19&&satuan<100){
           System.out.print(Angka[satuan/10]);          
           if (satuan%10==0){
           System.out.print("Konversi: "+Angka[satuan/10]+" "+"Puluh");
           }
           else{
                System.out.println(" Puluh "+Angka[satuan%10]);
            }
       }
       else if (satuan==100){
               System.out.println("Konversi: Seratus");
           }
       else{
           System.out.println("Range harus 0-100");
       }
   }
    public static void overloadingMeth(String a){
    String kata[]=a.split(" ");
    int ang[] = new int[3];
    for(int i=0;i<kata.length;i++){
    if(i==1){
    continue;
    }
    if((kata[i]).equalsIgnoreCase("satu"))
    ang[i]=1;
    else if(kata[i].equalsIgnoreCase("dua"))
    ang[i]=2;
    else if(kata[i].equalsIgnoreCase("tiga"))
    ang[i]=3;
    else if(kata[i].equalsIgnoreCase("empat"))
    ang[i]=4;
    else if(kata[i].equalsIgnoreCase("lima"))
    ang[i]=5;
    else if(kata[i].equalsIgnoreCase("enam"))
    ang[i]=6;
    else if(kata[i].equalsIgnoreCase("tujuh"))
    ang[i]=7;
    else if(kata[i].equalsIgnoreCase("delapan"))
    ang[i]=8;
    else if(kata[i].equalsIgnoreCase("sembilan"))
    ang[i]=9;
    }
    if(!a.contains(" ")){
        if(kata[0].equalsIgnoreCase("sepuluh"))
    ang[0]=10;
    else if(kata[0].equalsIgnoreCase("sebelas"))
    ang[0]=11;
    else if(kata[0].equalsIgnoreCase("nol"))
    ang[0]=0;
    else if(kata[0].equalsIgnoreCase("seratus"))
    ang[0]=100;
    System.out.println(ang[0]);
    }
    else if(kata.length==2){
        if(kata[1].equalsIgnoreCase("belas")){
            ang[1]=1;
            System.out.println(ang[1]+""+ang[0]);
        }
        else if(kata[1].equalsIgnoreCase("puluh")){
            ang[1]=0;
            System.out.println(ang[0]+""+ang[1]);
        }
    }
    else
    System.out.println(ang[0]+""+ang[2]);
    }
}