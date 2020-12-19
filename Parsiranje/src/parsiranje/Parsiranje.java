/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parsiranje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.lang.String;
import static java.lang.System.in;

public class Parsiranje 
{
    public static void main(String[] args) 
    {
        ArrayList <Person> lista = new ArrayList();


        String text  = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String [] array =text.split("[ ./]+");
        for(int i=0; i<array.length; i+=4)
        {
         String name = array[i];
         String lastname = array[i+1];
         String birthdate = array[i+2];
         String hometown = array[i+3];
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

 LocalDate date = LocalDate.parse(birthdate, formatter);

ArrayList personList = new ArrayList();
           personList.add(new Person(name , lastname, date, hometown));

  System.out.println(" Name: " + name + ",\n Lastname: " + lastname +",\n Date of birth : "+birthdate+",\n Hometown: "+hometown);
            
        }
 
        
   }   
}
    


