/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package models;

public class Project extends LesEenheid {
    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;
    private static final double MIN_CIJFER = 5.5;



    public Project(double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer,
                   String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    public Project(String naam, int ects, int studiejaar){
        super(naam, ects, studiejaar);
        this.procesCijfer = -1;
        this.productCijfer = -1;
        this.methodenEnTechniekenCijfer = -1;

    }

    public void setMethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public boolean isAfgerond(){
        if (this.procesCijfer >= MIN_CIJFER && this.productCijfer >= MIN_CIJFER &&
                this.methodenEnTechniekenCijfer >= MIN_CIJFER){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.productCijfer + ", " + this.procesCijfer + ", " +
                this.methodenEnTechniekenCijfer + ")";
    }
}
