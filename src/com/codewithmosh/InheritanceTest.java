package com.codewithmosh;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;


public class InheritanceTest implements Language{
    public static ArrayList<User> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        personas = new ArrayList<User>();

        personas.add(new Student(1, "Gaby", "Ilarreta", 32, "2"));
        personas.add(new Student(2, "Juan", "Reyes", 39, "2"));
        personas.add(new Student(3, "Maria", "Perez", 29, "2"));

        InheritanceTest menu = new InheritanceTest();
        menu.menuPrincipal();
    }

    @Override
    public void aprendizaje()
    {
        System.out.println("Enseñar BD");
    }

    public static void listarStudents() {
        System.out.println("+=====================+");
        System.out.println("| Listado de Student  |");
        System.out.println("+=====================+");
        int i = 0;
        for (User persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }

    public void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Alumnos                            |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuStudents();
                break;
            default:
                System.out.println("Salió del Programa");
        }
    }

    public static void menuStudents() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;
        InheritanceTest menu = new InheritanceTest();

        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarStudents();
                break;
            case "2":
                anadirStudent();
                break;
            default:
                menu.menuPrincipal();
        }
    }

    public static void anadirStudent() {
        String id;
        String name;
        String lastname;
        int semester;
        int age;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el ID: ");
            id = entradaTeclado.readLine();
            System.out.print("Nombre: ");
            name = entradaTeclado.readLine();
            System.out.print("Apellido");
            lastname = entradaTeclado.readLine();
            System.out.print("Semestre: ");
            semester = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Edad: ");
            age = Integer.parseInt(entradaTeclado.readLine());
            personas.add(new Student(semester, name, lastname, age, id));
            System.out.println("Registro OK!!");
            listarStudents();
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void getnameLenguage(String nameLenguage) {
        System.out.println("Programming Language: " + nameLenguage);
    }
}

