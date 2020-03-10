public class Kaart {
    private String mast;
    private String suurus;

    public Kaart(String mast, String suurus) {
        this.mast = mast;
        this.suurus = suurus;
    }

    public String getMast() {
        return mast;
    }

    public String getSuurus() {
        return suurus;
    }

    @Override
    public String toString() {
        return mast + "-" suurus;
    }
}
