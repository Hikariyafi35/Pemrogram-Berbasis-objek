package Transportasi;

public class Bicycle {
     //tempat untuk atribut
     public int gear = 5;
     int roda;
     String jenisSepeda;
     String merkSepeda;
 
	
     public Bicycle(int TotalRoda, String jenis, String merk) {
        roda = TotalRoda;
        jenisSepeda = jenis;
        merkSepeda = merk;
        System.out.println("Sepeda: " + jenis + " bermerk " + merk + " memiliki jumlah roda " + TotalRoda);
    }
}
