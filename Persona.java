package com.alkemy.Grupo2;

public abstract class Persona {
    //atributos
    protected String nombre;
    protected String apellido;
    protected int edad;

    //metodos
    public void presentarse(){
        System.out.println("Hola, soy " + this.nombre + " " + this.apellido + " y tengo " + this.edad + " años");
    }
    public boolean esMayorDeEdad(int edad){
        if (edad >= 18){
            System.out.println("mayor de edad");
            return true;
        }else {
            System.out.println("menor de edad");
            return false;
        }

    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
