package data;

public class PaketWisata {

    private int harga;
    private String pelayanan;
    private String fasilitas;
    private String paketStatus;
    private int noPaket;

    public void setDestinasiWisata(String targetWisata, String Destinasi) {
        switch (Destinasi) {
            default:
                break;
            case "Banjarmasin":
                this.noPaket = 1;
                //this.DestinasiWisata = "Banjarmasin";
                this.harga = 100000;
                this.pelayanan = "Tour Wisata";
                this.paketStatus = "TERSEDIA";
                this.fasilitas = "Hotel Bintang 1, Makan, Bus AC";

                break;
            case "Banjarbaru":
                this.noPaket = 2;
                //this.DestinasiWisata = "Lombok";
                this.harga = 120000;
                this.pelayanan = "Tour Wisata";
                this.paketStatus = "TERSEDIA";
                this.fasilitas = "Hotel Bintang 3, Makan, Tempat sewa motor";
                break;
            case "Bali":
                this.noPaket = 3;
                //this.DestinasiWisata = "Bali";
                this.harga = 2000000;
                this.pelayanan = "HoneyMoon";
                this.paketStatus = "TERSEDIA";
                this.fasilitas = "Hotel Bintang 3, Makan, Pemandangan Indah";
                break;
        }
    }

    public int getHarga() {
        return this.harga;
    }

    public int getNoPaket() {
        return this.noPaket;
    }

    public String getPelayanan() {
        return this.pelayanan;
    }

    public String getPaketStatus() {
        return this.paketStatus;
    }

    public String getFasilitas() {
        return this.fasilitas;
    }
}
