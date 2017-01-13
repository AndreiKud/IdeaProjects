package com.company.compars;

import java.util.*;
import com.company.compars.Comparators.*;

public class Testing {
    public static void main() {
        List<Human> l = new ArrayList<>();
        l.add(new Human("Andrei",21));
        l.add(new Human("John",19));
        l.add(new Human("Petr",89));
        l.add(new Human("Anna",45));
        HashMap<Integer, String> m = new HashMap<>();
        l.forEach(h -> m.put(h.getAge(), h.getName()));

        ValueComparator myBvc = new ValueComparator(m);
        KeysComparator myBkc = new KeysComparator(m);
        TreeMap<Integer, String> smv = new TreeMap<Integer, String>(myBvc);
        TreeMap<Integer, String> smk = new TreeMap<Integer, String>(myBkc);
        TreeMap<Integer, String> sml = new TreeMap<Integer, String>(Collections.reverseOrder(
                (Integer i1, Integer i2) -> i1.compareTo(i2)));
        smv.putAll(m);
        sml.putAll(m);
        smk.putAll(m);
        System.out.println(m);
        System.out.println(smv);
        System.out.println(smk);
    }
}

class Human {
    private String name;
    private int age;

    Human(String  name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}