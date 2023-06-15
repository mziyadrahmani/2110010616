package Booking;

import java.util.Date;
import java.util.Scanner;

public class BookingWisata {

    int idBooking;
    private String nama;
    private String email;
    private String alamat;
    private String noTelp;
    String kotaWisata;
    String harga;
    Date tglBerangkat;

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
