package Main;

import Booking.*;
import Dataset.*;
import forms.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // Buat booking id acak
//        int bookingId = acakBookingId();
//        System.out.println("-----------------------------------------------");
//        System.out.println("--------MARRISA HOLIDAY TOUR AND TRAVEL--------");
//        System.out.println("-----------------------------------------------");
//
//        // membuat instansi dari paketwisata ( disini anggap kita memilih paket bali )
//        PaketWisata paket1 = new PaketWisata(1, "Bali", "Rp. 5,000,000", "Pelayanan terbaik", 'A', "Hotel, Transportasi");
//
//        // membuat instansi dari bookingwisata
//        BookingWisata booking1 = new BookingWisata(bookingId, "", "", "", paket1.getKotaWisata(), paket1.getHarga(), new Date());
//
//        // mengirim identitas untuk booking 
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan identitas Anda:");
//
//        System.out.print("Nama: ");
//        String nama = scanner.nextLine();
//
//        System.out.print("Email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Alamat: ");
//        String alamat = scanner.nextLine();
//        
//        System.out.print("Nomor Telepon: ");
//        String noTelp = scanner.nextLine();
//        Pengunjung regis = new Pengunjung(nama,email,alamat,noTelp);
//
//        // meregistrasi
//        regis.registrasi();
//        
//        // Konfrimasi pemesanan   
//        
new mainmenu().setVisible(true);
    }

//    private static int acakBookingId() {
//        return (int) (Math.random() * 1000) + 1;
//    }
}
