package co.edu.uniandes.carpetaciudadana.mintic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServicioMintic extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServicioMintic.class, args);
    }
}
