package Booking;

import java.util.Date;
import java.util.Scanner;

public class BookingWisata {

    private int idBooking;
    private String nama;
    private String email;
    private String alamat;
    private String noTelp;
    private String kotaWisata;
    private String harga;
    private Date tglBerangkat;

    public BookingWisata() {
    }
//overload constructor
    public BookingWisata(int idBooking, String nama, String email, String noTelp, String kotaWisata, String harga, Date tglBerangkat) {
        this.idBooking = idBooking;
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
        this.kotaWisata = kotaWisata;
        this.harga = harga;
        this.tglBerangkat = tglBerangkat;
    }

    public void insertIdentitas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan identitas Anda:");

        System.out.print("Nama: ");
        this.nama = scanner.nextLine();

        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.print("Alamat: ");
        this.alamat = scanner.nextLine();
        
        System.out.print("Nomor Telepon: ");
        this.noTelp = scanner.nextLine();
    }

    public void registrasi() {
        System.out.println("Pemesanan berhasil!");
        System.out.println("ID Booking: " + idBooking);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + noTelp);
        System.out.println("Kota Wisata: " + kotaWisata);
        System.out.println("Harga: " + harga);
        System.out.println("Tanggal Berangkat: " + tglBerangkat);
        System.out.println("Terima kasih telah melakukan pemesanan.");
    }


    public int getIdBooking() {
        return idBooking;
    }
//overload method
    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getKotaWisata() {
        return kotaWisata;
    }

    public void setKotaWisata(String kotaWisata) {
        this.kotaWisata = kotaWisata;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Date getTglBerangkat() {
        return tglBerangkat;
    }

    public void setTglBerangkat(Date tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }
}
