package com.ejemplo.config;

import com.ejemplo.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehiculo vehiculo1() {
        var veh = new Vehiculo();
        veh.setName("Coche 1");
        return veh;
    }
    @Bean
    Vehiculo vehiculo2() {
        var veh = new Vehiculo();
        veh.setName("Coche 2");
        return veh;
    }
    @Bean
    Vehiculo vehiculo3() {
        var veh = new Vehiculo();
        veh.setName("Coche 3");
        return veh;
    }

}
