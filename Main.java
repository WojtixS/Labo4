
public class Main {
    public static void main(String[] args){
        //zad 4
        Trojkat t1=new Trojkat(4,7);
        Prostokat p1=new Prostokat(4,6);
        Punkt pkt1=new Punkt(0,0);

        System.out.println("Podstawa trojkata:"+t1.podst);
        System.out.println("Wysokosc trojkata:"+t1.wys);

        System.out.println("Szerokosc prostokata:"+p1.szer);
        System.out.println("Wysokosc prostokata:"+p1.wys);

        System.out.println("Punkt x:"+pkt1.x);
        System.out.println("Punkt y:"+pkt1.y);


        p1.przesun(3,5);
        System.out.println("Punkt x po przesunieciu prostokata:"+p1.punkt.x);
        System.out.println("Punkt y po przesunieciu prostokata:"+p1.punkt.y);

        //zad11
        Kwadrat k1=new Kwadrat(5,5);
        System.out.println("Szerokosc kwadratu:"+k1.szer);
        System.out.println("Wysokosc kwadratu:"+k1.wys);

        //zad13 toString zamiast opis
        System.out.println(t1.toString());
        System.out.println(p1.toString());
        System.out.println(pkt1.toString());
        System.out.println(k1.toString());

        //zadanie do samodzielnego wykonania

        Okrag o1=new Okrag();
        System.out.println(o1.getPowierzchnia());
        System.out.println(o1.getSrednica());
        System.out.println(o1.getPromien());
        System.out.println(o1.toString());


    }
}