package uts_A11_2021_13217;

    public class MahasiswaLulus extends Mahasiswa {
    public int tahunWisuda;
    public float ipk;

    public MahasiswaLulus(String nim, String nama,int semester,int usia,String[] krs, int tahunWisuda,float ipk){
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda= tahunWisuda;
        this.ipk = ipk;
    }
    public boolean ikutWisuda() {
        return true;
    }
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Tahu Wisuda : "+ this.tahunWisuda);
        System.out.println("IPK       : "+ this.ipk);
    }
}
