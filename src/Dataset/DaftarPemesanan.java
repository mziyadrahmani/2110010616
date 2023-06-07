package Dataset;

import Booking.PaketWisata;

public class DaftarPemesanan {
    private static final PaketWisata[] paketWisata = {
        new PaketWisata(1, "Bali", "Rp 5.000.000", "Hotel 4 bintang", 'A', "Free breakfast"),
        new PaketWisata(2, "Banjarmasin", "Rp 4.000.000", "Tour guide", 'A', "Entrance ticket included")
    };

    /**
     *
     * @return
     */
    public static PaketWisata[] getPaketWisata() {
        return paketWisata;
    }

    public static void tampilpaket() {
        System.out.println("Daftar Paket Wisata:");
        for (PaketWisata paket : paketWisata) {
            System.out.println(paket);
        }
    }

    public static void verifikasiOrders() {
        System.out.println("Daftar Pemesanan:");
        
    }
}
