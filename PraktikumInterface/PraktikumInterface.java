package PraktikumInterface;

public class PraktikumInterface {
    public static void main(String[] args) {

        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "Sharp";
        kulkas1.warna = "Silver";
        kulkas1.harga = 2500000;
        kulkas1.jumlahPintu = 2;
        kulkas1.getInfo();

        System.out.println();

        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.warna = "Hitam";
        tv1.harga = 3500000;
        tv1.jenisLayar = "LED 32 inch";
        tv1.volume = 15;
        tv1.naikkanVolume(); // Menguji method interface
        tv1.getInfo();
    }
}
