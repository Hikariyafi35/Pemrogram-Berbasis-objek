package week2;

public class AksiSepeda {

	public static void main(String[] args) {
		//membuat objek
		Sepeda sepedajenis = new Sepeda();
		
		//mengakses atribut dan method
		String detailsepeda = sepedajenis.jenis;
		
		
		sepedajenis.detailbmx();
		sepedajenis.detailpolygon();
		sepedajenis.detailaviator();}

}
