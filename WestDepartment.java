
package javaapplication29;

 
 
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class WestDepartment extends Department implements CallCenter{
    private ArrayList <Person> personList = new ArrayList <Person>();
    
    public void addPatient(Patient pat){
        personList.add(pat); 
    }
    
    public void addDoctor(Doctor doc){
        personList.add(doc);
    }
    
    public int countPatient(){
        int count = 0;
        for(Person person:personList){
           if (person.getType()==PersonType.PATIENT) {
                System.out.println(personList);
            }
             count++;   }       
               return count;       
    }
   public int countDoctor(){
       int count = 0;
       for (Person person:personList){
           if (person.getType()==PersonType.DOCTOR) {
               System.out.println(personList);
           }
               count++;}
           return count;
   }
   
   
  public void save (){
             try{
    File p =new File("Persons.txt");  
    PrintWriter x=new PrintWriter(p);
    for(Person per:personList){
      x.println(per);}
    
      x.close();
             }
   catch (Exception e){
                  System.out.println("Cannot open file");
  } 
      
  }
 
  public void load(){
      try{
      Scanner s=new Scanner(new File("Text.txt"));
       while(s.hasNextLine())
        System.out.println(s.nextLine());
       s.close();
      }
      catch(Exception e){ 
      System.out.println("err"); 
        
  }
  }
 
}