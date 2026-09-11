package com.example.polimorfismo.modelo;

/**
 * Clase concreta 1: SeniorDev.
 * Implementa la interfaz definitiva DesarrolladorSoftware, por lo tanto debe
 * codificar los tres métodos heredados: escribir, depurar y desplegar.
 * El constructor recibe un objeto de la clase Codigo (tal como pide el punto 4).
 */
public class SeniorDev implements DesarrolladorSoftware {

    private String nombre;
    private int aniosExperiencia;
    private Codigo codigoAsignado;

    public SeniorDev(String nombre, int aniosExperiencia, Codigo codigoAsignado) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.codigoAsignado = codigoAsignado;
    }

    @Override
    public String escribir(Codigo codigo) {
        return "\uD83D\uDC68\u200D\uD83D\uDCBB " + nombre + " (Senior Dev, " + aniosExperiencia +
                " años de experiencia) escribió el archivo \"" + codigo.getNombreArchivo() +
                "\" en " + codigo.getLenguaje() + " con " + codigo.getLineasDeCodigo() +
                " líneas, implementando: " + codigo.getFuncionalidad() + ".";
    }

    @Override
    public String depurar(Codigo codigo) {
        return "\uD83D\uDD0D " + nombre + " depuró cuidadosamente \"" + codigo.getNombreArchivo() +
                "\", revisando las " + codigo.getLineasDeCodigo() + " líneas de " + codigo.getLenguaje() +
                " gracias a sus " + aniosExperiencia + " años de experiencia.";
    }

    @Override
    public String desplegar(Codigo codigo) {
        return "\uD83D\uDE80 " + nombre + " desplegó a producción \"" + codigo.getNombreArchivo() +
                "\" (" + codigo.getFuncionalidad() + "), asegurando la estabilidad del sistema.";
    }

    public String getNombre() {
        return nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public Codigo getCodigoAsignado() {
        return codigoAsignado;
    }
}
