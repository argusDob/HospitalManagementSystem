
package javaapplication29;


public class Patient extends Person{
  private char gender;

    public Patient(char gender, String name, String surname, int age, PersonType type) {
        super(name, surname, age, type);
        this.gender = gender;
    }

    public Patient(char gender) {
        this.gender = gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Patient{" + "gender=" + gender + super.toString();
    }
    
   

}
