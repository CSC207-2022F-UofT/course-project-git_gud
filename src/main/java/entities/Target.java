package entities;

import java.sql.Date;

/**
 * Target class with two instances, the target's date and the value(either weight, volume or ORM)
 * @author jhalaksaraogi
 */
public class Target {
    Date date;
    Float value;

    /**
     *
     * @param date the date for the target
     * Constructor for this class
     */
    public Target(Date date, Float value){
        this.date = date;
        this.value = value;
    }

    /**
     *
     * @param date target's date
     * Sets value of target's date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @param value target's value
     * Sets value of target's value
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     *
     * @return the target's date
     */
    public Date getDate() {
        return this.date;
    }
    /**
     *
     * @return target value
     */
    public Float getValue(){
        return this.value;
    }
}
