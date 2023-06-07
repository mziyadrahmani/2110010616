package Main;

import Booking.BookingWisata;
import Booking.PaketWisata;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat booking id acak
        int bookingId = acakBookingId();
        System.out.println("-----------------------------------------------");
        System.out.println("--------MARRISA HOLIDAY TOUR AND TRAVEL--------");
        System.out.println("-----------------------------------------------");

        // membuat instansi dari paketwisata ( disini anggap kita memilih paket bali )
        PaketWisata paket1 = new PaketWisata(1, "Bali", "Rp. 5,000,000", "Pelayanan terbaik", 'A', "Hotel, Transportasi");

        // membuat instansi dari bookingwisata
        BookingWisata booking1 = new BookingWisata(bookingId, "", "", "", paket1.getKotaWisata(), paket1.getHarga(), new Date());

        // mengirim identitas untuk booking
        booking1.insertIdentitas();

        // meregistrasi
        booking1.registrasi();
    }

    private static int acakBookingId() {
        return (int) (Math.random() * 1000) + 1;
    }
}
