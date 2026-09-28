package TokoBuku;
import java.time.LocalDate;

public class Transaksi{
    private String noTransaksi;
    private LocalDate tanggal;
    private Pembeli pembeli;
    private String kodePegawai;
    private Buku buku;

    public Transaksi(String noTransaksi, LocalDate tanggal, Pembeli pembeli, String kodePegawai) {
        this.noTransaksi = noTransaksi;
        this.tanggal = tanggal;
        this.pembeli = pembeli;
        this.kodePegawai = kodePegawai;
    }

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal (LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public String getKodePegawai() {
        return kodePegawai;
    }

    public void setKodePegawai (String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getInfo() {
        String info = "";
        info += "\tNo Transaksi : " + noTransaksi + "\n";
        info += "\tTanggal      : " + tanggal + "\n";
        info += "\tPembeli      : " + (pembeli != null ? pembeli.getInfo() : "-") + "\n";
        info += "\tKode Pegawai : " + kodePegawai + "\n";
        return info;
    }
}