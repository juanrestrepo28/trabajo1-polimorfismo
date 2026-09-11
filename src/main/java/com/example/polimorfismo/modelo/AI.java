package com.example.polimorfismo.modelo;

/**
 * Clase concreta 3: AI.
 */
public class AI implements DesarrolladorSoftware {

    private String nombreModelo;
    private String version;
    private Codigo codigoAsignado;

    public AI(String nombreModelo, String version, Codigo codigoAsignado) {
        this.nombreModelo = nombreModelo;
        this.version = version;
        this.codigoAsignado = codigoAsignado;
    }

    @Override
    public String escribir(Codigo codigo) {
        return "\uD83E\uDD16 " + nombreModelo + " " + version + " generó automáticamente \"" +
                codigo.getNombreArchivo() + "\" en " + codigo.getLenguaje() + " (" +
                codigo.getLineasDeCodigo() + " líneas) para " + codigo.getFuncionalidad() + ".";
    }

    @Override
    public String depurar(Codigo codigo) {
        return "\uD83D\uDD0D " + nombreModelo + " " + version + " analizó \"" + codigo.getNombreArchivo() +
                "\" y corrigió errores en las " + codigo.getLineasDeCodigo() + " líneas de " +
                codigo.getLenguaje() + ".";
    }

    @Override
    public String desplegar(Codigo codigo) {
        return "\uD83D\uDE80 " + nombreModelo + " " + version + " desplegó automáticamente \"" +
                codigo.getNombreArchivo() + "\" habilitando " + codigo.getFuncionalidad() + " en producción.";
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public String getVersion() {
        return version;
    }

    public Codigo getCodigoAsignado() {
        return codigoAsignado;
    }
}
