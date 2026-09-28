package TokoBuku;
import java.time.LocalDate;

public class TokoBukuDemo {
    public static void main(String[] args) {
        // 1. Instansiasi Objek Pembeli
        Pembeli p1 = new Pembeli("P001", "Aisya Noor");
        Pembeli p2 = new Pembeli("P002", "Budi Santoso");

        // 2. Instansiasi Objek Buku
        Buku buku1 = new Buku("B-101", "Pemrograman Berorientasi Objek dengan Java", 95000);
        Buku buku2 = new Buku("B-102", "Sistem Informasi Bisnis Modern", 120000);

        // 3. Menambahkan transaksi ke buku1
        buku1.tambahTransaksi("TRX-001", LocalDate.of(2026, 3, 10), p1, "PEG-12");
        buku1.tambahTransaksi("TRX-002", LocalDate.of(2026, 3, 15), p2, "PEG-15");

        // 4. Cetak Info Buku 1 (yang sudah memiliki transaksi)
        System.out.println(buku1.getInfo());

        // 5. Cetak Info Buku 2 (yang belum memiliki transaksi)
        System.out.println(buku2.getInfo());
    }
}