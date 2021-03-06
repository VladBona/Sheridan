/*
 * Vladyslav Banasko
 *  ID 991528801
 * hello
 */
package oopclass3;

/**
 *
 * @author Dell
 */
public class Student {
    
    private double bank;
    private int ddd;
    
    private boolean partTime;

    /**
     * Get the value of partTime
     *
     * @return the value of partTime
     */
    public boolean isPartTime() {
        return partTime;
    }

    /**
     * Set the value of partTime
     *
     * @param partTime new value of partTime
     */
    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    
   private String name;
   private int ID;
   private String surname;

    public Student(String name, int ID , String surname) {
        this.name = name;
        this.ID = ID;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", ID=" + ID + ", surname=" + surname + '}';
    }

   

    
   
  
          
    
}
