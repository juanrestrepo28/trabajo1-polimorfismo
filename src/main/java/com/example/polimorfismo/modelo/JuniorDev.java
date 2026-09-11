package com.example.polimorfismo.modelo;

/**
 * Clase concreta 2: JuniorDev.
 */
public class JuniorDev implements DesarrolladorSoftware {

    private String nombre;
    private String lenguajePrincipal;
    private Codigo codigoAsignado;

    public JuniorDev(String nombre, String lenguajePrincipal, Codigo codigoAsignado) {
        this.nombre = nombre;
        this.lenguajePrincipal = lenguajePrincipal;
        this.codigoAsignado = codigoAsignado;
    }

    @Override
    public String escribir(Codigo codigo) {
        return "\uD83E\uDDD1\u200D\uD83D\uDCBB " + nombre + " (Junior Dev, se especializa en " + lenguajePrincipal +
                ") escribió \"" + codigo.getNombreArchivo() + "\" en " + codigo.getLenguaje() + " (" +
                codigo.getLineasDeCodigo() + " líneas) para " + codigo.getFuncionalidad() + ".";
    }

    @Override
    public String depurar(Codigo codigo) {
        return "\uD83D\uDD0D " + nombre + " depuró \"" + codigo.getNombreArchivo() +
                "\" pidiendo apoyo a un compañero, revisando " + codigo.getLineasDeCodigo() +
                " líneas de " + codigo.getLenguaje() + ".";
    }

    @Override
    public String desplegar(Codigo codigo) {
        return "\uD83D\uDE80 " + nombre + " desplegó \"" + codigo.getNombreArchivo() +
                "\" siguiendo la guía del equipo para " + codigo.getFuncionalidad() + ".";
    }

    public String getNombre() {
        return nombre;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public Codigo getCodigoAsignado() {
        return codigoAsignado;
    }
}
