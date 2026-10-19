package Praktikum07;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
        this.nidn = nidn;
        System.out.println("Ini constructor class Dosen yang berparameter");
    }

    public String getInfo() {
        return "NIDN        : " +this.nidn +"\n";
    }

    // overriding
    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }

}
