package Implementasi.HP;

import java.io.Console;
import java.text.AttributedString;
import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        String merk,tipe;
        char hidup;
        boolean menu = true;
        
        Scanner sc = new Scanner(System.in); // untuk membuat inputan
        System.out.println("### Masukkan merk dan tipe HP ###");
        System.out.println("Merk : ");
        merk = sc.nextLine();//membuat inputan untuk merk
        System.out.println("Tipe : ");
        tipe = sc.nextLine();// membuat inputan tipe

        Contact kntk = new Contact(merk, tipe); //membuat objek baru dari claas contact bernama kntk
        System.out.println("Ponsel : "+merk+ " "+tipe);
        System.out.println("Hidupkan HP?");
        hidup = sc.next().charAt(0);//inputan untuk kondisi dibawah
        if (hidup == 'Y' || hidup == 'y'){ // membuat kondisi jika di inputkan Y atau y maka poweron
            kntk.powerOn();
        }else{
            kntk.powerOff();
        }
        do{
            System.out.println("==Apa yang ingin anda lakukan pada ponsel ? ==");
            System.out.println("1. Menyalakan Ponsel");
            System.out.println("2. Mematikan Ponsel");
            System.out.println("3. TopUp Pulsa");
            System.out.println("4. Cek Pulsa");
            System.out.println("5. Tambah Kontak");
            System.out.println("6. Lihat Semua Kontak");
            System.out.println("7. Cari Kontak");
            System.out.println("8. Volume Up");
            System.out.println("9. Volume Down");
            System.out.println("10. Matikan dan Keluar");
            System.out.println("===============================================");
            System.out.print("Pilihan : ");
            int pilih = sc.nextInt();
            sc.nextLine();// membuat menu sesuai metod yang akan dipanggil
            switch (pilih) {
                case 1:
                    kntk.powerOn();
                    break;
                case 2:
                    kntk.powerOff();
                    break;
                case 3:
                    System.out.print("Berapa jumlah pulsa yang ingin anda beli ? ");
                    int pulsa = sc.nextInt();
                    sc.nextLine();
                    kntk.topupPulsa(pulsa);
                    break;
                case 4:
                    kntk.cekSisaPulsa();
                    break;
                case 5:
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Nomor HP : ");
                    String no = sc.nextLine();
                    kntk.tambahkontak(nama, no);
                    break;
                case 6:
                    kntk.lihatSemuaKontak();
                    break;
                case 7:
                    System.out.print("Masukkan Nama : ");
                    String cari = sc.nextLine();
                    kntk.cariKontak(cari);
                    break;
                case 8:
                    kntk.volumeUp();
                    System.out.println("Volume ponsel sekarang : " + kntk.getVolume());
                    break;
                case 9:
                    kntk.volumeDown();
                    System.out.println("Volume ponsel sekarang : " + kntk.getVolume());
                    break;
                case 10:
                    kntk.powerOff();
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan anda salah");
                    break;
            }
        }while(menu == true);//jika nilai menu masih true maka perulangan akan terus dilakukan
        sc.close();
    
    }
}