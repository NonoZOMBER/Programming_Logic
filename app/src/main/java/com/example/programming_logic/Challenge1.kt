package com.example.programming_logic

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 *
 */

fun main() {
    println(anagrama("amor", "hola"))
}

fun anagrama(p1:String, p2:String) : Boolean {
    if (p1.lowercase() == p2.lowercase()) {
        return false
    } else return p1.lowercase().toCharArray().sortedArray()
        .contentEquals(p2.lowercase().toCharArray().sortedArray())

}