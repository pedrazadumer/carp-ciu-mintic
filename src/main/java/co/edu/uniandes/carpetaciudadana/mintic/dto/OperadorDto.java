package co.edu.uniandes.carpetaciudadana.mintic.dto;

import lombok.Data;

@Data
public class OperadorDto {
    private String nombre;
    private boolean esServicioPremium;
    private CarpetaCiudadanaDto carpetaCiudadana;
}
