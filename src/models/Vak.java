/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package models;

public class Vak extends LesEenheid {
    private double cijfer;
    private static final double MIN_CIJFER = 5.5;

    public Vak(double cijfer, String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.cijfer = cijfer;
    }
    public Vak(String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.cijfer = -1;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public boolean isAfgerond(){

        if (this.cijfer >= MIN_CIJFER){
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return super.toString() + " cijfer " + this.cijfer;
    }
    
}
