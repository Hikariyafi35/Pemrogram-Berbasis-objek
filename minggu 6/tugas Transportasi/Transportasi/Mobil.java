package Transportasi;

public class Mobil {
    //tempat untuk atribut
	public int roda;
    public String warna;
    public int kecepatan;
    public String merek;

    public void berjalan(String arah){
        System.out.println("bergerak ke "+arah);
    }

    public void berhenti(){
        System.out.println("berhenti");
    }
	
    public void infokendaraan(){
        System.out.println("kendaraan beroda "+roda);
        System.out.println("kendaraan berwarna "+warna);
        System.out.println("kendaraan bermerk "+ merek);
    }

    public int kecepatansekarang(int speed, String tipe)
    {
        int x = 0;
        if(tipe == "cepat")
        {
            x = kecepatan + speed;
        }
        else if(tipe == "lambat")
        {
            x = kecepatan - speed;
        }
        return x;
    }
    public void mundur()
    {
        int x = 5;
        kecepatan = kecepatan-x;
    }
}
