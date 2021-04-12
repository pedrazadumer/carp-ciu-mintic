package co.edu.uniandes.carpetaciudadana.mintic.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private String numIdentificacion;
    private String tipoDocIdentidad;
    private String estado;
    private String token;
    private String clave;
}
