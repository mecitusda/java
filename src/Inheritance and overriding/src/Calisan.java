public class Calisan {
    private String isim;
    private String Departman;
    private double maas;
    Calisan(String isim,String Departman,double maas){
        this.setDepartman(Departman);
        this.setMaas(maas);
        this.setIsim(isim);
    }
    public void Bilgilerigoster(){
        System.out.println("isim: "+ getIsim() +"\nDepartman: "+ getDepartman() +"\nmaas: "+ getMaas()+"\n");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        Departman = departman;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
}
