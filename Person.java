
package javaapplication29;


public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private  PersonType type;

    public Person() {
    }

    public Person(String name, String surname, int age, PersonType type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
         this.type = type;
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public PersonType getType() {
        return type;
    }

  
    @Override
   public String toString() {
        return "Patient{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
}
