package Implementasi.HP;
import java.io.Console;

public interface  Phone {
    public static final int statuson = 1;
    public static final int statusoff = 0;

    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract int getVolume();

}
