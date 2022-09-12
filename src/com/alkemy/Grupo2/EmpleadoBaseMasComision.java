package com.alkemy.Grupo2;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    //atributos
    private double basico;

    //constructor
    public EmpleadoBaseMasComision(){

    }

    public EmpleadoBaseMasComision(double basico, double tarifaComision, String apellido, int edad, String nombre, String numeroSeguroSocial, double ventasBrutas ){
        this.basico = basico;
        this.tarifaComision = tarifaComision;
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
    }

    //metodos
    @Override
    public double ingresos(){
        this.salario = this.basico + (this.tarifaComision * this.ventasBrutas);
        System.out.println(this.salario);
        return this.salario;
    }

    //getters y setters

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }
}
