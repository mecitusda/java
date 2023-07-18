public class el {
    private String buyukluk;

    public el(String buyukluk) {
        this.setBuyukluk(buyukluk);
    }


    public String getBuyukluk() {
        return buyukluk;
    }

    public void setBuyukluk(String buyukluk) {
        this.buyukluk = buyukluk;
    }

    public void alkis(){
        System.out.println("Alkışlandı...");
    }
}
