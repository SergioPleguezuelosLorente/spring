package com.ejemplo.config;

import com.ejemplo.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehiculo vehiculo() {
        var veh = new Vehiculo();
        veh.setName("Coche 1");
        return veh;
    }

    @Bean
    String hola() {
        return "Hola buenas tardes";
    }

    @Bean
    Integer numero() {
        return 18;
     }
}
