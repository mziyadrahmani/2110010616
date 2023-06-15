package dataset;

import Booking.PaketWisata;
import java.util.ArrayList;

public class datasetPemesanan {

    private ArrayList<Integer> bookingId;
    private ArrayList<String> nama;
    private ArrayList<String> email;
    private ArrayList<String> telp;
    private ArrayList<String> kotaWisata;
    private ArrayList<Integer> harga;
    private ArrayList<String> tglBerangkat;

//    private static final PaketWisata[] paketWisata = {
//        new PaketWisata(1, "Bali", "Rp 5.000.000", "Hotel 4 bintang", 'A', "Gratis Makan"),
//        new PaketWisata(2, "Banjarmasin", "Rp 4.000.000", "Tour guide", 'A', "Termasuk Tiket Masuk")
//    };

    public datasetPemesanan() {
        bookingId = new ArrayList<>();
        nama = new ArrayList<>();
        email = new ArrayList<>();
        telp = new ArrayList<>();
        kotaWisata = new ArrayList<>();
        harga = new ArrayList<>();
        tglBerangkat = new ArrayList<>();
    }

    public void insertBookingId(int isi) {
        this.bookingId.add(isi);
    }

    public ArrayList<Integer> getBookingId() {
        return this.bookingId;
    }

    public void insertNama(String isi) {
        this.nama.add(isi);
    }

    public ArrayList<String> getNama() {
        return this.nama;
    }

    public void insertEmail(String isi) {
        this.email.add(isi);
    }

    public ArrayList<String> getEmail() {
        return this.email;
    }

    public void insertTelp(String isi) {
        this.telp.add(isi);
    }

    public ArrayList<String> getTelp() {
        return this.telp;
    }

    public void insertKotaWisata(String isi) {
        this.kotaWisata.add(isi);
    }

    public ArrayList<String> getKotaWisata() {
        return this.kotaWisata;
    }

    public void insertHarga(int isi) {
        this.harga.add(isi);
    }

    public ArrayList<Integer> getHarga() {
        return this.harga;
    }

    public void insertTglBerangkat(String isi) {
        this.tglBerangkat.add(isi);
    }

    public ArrayList<String> getTglBerangkat() {
        return this.tglBerangkat;
    }

//    public static PaketWisata[] getPaketWisata() {
//        return paketWisata;
//    }
//
//    public static void tampilPaket() {
//        System.out.println("Daftar Paket Wisata:");
//        for (PaketWisata paket : paketWisata) {
//            System.out.println(paket);
//        }
//    }

    public static void verifikasiOrders() {
        System.out.println("Daftar Pemesanan:");

    }

    public static int acakBookingId() {
        return (int) (Math.random() * 1000) + 1;
    }
}
