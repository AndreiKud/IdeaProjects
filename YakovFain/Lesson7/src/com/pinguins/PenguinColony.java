package com.pinguins;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by Andrei on 013 13.01.17.
 */
public class PenguinColony implements Iterable<PenguinColony.Penguin>{

    static class Penguin {
        private String name;

        public Penguin(String name) {
            this.name = name;
        }

        public void Name() {
            System.out.println("His name is " + name);
        }
    }

    private Set<Penguin> set = new HashSet<>();

    public void AddPenguin(Penguin p) {
        set.add(p);
    }

    public Iterator<Penguin> getPenguins() {
        return set.iterator();
    }

    public Iterator<Penguin> iterator() {
        return getPenguins();
    }

    public static void main(String args[]) {
        PenguinColony colony = new PenguinColony();
        Penguin opus = new Penguin("Opus");
        Penguin chilly = new Penguin("Chilly Willy");
        Penguin mumble = new Penguin("Mumble");
        Penguin emperor = new Penguin("Emperor");
        colony.AddPenguin(opus);
        colony.AddPenguin(chilly);
        colony.AddPenguin(mumble);
        colony.AddPenguin(emperor);
        for (Penguin p : colony) {
            p.Name();
        }
        PreClass [] pc = new PreClass[3];
        pc[0] = new Class1();
        pc[1] = new Class2();
        pc[2] = new Class1();
        for (PreClass i : pc) {

        }

        Consumer<Penguin> style = (Penguin p) -> System.out.println(p.name);
        colony.forEach(style);
    }
}

class PreClass {

}

class Class1 extends PreClass implements I1, I2 {

    public void PrintI1() {
        System.out.println("Print from Class1");
    }

    public void Special() {
        System.out.println("Surprise Class1");
    }
}

class Class2 extends PreClass implements I1, I2 {

    public void PrintI1() {
        System.out.println("Print from Class2");
    }

    public void Special() {
        System.out.println("Surprise Class2");
    }
}

interface I1 {
    void PrintI1();
}

interface I2 {
    void Special();
}