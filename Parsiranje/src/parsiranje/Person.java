/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsiranje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Person extends Parsiranje
{
    String name;
    String lastname;
    LocalDate date;
    String hometown;
  

    public Person  (String name, String lastname, LocalDate date, String hometown) 
    {
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.hometown = hometown;
    }            

    @Override
    public String toString() 
    {   

 

        return ( "Name" + name + ",\n Last name" + lastname + ",\n Date of birth=" + date + ",\n Hometown=" + hometown );
    }   
}