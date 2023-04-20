package Latihan1;

public class Mobil2 {
    public int gigi = 0;

    public void statusmobil(){
        System.out.println("Mobil berhasil Menyala ");
    }
    public void ubahgigi(int newgigi){
        gigi = gigi+newgigi;
        System.out.println("\n Gear: "+gigi);
   }

   public void matikanmobil(){
    System.out.println("\n Mobil Mati");
   }
}