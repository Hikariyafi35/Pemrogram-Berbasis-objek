package Implementasi.HP;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Cellphone implements Phone{
     String merk;
     String type;
     int batteryLevel;
     int status = 1;
     int volume = 0;
     int pulsa = 0;
    public Map<String, String> daftarkontak;// daftarkontak digunakan untuk menyimpan informasi kontak telepon
    
    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()/*digunakan untuk menghasilkan angka acak*/*(100-0+1)+0);
        if (batteryLevel >= MAX_BATT_LEVEL){
            batteryLevel = MAX_BATT_LEVEL;
        } else if (batteryLevel <= MIN_BATT_LEVEL){
            batteryLevel = MIN_BATT_LEVEL;
        }
        daftarkontak = new HashMap<>(); // membuat hashmap baru dan menginiasi variabel daftarkontak
    }
    @Override
    public void powerOn(){
        // membuat metod power on jika nilai status = statusoff maka akan mengubah status  =  on yang membuat hp menyala jika selain itu maka hp sudah menyala
        if(this.status == statusoff){
            this.status = statuson;
            System.out.println("HP Nyala sfx nokia jabat tangan");
        }
        else{
            System.out.println("Hp sedang menyala");
        }
    }
    @Override
    public void powerOff(){
        //membuat metod power off jika nilai status = statuson maka akan mengubah status  =  off yang membuat hp mati jika selain itu maka hp sudah mati
        if(this.status == statuson){
            this.status = statusoff;
            System.out.println("Hp dimatikan");
        }
        else{
            System.out.println("Hp sudah mati");
        }
    }
    @Override
    public void volumeUp(){
        //membuat metod volume up yang dimana jika status == statusoff maka hp tidak bisa menambah volume karena hpsedang mati
        //jika selain itu maka pada atribut volume akan ditambah 1 nilainya karena this.volume++ mengatur jika nilai volume melebihi nilai max volume
        //maka nilai volume otomatis menjadi nilai max volume
        if(this.status == statusoff){
            System.out.println("HP mati. tidak bisa menyalakan HP");
        }
        else{
            this.volume++;
            if(this.volume>= MAX_VOLUME){
                this.volume= MAX_VOLUME;
            }
        }
    }
    @Override
    public void volumeDown(){
        //membuat metod volume down yang dimana jika status == statusoff maka hp tidak bisa mengurangi volume karena hpsedang mati
        //jika selain itu maka pada atribut volume akan dikurang 1 nilainya karena this.volume-- mengatur jika nilai volume kurang dari nilai min volume
        //maka nilai volume otomatis menjadi nilai min volume
        if(this.status == statusoff){
            System.out.println("HP mati. tidak bisa menyalakan HP");
        }
        else{
            this.volume--;
            if (this.volume <= MIN_VOLUME){
                this.volume = MIN_VOLUME;
            }
        }
    }
    @Override
    //memngambil nilai volume
    public int getVolume(){
        return this.volume;
    }
    public void topupPulsa(int jumlah) {
        if (status == 1) {
            pulsa += jumlah;
            //menambah pulsa sekarang dengan jumlah topup yang diinginkan
            System.out.println("Top up pulsa berhasil. Pulsa sekarang: " + pulsa);
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi top up pulsa.");
        }
    }

    public void cekSisaPulsa() {
        if (status == 1) {
            //mengecek pulsa yang ada dengan memanggil atribut pulsa
            System.out.println("Sisa pulsa: " + pulsa);
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cek sisa pulsa.");
        }
    }
}