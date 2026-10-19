package Praktikum07;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
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
