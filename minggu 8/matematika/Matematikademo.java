package matematika;
import matematika.Matematika;

public class Matematikademo {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        mtk.a=12.5;
        mtk.b=28.7;
        mtk.c=14.2;

        mtk.pertambahan();
        mtk.pengurangan();
        mtk.perkalian();
        mtk.pembagian();
        mtk.pertambahan(12.5, 28.7, 14.2);

    }
}
