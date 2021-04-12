package co.edu.uniandes.carpetaciudadana.mintic.servicios;

import co.edu.uniandes.carpetaciudadana.mintic.dto.PeticionCentralizarUsuarioMinTicDto;
import co.edu.uniandes.carpetaciudadana.mintic.dto.RespuestaCentralizarUsuarioMinTicDto;

public interface ServicioCarpetas {
    RespuestaCentralizarUsuarioMinTicDto registrarCarpeta(PeticionCentralizarUsuarioMinTicDto peticionCentralizarUsuarioMinTic);
}
