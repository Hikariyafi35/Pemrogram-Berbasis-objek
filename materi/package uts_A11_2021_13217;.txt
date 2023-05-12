package uts_A11_2021_13217;
/**
 * MahasiswaMain
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


public class MahasiswaMain {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Input data
        System.out.println("### Input Data Mahasiswa ###");
        System.out.print("Total Mahasiswa   : ");
        int TotalMahasiswa = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0;i < TotalMahasiswa; i++){
            System.out.println("Mahasiswa ke "+ (i+1));
            System.out.print("NIM           : ");
            String nim = scanner.nextLine();
            System.out.println("Nama        : ");
            String nama = scanner.nextLine();
            System.out.print("Semester      : ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Usia        : ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            //input krs

            System.out.println("Total Mata Kuliah   : ");
            int totalMatkul = scanner.nextInt();
            scanner.nextLine();
            float[] nilai = new float[totalMatkul];
            String[] krs = new String[totalMatkul];
            for (int t=0; t <totalMatkul; t++) {
                System.out.println("Krs ke "+ (t+1) +" : ");
                krs[t] = scanner.nextLine();
                System.out.println("Nilai Mata kuliah "+krs[t]+" : ");
                nilai[t] = scanner.nextFloat();
                scanner.nextLine();
            }
            //tampilan pilihan mahasiswa
            System.out.println("Jenis Mahasiswa :");
            System.out.println("1. Mahasiswa Baru");
            System.out.println("2. Mahasiswa Transfer");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("4. Mahasiswa Aktif");
            System.out.print("Pilihan : ");
            int jenisMahasiswa = scanner.nextInt();
            scanner.nextLine(); // consume newline character


            //input data mahasiswa

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, semester, usia, krs);
            mahasiswa.nilai = nilai;

            //list mhs.add
            
            switch (jenisMahasiswa) {
                case 1:
                    System.out.print("Asal Sekolah : ");
                    String asalSekolah = scanner.nextLine();
                    mahasiswa = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                    mahasiswa.nilai = nilai;
                    break;
                case 2:
                    System.out.print("Asal Universitas : ");
                    String asalUniversitas = scanner.nextLine();
                    mahasiswa = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalUniversitas);
                    mahasiswa.nilai = nilai;
                    break;
                case 3:
                    System.out.print("Tahun Wisuda : ");
                    int tahunWisuda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("IPK : ");
                    float ipk = scanner.nextFloat();
                    scanner.nextLine();
                    mahasiswa = new MahasiswaLulus (nim, nama, semester, usia, krs, tahunWisuda, ipk);
                    mahasiswa.nilai = nilai;
                    break;
                default:
                    mahasiswa = new Mahasiswa(nim, nama, semester, usia, krs);
                    mahasiswa.nilai = nilai;
                    break;
            }
            listMahasiswa.add(mahasiswa);
            System.out.println("Data ditambahkan!\n");
            }
            Iterator<Mahasiswa>iterator = listMahasiswa.iterator();
            while (iterator.hasNext()) {
                Mahasiswa mhs = iterator.next();
                mhs.infoMahasiswa();
                if(mhs instanceof Mahasiswa) {
                    System.out.println("Mengikuti ospek : "+((MahasiswaBaru) mhs).ikutOspek());
                }
                else if (mhs instanceof MahasiswaTransfer){
                    System.out.println("Mengikuti ospek : "+((MahasiswaTransfer) mhs).ikutOspek());
                }
                System.out.println("######################");
            }

            System.out.println("### Rata-rata nilai mahasiswa ###");

            HashSet<String> setNama = new HashSet<String>();
        for (Mahasiswa mhs : listMahasiswa) {
            if (!setNama.contains(mhs.nama)) {
                setNama.add(mhs.nama);
                float rataNilai = mhs.hitungRatanilai(mhs.nilai);
                System.out.println(mhs.nama + ": " + rataNilai);
            }
        }
        System.out.println("=== KRS Mahasiswa ===");
            for (Mahasiswa mhs : listMahasiswa) {
                mhs.infokrsMahasiswa();
                System.out.println("=====================");
            }
        scanner.close();
    }



            
 }
    


