public class Mängur {
    double rahakott;

    public double getRahakott() {
        return rahakott;
    }

    public void setRahakott(double rahakott) {
        this.rahakott = rahakott;
    }

    public void muudaRahakott(double raha){
        this.rahakott += raha;
    }

    public Mängur(double rahakott) {
        this.rahakott = rahakott;
    }

    public Mängur() {
        this.rahakott = 20;
    }
}
