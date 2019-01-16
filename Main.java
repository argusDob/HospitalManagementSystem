package javaapplication29;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author st
 */
public class Main {
    
    public static void main(String [] args){
        WestDepartment w = new WestDepartment();
        Patient p = new Patient('m', "alex","alexiou",26,PersonType.PATIENT);
        Doctor d = new Doctor("pathologos", "kostas", "dimitriou",40,PersonType.DOCTOR);
        w.addPatient(p);
        w.addDoctor(d);
        w.countDoctor();
       w.countPatient();
       
       w.save();
        System.out.println("hello");
        System.out.println("aek");
    }
    
}
