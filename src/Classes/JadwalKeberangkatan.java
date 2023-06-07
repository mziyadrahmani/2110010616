package Classes;

import java.util.Date;

public class JadwalKeberangkatan {
    private int idBooking;
    private String nama;
    private Date tglBerangkat;
    private char status;

    public JadwalKeberangkatan(int idBooking, String nama, Date tglBerangkat, char status) {
        this.idBooking = idBooking;
        this.nama = nama;
        this.tglBerangkat = tglBerangkat;
        this.status = status;
    }



    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglBerangkat() {
        return tglBerangkat;
    }

    public void setTglBerangkat(Date tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
