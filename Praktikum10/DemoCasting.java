package Praktikum10;

// membuat class untuk demo up down casting
public class DemoCasting {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        Pegawai pegawai1 = (Pegawai) dosen1;
        
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn);
        pegawai1.displayInfo();

        // TenagaKependidikan test = (TenagaKependidikan) pegawai1;

        Dosen Dosen3 = (Dosen) pegawai1;

        System.out.println(Dosen3.nama);
        System.out.println(Dosen3.nidn);
        Dosen3.mengajar();

        // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");   
    }
}