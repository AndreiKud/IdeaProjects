package com.company;

import com.company.compars.Testing;

import java.util.*;

public class BitsAndPieces {

    public static void main(String[] args) {

        new Testing().main();
        System.exit(0);
    }

    public static void Trifle() {
        //IntArrList();
        //SomeMaps();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add((new Random()).nextInt(10));
        }
        l.forEach(v -> System.out.print(v + " "));
        System.out.println();
        l.sort(Comparator.comparing(Integer::byteValue));
        l.forEach(v -> System.out.print(v + " "));

        Integer i = new Integer(5);
        System.out.println(i == new Integer(5));
        System.out.println(Objects.equals(i, new Integer(5)));
    }

    public static int CompareInts(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }

    public static void IntArrList() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add((new Scanner(System.in)).nextInt());
        arrlist.add((new Scanner(System.in)).nextInt());
        arrlist.add((new Scanner(System.in)).nextInt());
        arrlist.forEach(val -> System.out.print(val + " "));
    }

    public static void SomeMaps() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String s = (new Scanner(System.in)).nextLine();
            Integer n = (new Scanner(System.in)).nextInt();
            map.put(s,n);
        }
        map.forEach((k, v) -> System.out.print(k + " " + v + " | "));
    }

    private static void CompareGirls() {
        String gf = new String("Nastya");
        System.out.println("\ngf == \"Nastya\" is " + (gf == "Nastya"));
        System.out.println("compareTo is " + gf.compareTo("Nastya"));
        System.out.println("gf == " + gf);

        String gf1 = new String("Natasha");
        String gf2 = new String("Natasha");
        System.out.println("gf1 == gf2 is " + (gf1 == gf2));
    }
}
