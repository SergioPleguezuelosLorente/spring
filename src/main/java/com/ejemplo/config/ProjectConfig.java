package com.ejemplo.config;

import com.ejemplo.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ejemplo.beans")
public class ProjectConfig {

//    @Primary
////    @Bean(name="coche1")
////    Vehiculo vehiculo1() {
////        var veh = new Vehiculo();
////        veh.setName("Coche 1");
////        return veh;
////    }


}
