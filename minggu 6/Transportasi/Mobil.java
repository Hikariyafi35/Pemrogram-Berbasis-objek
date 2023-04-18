package Transportasi;

public class Mobil {
    //tempat untuk atribut
	int harga;
	int keluaran;
	String merk;
	
    public void detailmobil(){
        String merek = "Avanza";
        int keluaran = 2008;
        int harga = 150000000;

        
        System.out.println("Mobil"+"\nmerek mobil : "+merek+" \nTahun Keluaran : "+keluaran+ "\nTotal Harga : " +harga);
    }
	
}
