public class goz {
    private int numara;
    private String renk;

    public goz(int numara,String renk) {
        this.setNumara(numara);
        this.setRenk(renk);

    }


    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void gozkirp(){
        System.out.println(renk+" gözlü "+numara+"numaralı...");

    }
}
