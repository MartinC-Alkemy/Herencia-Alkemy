package com.alkemy.Grupo4;

import com.alkemy.Grupo4.empresa.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Grupo 4!");
        List<Empleado> empleados = new ArrayList<>();
        Empleado asalariado = new EmpleadoAsalariado("Erika", "Martinez",
                35, 85000, 20000, "123456", 100000);

        Empleado baseMasComision = new EmpleadoBaseMasComision("Carla", "Devincenzi",
                36, 70000, 20000, "123457", 100000);

        Empleado porComision = new EmpleadoPorComision("Bruce", "Wayne", 35, 320000,
                70000, "123458");

        Empleado porHoras = new EmpleadoPorHoras("Elon", "Musk", 50, 320000,
                70000, "123458", 155, 1300);

        empleados.add(asalariado);
        empleados.add(baseMasComision);
        empleados.add(porComision);
        empleados.add(porHoras);

        for(Empleado empleado: empleados){
            empleado.presentarse();
            System.out.println(empleado + "\nIngresos del mes: $" +
                    empleado.ingresos() + "\n------------------------\n");

        }

    }
}
