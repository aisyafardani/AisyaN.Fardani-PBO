package PraktikumInterface;

public class Kipas extends AlatElektronik {
    public String jenis;

    public void getInfo() {
        System.out.println("--- Informasi TV ---");
        System.out.println("Merk        : " + merk);
        System.out.println("Warna       : " + warna);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Jenis       : " + jenis);
    }
}
