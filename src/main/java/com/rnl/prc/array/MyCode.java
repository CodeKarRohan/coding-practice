package com.rnl.prc.array;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class MyCode {
    public static void main (String[] args) {
        System.out.println("Hello Java");
        List<String> nameList = new ArrayList<>();
        nameList.add("rohan");
        nameList.add("Harish");
        nameList.stream().map(x->x.toUpperCase()).forEach(System.out::println);

        //2
        final List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

        List<Integer> res = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(res);
    }
}
