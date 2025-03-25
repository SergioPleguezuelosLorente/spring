package com.ejemplo.main;


import com.ejemplo.beans.Vehiculo;
import com.ejemplo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejemplo1 {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setName("Coche 2");
        System.out.println("El nombre del vehiculo sin spring es: " + vehiculo.getName());

        var contexto = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehiculo veh = contexto.getBean(Vehiculo.class);
        System.out.println("El vehiculo con con spring es: " + veh.getName());
    }
}
