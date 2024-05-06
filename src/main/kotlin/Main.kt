package ru.netology

fun main() {
    val likes = 21
    println(if (likes % 10 != 1 && likes % 100 != 11)"Понравилось $likes людям" else "Понравилось $likes человеку" )
}