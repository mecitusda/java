public class ayak {
    private int numara;
    private int kuvvet;

    public ayak(int numara,int kuvvet) {
        this.numara = numara;
        this.kuvvet=kuvvet;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getKuvvet() {
        return kuvvet;
    }

    public void setKuvvet(int kuvvet) {
        this.kuvvet = kuvvet;
    }
    public void zipla(){
        int metre=kuvvet*numara;
        System.out.println(metre+" metre zıplanıldı...");
    }
}
