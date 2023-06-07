package Booking;

import java.util.Scanner;

public class Pembayaran {
    private int idPembayaran;
    private boolean status;

    public Pembayaran(int idBooking) {
        this.idPembayaran = buatPembayaranId();
        this.status = false;
    }

    private int buatPembayaranId() {
        // Logic to generate payment ID
        return 1;
    }

    public void buatPembayaran() {
        System.out.println("Pembayaran berhasil!");
        System.out.println("ID Pembayaran: " + idPembayaran);
        status = true;
    }

    public void konfirmasiPembayaran() {
        if (status) {
            System.out.println("Konfirmasi pembayaran berhasil!");
            System.out.println("Terima kasih atas pembayaran Anda.");
        } else {
            System.out.println("Pembayaran belum dilakukan.");
        }
    }

    public void batalOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin membatalkan pesanan (y/n)? ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            System.out.println("Pesanan berhasil dibatalkan.");
        } else {
            System.out.println("Pesanan tetap berlaku.");
        }
    }


    public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

