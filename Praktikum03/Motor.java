package Praktikum03;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public String getPatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin (boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void displayInformasi() {
        System.out.println("Plat Nomor: " +this.platNomor);
        System.out.println("Status Mesin: " +(this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " +this.kecepatan);
        System.out.println("=========================");
    }
}
