package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //TreeSet<Student> names = new TreeSet<Student>((a,b) ->a.getName().compareTo(b.getName()));
        TreeSet<Student> names = new TreeSet<Student>();
       names.add(new Student(5,"Astan","Serikov"));
       names.add(new Student(4,"Asel","Alybaeva"));
       names.add(new Student(3,"Asel","Alybaeva2"));
       names.add(new Student(2,"Adilet","Torobaev"));
       names.add(new Student(5,"Kira ","Test"));
       names.add(new Student(6,"Zenitsu","Zenli"));
       names.add(new Student(7,"Jordan","Michael"));
       names.add(new Student(8,"Aigerim","Nuralieva"));
       names.add(new Student(9,"Aigerim","Usubalieva"));


        for(Student st:names){
            System.out.println(st.id+" "+st.name + " "+st.surname);
        }












    }
}
