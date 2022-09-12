package com.alkemy.Grupo2;

public class Empleado extends  Persona{
    //atributos
    protected double ventasBrutas;
    protected double tarifaComision;
    protected String numeroSeguroSocial;
    protected double salario = 0;


    //constructores
    public Empleado(){

    }
    public Empleado(String apellido, String nombre, int edad, double ventasBrutas, double tarifaComision, String numeroSeguroSocial, double salario){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salario = salario;
    }
    //metodos
    public double ingresos(){
        System.out.println(this.salario);
        return this.salario;
    }
    /*
    public String toString(){

    } */

    //getters y setters

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
}
