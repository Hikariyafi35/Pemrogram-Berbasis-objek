import Latihan1.Mobil2Bmw;
public class Mobil2BmwDemo {
    public static void main(String[] args){
        //membuat objek
        Mobil2Bmw mobilBmw = new Mobil2Bmw();
        mobilBmw.statusTV="TV Nyala";
        mobilBmw.infochannel="Global TV";
        mobilBmw.tampilgambar="Spongebob";
        //memanggil method
        System.out.println("Status Tv");
        mobilBmw.nontonTV();
        
        System.out.println("\n Status Mobil");
        mobilBmw.statusmobil();
        mobilBmw.ubahgigi(3);
        mobilBmw.matikanmobil();

    }
}

 
