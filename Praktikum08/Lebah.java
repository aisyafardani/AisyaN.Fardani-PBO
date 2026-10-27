package Praktikum08;

public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bernapas() {
        System.out.println("=== CARA BERNAPAS ===");
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan \n");
    }

    @Override
    public void bergerak() {
        System.out.println("=== CARA BERGERAK ===");
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang \n");
    }

    @Override 
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta       : " +this.kasta +"\n");
    }
}
