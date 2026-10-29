package Tugas08;
import java.time.LocalDate;

public class MakananKering extends Produk {
    public LocalDate tanggalProduksi;

    public MakananKering() {
        super(); 
        this.tanggalProduksi = LocalDate.now();
    }

    public MakananKering(String idProduk, String nama, double harga, LocalDate tanggalProduksi) {
        super(idProduk, nama, harga); 
        this.tanggalProduksi = tanggalProduksi;
    }

    public void tampilCaraSimpan() {
        System.out.println("Cara Simpan : Simpan di tempat yang kering, sejuk, dan terhindar dari matahari langsung.");
    }

    public void cekKadaluarsa() {
        LocalDate tglKadaluarsa = this.tanggalProduksi.plusYears(1);
        System.out.println("Tgl Kadaluarsa: " + tglKadaluarsa);
    }

    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Tgl Produksi: " + this.tanggalProduksi);
        tampilCaraSimpan();
        cekKadaluarsa();
    }
}
