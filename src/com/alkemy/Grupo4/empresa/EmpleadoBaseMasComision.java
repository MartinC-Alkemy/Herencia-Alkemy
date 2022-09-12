package com.alkemy.Grupo4.empresa;

public class EmpleadoBaseMasComision extends Empleado{
    private double base;

    public EmpleadoBaseMasComision(String nombre, String apellido, int edad, double ventasBrutas,
                                   double tarifaComision, String numeroDeSeguroSocial, double base) {
        super(nombre, apellido, edad, ventasBrutas, tarifaComision, numeroDeSeguroSocial);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double ingresos() {
        return this.base + this.getTarifaComision() + this.getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + " Categoria: EmpleadoBaseMasComision{" +
                "base=" + base +
                '}';
    }
}
