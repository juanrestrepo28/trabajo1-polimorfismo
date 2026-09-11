package com.example.polimorfismo.modelo;

/**
 * Interfaz DEFINITIVA (punto 2 del enunciado).
 *
 * En Java una interfaz SÍ puede heredar ("extends") de más de una interfaz al
 * mismo tiempo -- eso es la "herencia de interfaces". Esta interfaz hereda,
 * por herencia, los tres métodos definidos en Escritor, Depurador y
 * Desplegador. Por lo tanto, cualquier clase que implemente
 * DesarrolladorSoftware queda OBLIGADA a codificar los tres métodos:
 * escribir(Codigo), depurar(Codigo) y desplegar(Codigo).
 */
public interface DesarrolladorSoftware extends Escritor, Depurador, Desplegador {
}
