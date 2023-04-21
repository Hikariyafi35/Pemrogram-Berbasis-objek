import java.util.Scanner;

import Latihan3.*;

public class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        GradedActivity gradeActiv = new GradedActivity(nama);

        System.out.println("===== PassFailExam =====");
        System.out.print("Masukkan jumlah pertanyaan : ");
        int jumlhsoal = sc.nextInt();
        System.out.print("Masukkan jumlah pertanyaan yang salah : ");
        int miss = sc.nextInt();
        System.out.print("Berapa score minimal yang dibutuhkan untuk Lulus : ");
        int minPass = sc.nextInt();

        PassFailExam passfailexm = new PassFailExam(jumlhsoal, miss, minPass);
        System.out.println("Nama  = " + gradeActiv.name);
        System.out.println("Poin tiap pertanyaan = " + passfailexm.getPointsEach());
        System.out.println("Score ujian = " + passfailexm.getScore());
        System.out.println("Grade ujian = " + passfailexm.getGrade());

        System.out.println("===== FinalExam =====");
        System.out.print("Masukkan jumlah pertanyaan : ");
        int jumlhsoal2 = sc.nextInt();
        System.out.print("Masukkan jumlah pertanyaan yang salah : ");
        int miss2 = sc.nextInt();
        FinalExam finalexm = new FinalExam(jumlhsoal2, miss2);
        System.out.println("Nama  = " + gradeActiv.name);
        System.out.println("Poin tiap pertanyaan = " + finalexm.getPointsPerQuestion());
        System.out.println("Score ujian = " + finalexm.getScore());
        System.out.println("Grade ujian = " + finalexm.getGrade());

        sc.close();

    }
}

