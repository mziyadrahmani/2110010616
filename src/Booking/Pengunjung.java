package Booking;

public class Pengunjung extends BookingWisata {
    private String nama;
    private String alamat;
    private String email;
    private String noTelp;

    public Pengunjung(String nama, String alamat, String email, String noTelp) {
        super(); // Invoke the default constructor of the superclass
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noTelp = noTelp;
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
