package Praktikum07;

public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    // overriding
    public String getAllInfo() {
        String info = this.getInfo();
        info += "NIDN        : " +nidn +"\n";

        return info;
    }
}
