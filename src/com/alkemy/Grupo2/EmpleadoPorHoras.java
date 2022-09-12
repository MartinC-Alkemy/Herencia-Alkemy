package com.alkemy.Grupo2;

public class EmpleadoPorHoras extends Empleado{
    //atributos
    protected double precioPorHora;
    protected int horasTrabajadas;

    //constructores
    public EmpleadoPorHoras(){

    }

    public EmpleadoPorHoras (String apellido, String nombre, int edad, String numeroSeguroSocial, double ventasBrutas, double precioPorHora, int horasTrabajadas){

        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    //metodos
    @Override
    public double ingresos(){
        this.salario = this.precioPorHora * this.horasTrabajadas;

        if(this.ventasBrutas >= 10000) {
            this.salario = this.salario * 1.2;
        }
        System.out.println(this.salario);
        return this.salario;
    }

    //getters y setters

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
