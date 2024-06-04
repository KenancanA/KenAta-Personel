package entity;

public class Users {

    private int kullaniciID;
    private String adsoyad;
    private String tcno;
    private String email;
    private String telnumara;
    private String dogumtarihi;
    private String departman;
    private String maas;

    public Users() {
        super();
    }

    public Users(String adsoyad, String tcno, String email, String telnumara, String dogumtarihi, String departman, String maas) {
        this.adsoyad = adsoyad;
        this.tcno = tcno;
        this.email = email;
        this.telnumara = telnumara;
        this.dogumtarihi = dogumtarihi;
        this.departman = departman;
        this.maas = maas;
    }


    public int getKullaniciID() {
        return kullaniciID;
    }

    public void setKullaniciID(int kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelnumara() {
        return telnumara;
    }

    public void setTelnumara(String telnumara) {
        this.telnumara = telnumara;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Users{" +
                "kullaniciID='" + kullaniciID + '\'' +
                ", adsoyad='" + adsoyad + '\'' +
                ", tcno='" + tcno + '\'' +
                ", email='" + email + '\'' +
                ", telnumara='" + telnumara + '\'' +
                ", dogumtarihi='" + dogumtarihi + '\'' +
                ", departman='" + departman + '\'' +
                ", maas='" + maas + '\'' +
                '}';
    }
}
