package TokoBuku;

public class Pembeli {
    private String noPembeli;
    private String nama;

    public Pembeli(String noPembeli, String nama) {
        this.noPembeli = noPembeli;
        this.nama = nama;
    }

    public String getNoPembeli() {
        return noPembeli;
    }

    public void setNoPembeli(String noPembeli) {
        this.noPembeli = noPembeli;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + noPembeli + ")";
    }
}