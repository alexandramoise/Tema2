import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- a) creare tablou magazine ---");
        MagazinDeMobila mag[] = new MagazinDeMobila[2];
        creare(mag);
        for(MagazinDeMobila m: mag)
            System.out.println(m);
        System.out.println();

        System.out.println(" --- b) magazinul/le cu cea mai ieftina mobila ---");
        pret_minim(mag);
        System.out.println();

        System.out.println("--- c) mobile ce contin o lista de cuvinte in descriere ---");
        String [] cuvinte = {"depozitare","teme","crem"};
        System.out.println(verific_descriere(mag,cuvinte));

    }

    public static void creare(MagazinDeMobila[] mag) {
        Mobila[] mob = new Mobila[3];
        Mobila[] mob2 = new Mobila[3];
        mob[0] = new Mobila("Dulap Premium","Spatiu generos de depozitare, finisaj alb mat","lemn masiv",2,0.5,3,2000);
        mob[1] = new Mobila("Canapea extensibila","Design elegant, 3 locuri si spatiu depozitare, culoare visiniu","piele",1.3,0.4,0.6,3500);
        mob[2] = new Mobila("Birou calculator","Potrivit pentru munca de acasa sau realizarea temelor, culoare crem","lemn de pal",0.8,0.5,0.9,250);
        mob2[0] = new Mobila("Pat matrimonial","Potrivit pentru un cuplu, vine la pachet cu un set de lenjerie roz pal iar patul este negru","lemn",2,1.5,0.4,1750);
        mob2[1] = new Mobila("Biblioteca living","Mobilier elegant si functional, crem lucios","lemn masiv",3,0.5,2.2,250);
        mob2[2] = new Mobila("Scaun rotativ birou","Ideal pentru birou sau o sala de conferinta, culoarea albastru","lemn si burete",0,0.5,1,250);
        mag[0] = new MagazinDeMobila("Dedeman", "Calea sagului",mob);
        mag[1] = new MagazinDeMobila("Ikea","Centru comercial Nera",mob2);
    }
    public static void pret_minim(MagazinDeMobila[] magazine) {
        double min = magazine[0].getMobile()[0].getPret();
        for(MagazinDeMobila m : magazine)
            for(Mobila mob: m.getMobile())
                if(mob.getPret() < min)
                    min = mob.getPret();
        List <String> nume_magazin = new ArrayList<>();
        System.out.println("Pret minim: " + min + " la magazinul/magazinele: ");
        for(MagazinDeMobila m : magazine)
            for(Mobila mob: m.getMobile())
                if (mob.getPret() == min && ! nume_magazin.contains(m.getNume()))
                    nume_magazin.add(m.getNume());
        // folosesc lista nume_magazin pt a lua o singura data numele unui magazin in cazul in care are doua sau mai multe produse cu pretul minim
        String[] nume = new String[nume_magazin.size()];
        nume = nume_magazin.toArray(nume);
        for(String s : nume)
            System.out.println(s);
    }

    public static int verific_descriere(MagazinDeMobila[] magazine, String[] cuvinte) {
        int nr=0;
        List <Mobila> unic = new ArrayList<>();
        // ma folosesc de lista pt a lua fiecare mobila o singura data in considerare chiar daca contine mai multe dintre cuvintele cautate
        for(String s : cuvinte) {
            for(MagazinDeMobila mag : magazine)
                for(Mobila mob : mag.getMobile())
                    if(mob.getDescriere().contains(s) && ! unic.contains(mob)) {
                        nr++;
                        unic.add(mob);
                    }
        }
        return nr;
    }

}