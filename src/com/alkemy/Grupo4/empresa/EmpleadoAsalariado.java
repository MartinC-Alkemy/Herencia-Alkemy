package com.alkemy.Grupo4.empresa;

public class EmpleadoAsalariado extends Empleado{
    private double salario;

    public EmpleadoAsalariado(String nombre, String apellido, int edad, double ventasBrutas,
                              double tarifaComision, String numeroDeSeguroSocial, double salario) {
        super(nombre, apellido, edad, ventasBrutas, tarifaComision, numeroDeSeguroSocial);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double ingresos() {
        if(this.getVentasBrutas() > 10000){
            return (this.salario * 1.2) + this.getVentasBrutas();
        }

        return this.salario + this.getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + " Categoria: EmpleadoAsalariado{" +
                "salario=" + salario +
                '}';
    }
}
