package com.alkemy.Grupo4.empresa;

public class EmpleadoPorHoras extends Empleado{
    private int hs_trabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String apellido, int edad, double ventasBrutas,
                            double tarifaComision, String numeroDeSeguroSocial, int hs_trabajadas, double valorHora) {
        super(nombre, apellido, edad, ventasBrutas, tarifaComision, numeroDeSeguroSocial);
        this.hs_trabajadas = hs_trabajadas;
        this.valorHora = valorHora;
    }

    public int getHs_trabajadas() {
        return hs_trabajadas;
    }

    public void setHs_trabajadas(int hs_trabajadas) {
        this.hs_trabajadas = hs_trabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double ingresos() {
        if(this.getVentasBrutas() > 10000){
            return ((this.hs_trabajadas * this.valorHora) * 1.2) + this.getVentasBrutas();
        }

        return (this.hs_trabajadas * this.valorHora) + this.getVentasBrutas();
    }

    @Override
    public String toString() {
        return super.toString() + " Categoria: EmpleadoPorHoras{" +
                "hs_trabajadas=" + hs_trabajadas +
                ", valorHora=" + valorHora +
                '}';
    }
}
