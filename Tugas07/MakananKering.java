package Tugas07;

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

    @Override
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Tgl Produksi: " + this.tanggalProduksi);
    }
}
