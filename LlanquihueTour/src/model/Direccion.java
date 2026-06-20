package model;

/**
 * Clase que representa la dirección de una persona dentro
 * del sistema LlanquihueTour.
 *
 * Contiene información básica de ubicación como calle,
 * ciudad y región.
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    public Direccion() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param calle Nombre de la calle.
     * @param ciudad Ciudad de residencia.
     * @param region Región de residencia.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}