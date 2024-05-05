package ru.netology

fun main() {
    val likes = 1
    println(if (likes % 10 == 1 || likes % 100 == 11) "Понравилось $likes человеку" else "Понравилось $likes людям")
}