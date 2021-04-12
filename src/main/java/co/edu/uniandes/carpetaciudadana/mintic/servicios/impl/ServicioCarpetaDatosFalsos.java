package co.edu.uniandes.carpetaciudadana.mintic.servicios.impl;

import co.edu.uniandes.carpetaciudadana.mintic.dto.*;
import co.edu.uniandes.carpetaciudadana.mintic.servicios.ServicioCarpetas;
import org.springframework.stereotype.Service;

@Service
public class ServicioCarpetaDatosFalsos implements ServicioCarpetas {

    @Override
    public RespuestaCentralizarUsuarioMinTicDto registrarCarpeta(PeticionCentralizarUsuarioMinTicDto peticionCentralizarUsuarioMinTic) {
        RespuestaCentralizarUsuarioMinTicDto respuestaCentralizarUsuarioMinTicDto = new RespuestaCentralizarUsuarioMinTicDto();

        CarpetaCiudadanaDto carpetaCiudadanaDto = new CarpetaCiudadanaDto();
        carpetaCiudadanaDto.setCodigoCarpeta("1324581");

        OperadorDto operadorDto = new OperadorDto();
        operadorDto.setNombre(peticionCentralizarUsuarioMinTic.getCentralizadorMinTic().getOperador().getNombre());
        operadorDto.setEsServicioPremium(peticionCentralizarUsuarioMinTic.getCentralizadorMinTic().getOperador().isEsServicioPremium());
        operadorDto.setCarpetaCiudadana(carpetaCiudadanaDto);

        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNumIdentificacion(peticionCentralizarUsuarioMinTic.getCentralizadorMinTic().getUsuario().getNumIdentificacion());
        usuarioDto.setTipoDocIdentidad(peticionCentralizarUsuarioMinTic.getCentralizadorMinTic().getUsuario().getTipoDocIdentidad());
        usuarioDto.setEstado("Enrolado");
        usuarioDto.setToken("b2b857e7-d70e-4ac8-a49a-e0cda029edaf");

        CentralizadorMinTic centralizadorMinTic = new CentralizadorMinTic();
        centralizadorMinTic.setOperador(operadorDto);
        centralizadorMinTic.setUsuario(usuarioDto);
        respuestaCentralizarUsuarioMinTicDto.setCentralizadorMinTic(centralizadorMinTic);

        return respuestaCentralizarUsuarioMinTicDto;
    }
}
