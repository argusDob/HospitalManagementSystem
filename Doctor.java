
package javaapplication29;


public class Doctor extends Person{
    private String speciality;

    public Doctor(String speciality, String name, String surname, int age, PersonType type) {
        super(name, surname, age, type);
        this.speciality = speciality;
    }

    public Doctor(String speciality) {
        this.speciality = speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

 
    @Override
    public String toString() {
        return "Doctor{" + "speciality=" + speciality +super.toString();
    }
    
    
}
