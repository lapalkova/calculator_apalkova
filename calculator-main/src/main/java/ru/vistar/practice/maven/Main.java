package ru.vistar.practice.maven;

import ru.vistar.practice.maven.calc.Calculator;

public class Main
{
    public static void main( String[] args ) throws Exception {

        Calculator c = new Calculator();

        System.out.println(c.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        //System.out.println(c.add(1, 2));
    }
}
