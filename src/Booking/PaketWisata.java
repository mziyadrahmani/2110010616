package Booking;

public class PaketWisata {
    private int noPaket;
    private String kotaWisata;
    private String harga;
    private String pelayanan;
    private char status;
    private String fasilitas;

    public PaketWisata(int noPaket, String kotaWisata, String harga, String pelayanan, char status, String fasilitas) {
        this.noPaket = noPaket;
        this.kotaWisata = kotaWisata;
        this.harga = harga;
        this.pelayanan = pelayanan;
        this.status = status;
        this.fasilitas = fasilitas;
    }



    public int getNoPaket() {
        return noPaket;
    }

    public void setNoPaket(int noPaket) {
        this.noPaket = noPaket;
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

    public String getPelayanan() {
        return pelayanan;
    }

    public void setPelayanan(String pelayanan) {
        this.pelayanan = pelayanan;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    /**
     *
     * @return
     */
    @Override   //Disuruh bikin oleh apache
    public String toString() {//return value dengan output string, override digunakan untuk menampilkan String yang sudah ada sekaligus teks 
        return "Paket Wisata " + noPaket + ": " +
                "Kota Wisata = " + kotaWisata +
                ", Harga = " + harga +
                ", Pelayanan = " + pelayanan +
                ", Status = " + status +
                ", Fasilitas = " + fasilitas;
    }
}
