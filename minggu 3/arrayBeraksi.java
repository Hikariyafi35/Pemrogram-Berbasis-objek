import java.util.Scanner;
public class arrayBeraksi {
    public static void main(String[] args) {
        int jmlData;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data: ");
        jmlData = inp.nextInt();

        arayPrototype ap = new arayPrototype();

        ap.setArray(jmlData);

        ap.cetakArray();

        System.out.println("\nJumlah angka = "+ap.sumOfArray());
    }
}
