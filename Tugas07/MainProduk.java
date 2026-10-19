package Tugas07;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainProduk {
    public static void main(String[] args) {

        MakananKering mk1 = new MakananKering("MK01", "Keripik Singkong", 15000, LocalDate.of(2026, 10, 15));
        System.out.println("=== DATA MAKANAN KERING ===");
        mk1.tampilInformasi();

        System.out.println();

        MakananBasah mb1 = new MakananBasah("MB01", "Kue Lapis", 25000, LocalTime.of(7, 30));
        System.out.println("=== DATA MAKANAN BASAH ===");
        mb1.tampilInformasi();
    }
}
