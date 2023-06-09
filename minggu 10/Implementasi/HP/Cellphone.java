package Implementasi.HP;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

public class Cellphone implements Phone{
     String merk;
     String type;
     int batteryLevel;
     int status = 0;
     int volume = 0;
     int pulsa = 0;
    public Map<String, String> daftarkontak;
    
    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);
        if (batteryLevel >= MAX_BATT_LEVEL){
            batteryLevel = MAX_BATT_LEVEL;
        } else if (batteryLevel <= MIN_BATT_LEVEL){
            batteryLevel = MIN_BATT_LEVEL;
        }
        daftarkontak = new HashMap<>();
    }
    @Override
    public void powerOn(){
        
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
        if(this.status == statusoff){
            this.status = statusoff;
            System.out.println("Hp dimatikan");
        }
        else{
            System.out.println("Hp sudah mati");
        }
    }
    @Override
    public void volumeUp(){
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
    public int getVolume(){
        return this.volume;
    }
    public void topupPulsa(int jumlah) {
        if (status == 1) {
            pulsa += jumlah;
            System.out.println("Top up pulsa berhasil. Pulsa sekarang: " + pulsa);
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi top up pulsa.");
        }
    }

    public void cekSisaPulsa() {
        if (status == 1) {
            System.out.println("Sisa pulsa: " + pulsa);
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cek sisa pulsa.");
        }
    }
}