import java.util.ArrayList;
import java.util.List;

public class Kaart {
    private String mast;
    private String suurus;
    private int[] väärtused;

    public Kaart(String mast, String suurus, int[] väärtused) {
        this.mast = mast;
        this.suurus = suurus;
        this.väärtused = väärtused
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
