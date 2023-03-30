package Latihan3;

import java.util.Scanner;

public class Maindetik {
    public static void main(String[] args) {
        int detik;
        char menu = 'Y';
        Scanner inp = new Scanner(System.in);

        Detikk x = new Detikk();
        do {
            System.out.print("Masukkan detik  :");
            detik = inp.nextInt();

            x.setWaktu(detik);
            x.kvsMenit(detik);
            x.kvsJam(detik);
            x.kvsHari(detik);
            x.cetakData();

            System.out.println("Input data lagi ? [Y/T]");
            menu = inp.next().charAt(0);
            inp.nextLine();
        } while (menu == 'Y' || menu == 'y');
        inp.close();

    }
}