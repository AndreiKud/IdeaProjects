package com.company.compars;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Andrei on 013 13.01.17.
 */
public class Comparators {

    public static class ValueComparator implements Comparator {
        Map<Integer, String> base;

        public ValueComparator(Map<Integer, String> base) {
            this.base = base;
        }

        public int compare(Object a, Object b) {
            return base.get(a).compareTo(base.get(b));
        }
    }

    public static class KeysComparator implements Comparator {
        Map<Integer, String> base;

        public KeysComparator(Map<Integer, String> base) {
            this.base = base;
        }

        public int compare(Object a, Object b) {
            return ((Integer)a).compareTo((Integer)(b));
        }
    }
}
