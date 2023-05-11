import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        char ulang;
        do {
            System.out.println("===== Daftar jual =====");
            System.out.println("====================");
            System.out.println("1.Beras");
            System.out.println("2.Minyak");
            System.out.println("3.Gas");
            System.out.println();

            System.out.println("Input angka : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                System.out.println("anda memilih beras");
                break;
                case 2:
                System.err.println("anda memilih minyak");
                break;
                case 3:
                System.out.println("anda memilih gas");
                break;
                default:
                System.out.println("Menu tidak tersedia");
            }
            System.out.println();

            System.out.println("ingin kembali? y/t");
            ulang = input.next().charAt(0);

            System.out.println();

        }
        while (ulang!= 't');

        System.out.println("terimakasih...");
    }
}
