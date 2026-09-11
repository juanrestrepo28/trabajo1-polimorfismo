package com.example.polimorfismo.modelo;

/**
 * Clase auxiliar (NO es una de las interfaces del ejercicio): solo empaqueta
 * los 3 mensajes generados por cada objeto para poder mostrarlos fácilmente
 * en la plantilla Thymeleaf.
 */
public class ResultadoDesarrollador {

    private String tipo;
    private String identificador;
    private String mensajeEscribir;
    private String mensajeDepurar;
    private String mensajeDesplegar;

    public ResultadoDesarrollador(String tipo, String identificador, String mensajeEscribir,
                                   String mensajeDepurar, String mensajeDesplegar) {
        this.tipo = tipo;
        this.identificador = identificador;
        this.mensajeEscribir = mensajeEscribir;
        this.mensajeDepurar = mensajeDepurar;
        this.mensajeDesplegar = mensajeDesplegar;
    }

    public String getTipo() {
        return tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getMensajeEscribir() {
        return mensajeEscribir;
    }

    public String getMensajeDepurar() {
        return mensajeDepurar;
    }

    public String getMensajeDesplegar() {
        return mensajeDesplegar;
    }
}
