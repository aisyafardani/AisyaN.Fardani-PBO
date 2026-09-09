package Praktikum03;

public class Anggota {  
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPeminjaman) {
        if (jumlahPinjaman + jumlahPeminjaman <= limitPinjaman) {
            jumlahPinjaman += jumlahPeminjaman;
        } else {
            System.out.println("Maaf, peminjaman ditolak karena melebihi limit pinjaman!");
        }
    }

    public void angsur(int jumlahAngsuran) {
        int minimalAngsur = (int) (0.1 * jumlahPinjaman);
        if (jumlahAngsuran < minimalAngsur) {
            System.out.println("Maaf, angsuran kurang dari 10% dari jumlah pinjaman");
        } else if (jumlahAngsuran <= jumlahPinjaman) {
            jumlahPinjaman -= jumlahAngsuran;
        } else {
            System.out.println("Angsuran melebihi sisa pinjaman!");
        }
    }

}
