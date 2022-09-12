package com.alkemy.Grupo2;

public class EmpleadoPorComision extends Empleado{

    //constructores
    public EmpleadoPorComision(){

    }

    public EmpleadoPorComision(String numeroSeguroSocial, String apellido, String nombre, int edad, double tarifaComision, double ventasBrutas){
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }

    //metodos
    @Override
    public double ingresos(){
            this.salario = this.tarifaComision * this.ventasBrutas;
            System.out.println(this.salario);
            return this.salario;
    }
}
