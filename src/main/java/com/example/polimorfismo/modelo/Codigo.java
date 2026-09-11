package com.example.polimorfismo.modelo;

/**
 * Clase "Codigo": es la clase que reciben como argumento los tres métodos
 * escribir(Codigo), depurar(Codigo) y desplegar(Codigo).
 * Tiene sus propios atributos y métodos (getters/setters), y toda la
 * información que se muestra en los mensajes sale de aquí.
 */
public class Codigo {

    private String nombreArchivo;
    private String lenguaje;
    private int lineasDeCodigo;
    private String funcionalidad;

    public Codigo() {
    }

    public Codigo(String nombreArchivo, String lenguaje, int lineasDeCodigo, String funcionalidad) {
        this.nombreArchivo = nombreArchivo;
        this.lenguaje = lenguaje;
        this.lineasDeCodigo = lineasDeCodigo;
        this.funcionalidad = funcionalidad;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getLineasDeCodigo() {
        return lineasDeCodigo;
    }

    public void setLineasDeCodigo(int lineasDeCodigo) {
        this.lineasDeCodigo = lineasDeCodigo;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }
}
