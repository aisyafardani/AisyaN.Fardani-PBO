package PraktikumInterface;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    public void naikkanVolume() {

    }

    public void turunkanVolume() {

    }

    public void getInfo() {
        System.out.println("--- Informasi TV ---");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Jenis Layar : " + jenisLayar);
        System.out.println("Volume      : " + volume);
    }
}
