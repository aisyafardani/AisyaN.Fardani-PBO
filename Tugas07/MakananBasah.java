package Tugas07;

import java.time.LocalTime;

public class MakananBasah extends Produk {
    public LocalTime jamProduksi;

    public MakananBasah() {
        super(); 
        this.jamProduksi = LocalTime.now();
    }

    public MakananBasah(String idProduk, String nama, double harga, LocalTime jamProduksi) {
        super(idProduk, nama, harga); 
        this.jamProduksi = jamProduksi;
    }

    @Override
    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jam Produksi: " + this.jamProduksi);
    }
}
