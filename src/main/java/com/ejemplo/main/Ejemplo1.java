package com.ejemplo.main;


import com.ejemplo.beans.Vehiculo;
import com.ejemplo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Ejemplo1 {

    public static void main(String[] args) {
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setName("Coche 2");
//        System.out.println("El nombre del vehiculo sin spring es: " + vehiculo.getName());

        var contexto = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehiculo veh1 = contexto.getBean(Vehiculo.class);
        Vehiculo coche = new Vehiculo();
        coche.setName("Coche");
        Supplier<Vehiculo> cocheSupplier = () -> coche;

        Supplier<Vehiculo> motoSupplier = () -> {
            Vehiculo moto = new Vehiculo();
            moto.setName("Moto");
            return moto;
        };
    }
}
