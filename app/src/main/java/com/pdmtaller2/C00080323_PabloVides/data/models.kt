package com.pdmtaller2.C00080323_PabloVides.data

import kotlinx.serialization.Serializable

@Serializable
data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)

@Serializable
data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val dishes: List<Dish>
)