
class satu{
    satu(String s){
        System.out.println("satu..."+s);
    }
}

class dua extends satu{
    dua(String s){
        super(s);System.out.println("dua....");
    }
}
class tiga extends dua{
    tiga(String s){
        super(s);System.out.println("tiga....");
    }
}
class empat extends tiga{
    empat(String s){
        super(s);System.out.println("empat....");
    }
}
public class turunan{
public static void main(String[] a){
    new empat("kiriman untuk mbah buyut di isekai...alfatihah") ;
}
}