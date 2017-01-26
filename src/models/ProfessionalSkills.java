/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package models;

public class ProfessionalSkills extends LesEenheid {
    private boolean gehaald;

    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.gehaald = gehaald;
    }
    public ProfessionalSkills(String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.gehaald = false;

    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }

    public boolean isAfgerond(){
        if (gehaald = true){
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return super.toString() + this.gehaald;
    }
}
