package matematika;

public class Matematika {
    double a,b,c,total;

    void pertambahan(){
        total = a+b;
        System.out.println("jumlah pertambahan a+b adalah\t: "+total);

    }
    void pengurangan(){
        total = a-b;
        System.out.println("jumlah penguranga a-b adalah\t: "+total);
    }
    void perkalian(){
        total = a*b;
        System.out.println("jumlah perkalian a*b adalah\t: "+total);
    }
    void pembagian(){
        total = a/b;
        System.out.println("jumlah pembagian a/b adalah\t: "+total);
    }
    void pertambahan(double a, double b, double c){
        total = a+b+c;
        System.out.println("Jumlah pertambahan a + b + c adalah: " + total);
    }
}
