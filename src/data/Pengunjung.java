package data;

public class Pengunjung {
    
    private String date;
    private String nama;
    private String email;
    private String noTelp;
    
    public Pengunjung(){}

    public Pengunjung(String nama, String email, String noTelp, String tglBerangkat) {//OVERLOAD CONSTRUCTOR
        setDataPengunjung(nama, email, noTelp, tglBerangkat);
    }
    private void setDataPengunjung(String a, String b, String c, String d){
        this.nama = a;
        this.email = b;
        this.noTelp = c;
        this.date = d;
    }
    public String getNama() {
        return this.nama;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public String getDate() {
        return this.date;
    }
}
