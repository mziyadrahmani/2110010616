package Booking;

import java.util.Scanner;

public class Pengunjung extends BookingWisata {
    private String nama;
    private String alamat;
    private String email;
    private String noTelp;

    public Pengunjung(String nama, String alamat, String email, String noTelp) {
        
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noTelp = noTelp;
    }
    
//    public void insertIdentitas() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan identitas Anda:");
//
//        System.out.print("Nama: ");
//        this.nama = scanner.nextLine();
//
//        System.out.print("Email: ");
//        this.email = scanner.nextLine();
//
//        System.out.print("Alamat: ");
//        this.alamat = scanner.nextLine();
//        
//        System.out.print("Nomor Telepon: ");
//        this.noTelp = scanner.nextLine();
//    }

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
        System.out.println("KONFIRMASI.");
        System.out.println("___________________________________");
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNoTelp() {
        return noTelp;
    }

    @Override
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    // Additional getter and setter for the 'alamat' field
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
