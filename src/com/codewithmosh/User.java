package com.codewithmosh;

public class User {

    private int id;
    private String name;
    private int age;
    private String lastname;

   // Constructor vacio
   // private Student(){
    public User(){
    }

    //Constructor con Parametros
    public User(int id, String name, String lastname, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastname =  lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//Gagregar interfaces, herencia, sobre escritura. Modificadores de Acceso FINAL - STACTIC (ARBOL DE HERENCIA) SOBRE ESCRITURA y SOBRECARGA
    //
    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String address) {
        this.lastname = lastname;
    }

   //SobreCarga
    public int sueldo(int a,int b){
        return a + b;
    }

    public float sueldo(float a,float b) {
        return a + b;
    }

    public double sueldo(double a,double b){
        return a + b;
    }
    //Sobreescribe
    // Crear una clase que herede de User y que sobre escriba arendizaje. Static y una clase abstracta
    public final void aprendizaje()
    {
        System.out.println("Enseñar");
    }


    @Override
    public String toString(){
        return ("Student name is " + this.getName() + ", Lastname is: " + this.getLastname() + "and age is: " + this.getAge());
    }



    public static void main(String[] args){
        User john = new User();
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getLastname());
    }

}
