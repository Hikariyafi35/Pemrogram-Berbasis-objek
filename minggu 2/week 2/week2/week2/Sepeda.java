package week2;

public class Sepeda {
	
	//tempat untuk atribut
	int jumlahroda = 2;
	int gear;
	String jenis;
	String merk;
	
	//tempat untuk method
	void detailbmx() {
		String jenis = "Sepeda BMX ";
		String merk = "Wimcycle ";
		int gear = 5;
		System.out.println(jenis+"bermerk "+merk+" memiliki jumlah roda "+jumlahroda+" jumlah gear " +gear);
	}
	
	void detailpolygon() {
		String jenis= "Sepeda gunung";
		String merk = "Polygon" ; 
		int gear = 4;
		System.out.println(jenis+" bermerk "+ merk+" memiliki jumlah roda "+jumlahroda+ " jumlah gear "+gear);
	}
	void detailaviator() {
		String jenis = "Sepeda gunung";
		String merk = "aviator";
		int gear = 3;
		System.out.println(jenis+" bermerk "+ merk+" memiliki jumlah roda "+jumlahroda+ " jumlah gear "+gear);

	}
	
}