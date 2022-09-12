package com.alkemy.Grupo2;

public class EmpleadoAsalariado extends Empleado{

    //constructores
    public EmpleadoAsalariado(){

    }

    public EmpleadoAsalariado(String apellido, String nombre, int edad, String numeroSeguroSocial, double ventasBrutas, double salario){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.salario = salario;
    }

    //metodos
    @Override
    public double ingresos(){
        if(this.ventasBrutas >= 10000) {
            this.salario = this.salario * 1.2;
        }
        System.out.println(this.salario);
        return this.salario;
    }


}
