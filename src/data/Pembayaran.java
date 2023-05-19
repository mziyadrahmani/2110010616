package data;

public class Pembayaran {

    private int payId = 9931238;
    private Boolean status;

    public Pembayaran() {
    }

    public Pembayaran(int rek) {
        setPayId(rek);
    }

    public void setPayId(int rek) {
        this.payId += rek;
        this.status = true;
    }

    public int getPayId() {
        return this.payId;
    }

    public Boolean getStatus() {
        return this.status;
    }
}
