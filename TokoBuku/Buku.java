package TokoBuku;
import java.util.ArrayList;
import java.time.LocalDate;

public class Buku {
    private String noBuku;
    private String nama;
    private int harga;
    private ArrayList <Transaksi> riwayatPembelian;

    public Buku(String noBuku, String nama, int harga) {
        this.noBuku = noBuku;
        this.nama = nama;
        this.harga = harga;
        this.riwayatPembelian = new ArrayList<Transaksi>(); 
    }

    public String getNoBuku() {
        return noBuku;
    }

    public void setNoBuku(String noBuku) {
        this.noBuku = noBuku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tambahTransaksi(String noTransaksi, LocalDate tanggal, Pembeli pembeli, String kodePegawai) {
        Transaksi trs = new Transaksi(noTransaksi, tanggal, pembeli, kodePegawai);
        trs.setBuku(this); 
        riwayatPembelian.add(trs);
    }

    public String getInfo() {
        String info = "";
        info += "No Buku        : " + this.noBuku + "\n";
        info += "Nama           : " + this.nama + "\n";
        info += "Harga          : " + this.harga + "\n";
        if (!riwayatPembelian.isEmpty()) {
            info += "Transaksi      : \n";
            for (Transaksi transaksi : riwayatPembelian) {
                info += transaksi.getInfo();
            }
        }
        else {
            info += "Belum ada transaksi";
        }
        info += "\n";
        return info;
    }
}