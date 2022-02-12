package ws;

import java.util.Date;

public class Compte {
    Long code;
    double v;
    Date date;

    public Compte(Long code, double v, Date date) {
        this.code = code;
        this.v = v;
        this.date = date;
    }

    public Compte() {
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
