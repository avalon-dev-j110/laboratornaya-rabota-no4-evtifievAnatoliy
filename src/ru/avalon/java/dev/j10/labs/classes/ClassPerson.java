/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.classes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.dev.j10.labs.Person;  

/**
 *
 * @author user
 */
public class ClassPerson implements Person 
{
    String Name;
    Date BirthDate;

    public ClassPerson(String Name, Date BirthDate) {
        this.Name = Name;
        this.BirthDate = BirthDate;
        
    }

    
    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Date getBirthDate() {
        return this.BirthDate;
    }

    @Override
    public String toString() {
         return getName() + ", " + BirthDate.getDay() + "." + BirthDate.getMonth() + "."  + BirthDate.getYear() + " года рождения";
    }
    
    /*

    public int compareTo(ClassPerson person) {
        return Name.compareTo(getName());
    }
*/
    public int compareTo(Person p) {
        if (this.getName().compareTo(p.getName()) != 0)
            return  this.getName().compareTo(p.getName());
        else
            return  -this.BirthDate.compareTo(p.getBirthDate());
    }

    
}
