package Eksepsi;

public class Eksepsi2 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[10];
			arr[10] = 5;			
		}
		catch(ArrayIndexOutOfBoundsException e) { // untuk mengecek array yang melebih batas
			System.out.println("Terjadi eksepsi: "+e.getMessage());
		}
		
	}

}