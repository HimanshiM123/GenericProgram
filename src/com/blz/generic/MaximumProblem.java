package com.blz.generic;

public class MaximumProblem<T extends Comparable> {
    //Instance Variable
    T x, y, z, l, m;

    //constructor
    public MaximumProblem(T x, T y, T z, T l, T m) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.l = l;
        this.m = m;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to generic Program");

        new MaximumProblem<Integer>(3, 6, 7, 9, 2).print();
        new MaximumProblem<Float>(2.3f, 7.8f, 6.7f, 5.5f, 8.9f).print();
        new MaximumProblem<String>("Apple", "Peach", "Banana", "Mango", "Kiwi").print();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z, T l, T m) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        if (l.compareTo(max) > 0)
            max = l;
        if (m.compareTo(max) > 0)
            max = m;

        System.out.println("Maximum Number : " + max);
        return max;
    }

    public void print() {
        maximum(x, y, z, l, m);
    }
}
