package data;

public class BookingWisata {
    
    private String DestinasiWisata;
    private int bookingId = 34;
    private int pembayaranId = 143;
    
    
    
    private String pembayaranStatus;
    

    //public BookingWisata() {}

    public void setDestinasiWisata(String targetWisata) {
        switch (targetWisata) {
            default:
                this.DestinasiWisata = "Destinasi Tidak Ditemukan! harap ulangi";
                break;
            case "banjarmasin":
                this.DestinasiWisata = "Banjarmasin";
                break;
            case "banjarbaru":
                this.DestinasiWisata = "Lombok";
                break;
            case "bali":
                this.DestinasiWisata = "Bali";
                break;
        }
    }
    
    


    public String getDestinasiWisata() {
        return this.DestinasiWisata;
    }
    public int getBookingId() {
        return this.bookingId;
    }

}
    
    

