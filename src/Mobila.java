public class Mobila {
    String nume,descriere,material;
    double lungime,latime,inaltime,pret;

    public Mobila() {
    }

    public Mobila(String nume,String descriere,String material,double lungime,double latime,double inaltime,double pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.material = material;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Mobila{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", material='" + material + '\'' +
                ", lungime=" + lungime +
                ", latime=" + latime +
                ", inaltime=" + inaltime +
                ", pret=" + pret +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getMaterial() {
        return material;
    }

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public double getPret() {
        return pret;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}

