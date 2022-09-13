package com.alkemy.Grupo2;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Grupo 2!");

        Empleado x  = new Empleado("Perez", "Miguel", 35, 5500, 1.1, "1124kkgf", 65000);
        EmpleadoPorComision y = new EmpleadoPorComision("4187124ddkj", "Lopez", "Romina", 24, 1.4, 11000);
        EmpleadoAsalariado z = new EmpleadoAsalariado("Garcia", "Juan", 30, "45458ee", 15000, 47000);
        EmpleadoAsalariado zz = new EmpleadoAsalariado("Yupi", "Macarena", 42, "778545ddee", 9999, 58900.9);
        EmpleadoPorHoras a = new EmpleadoPorHoras("Carballo", "Agustin", 35, "874545adsf", 5400, 450, 30);
        EmpleadoPorHoras aa = new EmpleadoPorHoras("Ruiz", "Augusto", 20, "5855sewg", 15000, 450, 40);
        EmpleadoBaseMasComision b = new EmpleadoBaseMasComision(60000, 1.1, "Diaz", 54, "Roberto", "87sw", 9000);

        x.ingresos();
        x.presentarse();
        y.ingresos();
        y.presentarse();
        z.ingresos();
        z.presentarse();
        zz.ingresos();
        zz.presentarse();
        a.ingresos();
        a.presentarse();
        aa.ingresos();
        aa.presentarse();
        b.ingresos();
        b.presentarse();



    }
}
