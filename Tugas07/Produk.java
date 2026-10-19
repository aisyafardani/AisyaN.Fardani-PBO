package Tugas07;

public class Produk {
    public String idProduk;
    public String nama;
    public double harga;

    // 1. Constructor tanpa parameter (Overloading)
    public Produk() {
        this.idProduk = "-";
        this.nama = "-";
        this.harga = 0.0;
    }

    // 2. Constructor berparameter (Overloading)
    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("ID Produk  : " + this.idProduk);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Harga      : " + this.harga);
    }
}