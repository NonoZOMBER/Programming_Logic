package com.example.programming_logic

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

fun main () {
    var anterior1 : Long = 0
    var anterior2 : Long = 1

    (1..50).forEach { _ ->
        println(anterior1)

        val fab = anterior1 + anterior2;

        anterior2 = anterior1
        anterior1 = fab
    }

}