import java.io.Serializable;

public class Calisan implements Serializable {
    private static final long SerialVersionUID=3000;
    private String ad_soyad;
    private String departman;
    private int id;
    private String ali;

    public Calisan(String ad_soyad,String departman,int id) {
        this.ad_soyad = ad_soyad;
        this.departman=departman;
        this.id=id;
    }

    @Override
    public String toString() {
        return
                "Ad ve Soyad= " + ad_soyad + "\n" +
                "Departman= " + departman + "\n" +
                "İd= " + id;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
