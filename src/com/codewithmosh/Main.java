package com.codewithmosh;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InheritanceTest language = new InheritanceTest();
        language.getnameLenguage("Java");
        User persona = new User();
        //InheritanceTest.menuPrincipal();
        System.out.println(persona.sueldo(20,86));
        System.out.println(persona.sueldo(67.23F,104.19F));
        System.out.println(persona.sueldo(35.72,98.15));

        persona.aprendizaje();
        language.aprendizaje();

    }
}
