package com.company.compars;

import javafx.collections.transformation.SortedList;
import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.Collator;
import java.util.*;

/**
 * Created by Andrei on 013 13.01.17.
 */
public class AnotherComp {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(1, 3, 2));
        System.out.println(l);
        Collections.sort(l, new MyComparators.CompareInt());
        System.out.println(l);
        Collections.sort(l, new MyComparators.CompareIntRev());
        System.out.println(l);

        Map<String, String> m = new HashMap<>();
        m.put("One", "One");
        m.put("Two", "Two");
        m.put("Three", "Three");
        m.put("Awwwwwbaa", "Aawab");
        System.out.println(m);
        SortedMap<String, String> sm = new TreeMap<>(new MyComparators.CompareMapIntStr(m));
        sm.putAll(m);
        System.out.println(sm);
        System.exit(0);
    }
}

class MyComparators {

    public static class CompareInt implements Comparator<Integer> {

        public int compare(Integer i1, Integer i2) {
            return i1.compareTo(i2);
        }
    }

    public static class CompareIntRev implements Comparator<Integer> {

        public int compare(Integer i1, Integer i2) {
            return i2.compareTo(i1);
        }
    }

    public static class CompareMapIntStr implements Comparator<String> {
        Map<String, String> m;

        public CompareMapIntStr(Map<String, String> m) {
            this.m = m;
        }

        public int compare(String i1, String i2) {
            return i1.compareTo(i2);
        }
    }
}