package com.rnl.prc.string;

import com.rnl.prc.array.ArrayCoding;

import java.util.*;
import java.util.function.Predicate;

public class Student {


    String name;
    String address;
    int id;
    int age;

    public Student(String name, String address, int id, int age) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }

    public String toString(){
        return name+" "+age+" "+id+" "+address;
    }

    public  static void main(String[] args){
        Student s1= new Student("rohan", "bb", 1, 22);
        Student s2= new Student("Adeep", "bb1", 2, 26);
        Student s3= new Student("Naveen", "bb4", 4, 17);
        Student s4= new Student("Mansa", "bb3", 3, 16);
        List<Student> lis= new ArrayList<Student >();
        lis.add(s1);
        lis.add(s2);
        lis.add(s3);
        lis.add(s4);

        Collections.addAll(lis, s4,s2,s2);
        List<String> dHld = new ArrayList<>();
        dHld.add("gbh");
        dHld.add("gld");
        Collections.addAll(dHld, "hold","when","the", "ice", "is");
        List<String> dHld1= new ArrayList<>(dHld.size());
        Collections.sort(dHld);
        System.out.println("dhld  "+dHld);

        // Arrays.sort(lis, (a,b) -> );

        Collections.copy(dHld1,dHld);

        System.out.println("dhld1  "+dHld1);

        Predicate<Student> sP = (a)->a.age>18;
        lis.stream().filter(a -> a.age > 18).forEach(System.out::println);

        Comparator<Student> so1= (a,b)->{ return a.id - b.id;};

        Collections.sort(lis,  so1);

        Iterator<Student> studentIterator = lis.iterator();

        while(studentIterator.hasNext()){
            System.out.println("ITR"+studentIterator.next());
           // lis.remove(s4);
        }

        ListIterator<Student> li = lis.listIterator();
        while(li.hasNext()){
            System.out.println("ITR2"+li.next());
           // lis.remove(s4);
        }
        System.out.println(lis);



        Collections.sort(lis, (a, b) -> a.name.compareTo(b.name));
        Collections.sort(lis, (a,b) -> a.age-b.age);

        System.out.println(lis);

        lis.sort((a,b)->a.age-b.age);

        Collections.sort(lis, Comparator.comparingInt(a -> a.age));

        System.out.println(lis);


    }



}
