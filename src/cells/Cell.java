package cells;
import dates.ToDate;
import java.lang.String;

public class Cell {
    private String value;
    private Color color;

    public Cell() {
        value = null;
        color = Color.NOCOLOR;
    }

    public Cell(String value, Color c) {
        this.value = value;
        this.color = c;
    }
    public Cell(String value) {
        this.value = value;
        this.color = Color.NOCOLOR;
    }

    public void setValue(String v) {
        value = v;
    }

    public String getValue() {
        return value;
    }

    public void setColor(Color c) {
        this.color = c;

    }

    public Color getColor() {
        return this.color;
    }

    public int toInt() {
        return Integer.parseInt(this.value);
    }

    public double toDouble() {
        return  Double.parseDouble(this.value);
    }

    public void toDate(String str) {
        ToDate d = new ToDate();
        d.date(str);
    }

    public void reSrt() {
        this.value = null;
        this.color = Color.NOCOLOR;
    }

}
