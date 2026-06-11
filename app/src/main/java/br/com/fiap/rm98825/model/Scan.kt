package br.com.fiap.rm98825.model



data class Scan(
    val id: Int,
    val title: String,
    val description: String,
    val details: String,
    val roverName: String,
    val scanImage: Int,
    val roverImage: Int
)