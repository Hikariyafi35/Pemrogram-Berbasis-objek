package inheritance;

public class Bicycle {
    public int speed = 10;
    public int gear = 0 ;
    
    // method
    public void changeGear(int newValue){
        gear = gear + newValue;
        System.out.println("\nGear: "+ gear);
    }

    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("\nSpeed: "+ speed);
    }
}
