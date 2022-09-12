package com.alkemy.Grupo4.empresa;

public abstract class Empleado extends Persona{
    private double ventasBrutas;
    private double 	tarifaComision;
    private String 	numeroDeSeguroSocial;

    public Empleado(){}

    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, double tarifaComision, String numeroDeSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
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

    public String getNumeroDeSeguroSocial() {
        return numeroDeSeguroSocial;
    }

    public void setNumeroDeSeguroSocial(String numeroDeSeguroSocial) {
        this.numeroDeSeguroSocial = numeroDeSeguroSocial;
    }

    public abstract double ingresos();

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +
                " ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                ", numeroDeSeguroSocial='" + numeroDeSeguroSocial + '\'' +
                '}';
    }
}
