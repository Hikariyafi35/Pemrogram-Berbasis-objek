import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        int angka=5;
        if(angka>10){
            System.out.println("Angka lebih dari 10");
        }
        else if(angka>5){
            System.out.println("Angka lebih dari 5 kurang dari 6");
        }
        else if(angka>3){
            System.out.println("angka lebih dari 3 kurang dari 5");
        }
        else{
            System.out.println("angka kecil");
        }
        
        int max = 10,i =1;
        while(max >0){
            System.out.println("angka "+i+":"+max);
            i=i+1;
            max = max-1;
        }

        for (i=1; max>0; i=i+1){
            System.out.println("angka "+i+":"+max);
            max = max-1;
        }
        for(int a=0; a <= 10; a++){
            System.out.println( a + " " );
        }

        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(tanggal);
        System.out.println(sdf.format(tanggal));
        System.out.println(sdf1.format(tanggal));
    }
}
