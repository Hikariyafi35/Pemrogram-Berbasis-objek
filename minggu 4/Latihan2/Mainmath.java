package Latihan2;
import java.util.Scanner;

public class Mainmath {
    public static void main(String[] args) {
        double d, b, a, c, xx, x;
        char menu = 'Y';

        Scanner inp = new Scanner(System.in);
        Rumus math = new Rumus();
        while (menu == 'Y' || menu == 'y') {
            System.out.print("Masukkan a   : ");
            a = inp.nextDouble();
            System.out.print("Masukkan b   : ");
            b = inp.nextDouble();
            System.out.print("Masukkan c   : ");
            c = inp.nextDouble();

            math.setData(a, b, c);
            math.hitung();
            System.out.println("Input lagi ? [Y/T] ");
            menu = inp.next().charAt(0);
        }

    }
}