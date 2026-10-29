package Tugas08;

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

    public void tampilCaraSimpan() {
        System.out.println("Cara Simpan : Simpan di dalam lemari es / wadah tertutup kedap udara.");
    }

    public void cekKadaluarsa() {
        System.out.println("Status Kedaluwarsa : Harap dikonsumsi dalam waktu 6-8 jam setelah jam produksi.");
    }

    public void tampilInformasi() {
        super.tampilInformasi();
        System.out.println("Jam Produksi: " + this.jamProduksi);
        tampilCaraSimpan();
        cekKadaluarsa();
    }
}
