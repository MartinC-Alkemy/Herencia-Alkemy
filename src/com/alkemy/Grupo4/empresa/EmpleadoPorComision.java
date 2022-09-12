package com.alkemy.Grupo4.empresa;

public class EmpleadoPorComision extends Empleado{

    public EmpleadoPorComision(String nombre, String apellido, int edad, double ventasBrutas,
                               double tarifaComision, String numeroDeSeguroSocial) {
        super(nombre, apellido, edad, ventasBrutas, tarifaComision, numeroDeSeguroSocial);
    }

    @Override
    public double ingresos() {
        return this.getTarifaComision() + this.getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + " Categoria: EmpleadoPorComision";
    }
}
