package PraktikumInterface;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public void getInfo() {
        System.out.println("--- Informasi Kulkas ---");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
