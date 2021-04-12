package co.edu.uniandes.carpetaciudadana.mintic.controladores;

import co.edu.uniandes.carpetaciudadana.mintic.ServicioMintic;
import co.edu.uniandes.carpetaciudadana.mintic.dto.PeticionCentralizarUsuarioMinTicDto;
import co.edu.uniandes.carpetaciudadana.mintic.dto.RespuestaCentralizarUsuarioMinTicDto;
import co.edu.uniandes.carpetaciudadana.mintic.servicios.impl.ServicioCarpetaDatosFalsos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorPruebaCarpetas {

    @Autowired
    ServicioCarpetaDatosFalsos servicioCarpetaDatosFalsos;

    @PostMapping("/registrarCarpeta/{usuario}")
    public RespuestaCentralizarUsuarioMinTicDto registrarCarpetaPrueba(String usuario,
                                                                       @RequestBody PeticionCentralizarUsuarioMinTicDto body){
        return servicioCarpetaDatosFalsos.registrarCarpeta(body);

    }
}
