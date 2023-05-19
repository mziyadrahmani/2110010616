package main;

import data.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("--------MARRISA HOLIDAY TOUR AND TRAVEL--------");
        System.out.println("-----------------------------------------------");
        registrasi();
    }

    static void registrasi() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("--------------------REGISTRASI-----------------");
        System.out.println("-----------------------------------------------");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("No Telp: ");
        String noTelp = input.nextLine();
        System.out.print("Tanggal Keberangkatan: ");
        String tglBerangkat = input.nextLine();
        System.out.println("-------------------BERHASIL !------------------");
        Pengunjung setObj = new Pengunjung(nama, email, noTelp, tglBerangkat);
        destinasi();
    }

    static void destinasi() {
        Scanner input = new Scanner(System.in);
        BookingWisata data = new BookingWisata();

        System.out.println("-----------------------------------------------");
        System.out.println("----------------DESTINASI WISATA---------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan Destinasi Wisata : ");
        String kota = input.nextLine();

        data.setDestinasiWisata(kota);

        String selectedKota = data.getDestinasiWisata();

        if (selectedKota.equals("Destinasi Tidak Ditemukan! harap ulangi")) {
            System.out.println(selectedKota);
            System.out.println("----------------------------------------");
            destinasi();
        } else {
            System.out.println("Destinasi Ditemukan ! Melanjutkan ke menu booking ...");
            paket(selectedKota, data);
        }
    }

    static void paket(String kota, BookingWisata bookdata) {
        Scanner input = new Scanner(System.in);
        PaketWisata data = new PaketWisata();
        data.setDestinasiWisata(kota, kota);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------INFORMASI PAKET---------------");
        System.out.println("-----------------------------------------------");
        System.out.println("No Paket: " + data.getNoPaket());
        System.out.println("Kota: " + kota);
        int harga = data.getHarga();
        System.out.println("Harga: " + harga);
        System.out.println("Pelayanan: " + data.getPelayanan());
        System.out.println("Status: " + data.getPaketStatus());
        System.out.println("Fasilitas: " + data.getFasilitas());
        System.out.println("-----------------------------------------------");
        System.out.print("KONFIRMASI ? (ketik 1 untuk ya, ketik 0 untuk batal)");
        int konfirmasi = input.nextInt();
        if (konfirmasi == 1) {
            booking(data, bookdata);
        } else {
            destinasi();
        }
    }

    static void booking(PaketWisata pakData, BookingWisata kota) {
        Scanner input = new Scanner(System.in);

        Pengunjung data = new Pengunjung();

        System.out.println("-----------------------------------------------");
        System.out.println("------------------BOOKING INFO-----------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Booking ID: #" + kota.getBookingId());
        System.out.println("Nama: #" + data.getNama());
        System.out.println("Email : #" + data.getEmail());
        System.out.println("NoTelp: #" + data.getNoTelp());
        System.out.println("Kota: " + kota.getDestinasiWisata());
        System.out.println("Harga: " + pakData.getHarga());
        System.out.println("Tgl Berangkat: #" + data.getDate());
        System.out.println("-----------------------------------------------");
        System.out.print("KONFIRMASI ? (ketik 1 untuk ya, ketik 0 untuk batal)");
        int konfirmasi = input.nextInt();
        if (konfirmasi == 1) {
            pembayaran(kota);
        } else {
            destinasi();
        }

    }

    static void pembayaran(BookingWisata paket) {
        Scanner input = new Scanner(System.in);
        Pembayaran data = new Pembayaran();
        System.out.println("-----------------------------------------------");
        System.out.println("-------------------PEMBAYARAN------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan No Rekening Anda : ");
        int rek = input.nextInt();
        System.out.println("Masukkan PIN Anda : ");
        int pin = input.nextInt();
        if (rek != 0 && pin != 0) {
            System.out.println("BERHASIL ! Melanjutkan ke konfirmasi pemesanan");
            System.out.println("BERHASIL ! Melanjutkan ke konfirmasi pemesanan");
            input.nextInt();

        } else {
            System.out.println("GAGAL !");
            input.nextInt();
            pembayaran(paket);
        }

    }
}
