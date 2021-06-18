package com.rnl.prc.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface  MyFunctionalInterface
{
    int perform (int a, int b);
}

@FunctionalInterface
interface  MyComparator<T>
{
    // 0 --e qul
    // -1 b >a
    // 1  a >b
    int compare (T a, T b);
}

class Employee {
    int id;
    int age;
    String name;

    public int getAge() {
        return  age;
    }

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;


    }

    public String toString() {
        return "id : "+id+" age: "+age+" name : "+name;
    }
}

public class BeginnersBookClass {

    public static void main(String[] args) {


        Employee e1 = new Employee(1,28, "rohan");
        Employee e2 = new Employee( 2, 30, "mil");
        Employee e3 = new Employee( 3, 21, "kilk");
        Employee e4 = new Employee( 3, 21, "");

        List<Employee> empLis = new ArrayList<>();
        empLis.add(e1);
        empLis.add(e2);
        empLis.add(e3);
        empLis.add(e4);

        Optional<Employee> empge= empLis.stream()
                .max((ex1, ex2) -> ex1.age > ex2.age ? 1 : -1);

        System.out.println("Max aged emp is :"+empge.orElse(null));

      //  empLis.stream().forEach(System.out::println);

        // empLis.stream().map(e -> e.getAge()).filter( t -> t >25).forEach(System.out::println);
// employeee with name length 3
     //   empLis.stream().filter(e-> e.name.length() == 3).forEach(System.out::println);

        empLis.stream()
                .filter(e -> !e.name.isEmpty())
                .forEach(System.out::println);

        empLis.stream()
                .map(ed1 -> ed1.getAge())
                .collect(Collectors.toList());

        Stream.iterate(100, e -> e+1)
                .filter(e -> e%5==0)
                .limit(10)
                .forEach(System.out::println);

        /**
        MyComparator<Employee> empComparator = (emp1, emp2) -> {
            return (emp1.age == emp2.age ? 0: (emp1.age > emp2.age) ? 1 : -1);
        };


       // Arrays.sort(empLis, );

        MyComparator<String> stringComparator = ( a,  b) ->  a.equals(b)?1:0;

        MyFunctionalInterface add = (a, b) -> a+b;
        MyFunctionalInterface sub = (a, b) -> a-b;
        MyFunctionalInterface mul = (a, b) -> a*b;


        System.out.println(add.perform(2,3));
        System.out.println(sub.perform(2,3));
        System.out.println(mul.perform(2,3));

        IntBinaryOperator bi = (a,b) -> a*b;
        System.out.println(bi.applyAsInt(2,3));
**/
        List<String> names =new ArrayList<>();
        names.add("rohan");
        names.add("imungali");
        names.add("chundali");
        names.add("riki");

        //count of string whose length is > 5


        names.stream().filter(e -> e.length() > 5).count();

       Optional<Integer> length= names.stream()
               .filter(r -> r.startsWith("m"))
               .map(e -> e.length())
               .reduce((s, p) ->s+p);

       System.out.println("lnght total is : "+length.orElse(0));

        /**

        names.stream().filter(e -> e.startsWith("r")).
                map(t -> t.toUpperCase()).
                forEach(System.out::println);

        System.out.println(stringComparator.compare("ROHAN" , "ADEp"));

       // names.stream().map(e-> e.toUpperCase()).forEach(System.out::println);

       // names.stream().forEach(System.out::println);

       // System.out::println("rohhaa");

**/
    }

}
