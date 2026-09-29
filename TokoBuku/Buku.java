package TokoBuku;
import java.util.ArrayList;
import java.time.LocalDate;

public class Buku {
    private String noBuku;
    private String nama;
    private int harga;
    //riwayatPembelian merupakan wadah yang akan jadi tempat object object
    private ArrayList <Transaksi> riwayatPembelian;

    //Pemberian nilai untuk masing masing atribur
    public Buku(String noBuku, String nama, int harga) {
        this.noBuku = noBuku;
        this.nama = nama;
        this.harga = harga;
        //Atribut riwayatpembelian bertipe arraylist of transaksi
        this.riwayatPembelian = new ArrayList<Transaksi>(); 
    }

    public String getNoBuku() {
        return noBuku;
    }

    //no buku di kiri merupakan atribut dan yang di kanan merupakan parameter
    //menggunakan this karena nama keduanya sama dan noBuku kiri merujuk pada atribut dan yang di kanan merujuk pada parameter
    public void setNoBuku(String noBuku) {
        this.noBuku = noBuku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //trs merupakan object
    public void tambahTransaksi(String noTransaksi, LocalDate tanggal, Pembeli pembeli, String kodePegawai) {
        Transaksi trs = new Transaksi(noTransaksi, tanggal, pembeli, kodePegawai);
        trs.setBuku(this); 
        riwayatPembelian.add(trs); //trs dimasukan ke dalam riwayat pembelian
    }

    public String getInfo() {
        String info = "";
        info += "No Buku        : " + this.noBuku + "\n";
        info += "Nama           : " + this.nama + "\n";
        info += "Harga          : " + this.harga + "\n";
        if (!riwayatPembelian.isEmpty()) {
            //! merupakan tidak. Code ini melakukan pengecekan apakah sudah ada isinya atau belum
            info += "Transaksi      : \n";
            for (Transaksi transaksi : riwayatPembelian) {
                info += transaksi.getInfo();
            }
        }
        else {
            info += "Belum ada transaksi";
        }
        info += "\n";
        return info;
    }
}