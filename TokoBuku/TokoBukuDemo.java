package TokoBuku;
import java.time.LocalDate;

public class TokoBukuDemo {
    public static void main(String[] args) {
        // 1. Instansiasi Objek Pembeli
        Pembeli p1 = new Pembeli("P001", "Aisya Noor");
        Pembeli p2 = new Pembeli("P002", "Marcello Artasda");
        Pembeli p3 = new Pembeli("P003", "Nashyra Afaf");

        // 2. Instansiasi Objek Buku
        Buku buku1 = new Buku("B-101", "Pemrograman Berorientasi Objek dengan Java", 95000);
        Buku buku2 = new Buku("B-102", "Sistem Informasi Bisnis Modern", 120000);
        Buku buku3 = new Buku("B-103", "Basis Data Lanjut", 65000);

        // 3. Menambahkan transaksi ke buku1
        buku1.tambahTransaksi("TRX-001", LocalDate.of(2026, 3, 10), p1, "PEG-12");
        buku1.tambahTransaksi("TRX-002", LocalDate.of(2026, 3, 15), p2, "PEG-15");
        
        buku3.tambahTransaksi("TRX-001", LocalDate.of(2026, 9, 15), p3, "PEG-15");

        // 4. Cetak Info Buku 1 (yang sudah memiliki transaksi)
        System.out.println(buku1.getInfo());

        // 5. Cetak Info Buku 2 (yang belum memiliki transaksi)
        System.out.println(buku2.getInfo());

        // 6. Cetak Info Buku 3 (yang sudah memiliki transaksi)
        System.out.println(buku3.getInfo());
    }
}