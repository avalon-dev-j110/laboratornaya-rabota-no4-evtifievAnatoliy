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

    public ClassPerson(String Name, String BirthDate) {
        this.Name = Name;
        try {
            this.BirthDate = new SimpleDateFormat( "dd.MM.yyyy" ).parse(BirthDate);
        } catch (ParseException ex) {
            this.BirthDate = null;
        }

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
        DateFormat df = new SimpleDateFormat( "dd.MM.yyyy" );
        return getName() + ", " + df.format(BirthDate) + " года рождения";
    }
    
    /*

    public int compareTo(ClassPerson person) {
        return Name.compareTo(getName());
    }
*/
    @Override
    public int compareTo(Object t) {
        return Name.compareTo(getName());
    }
    
}
