package com.pdmtaller2.C00080323_PabloVides.data

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)




data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val category: String,
    val dishes: List<Dish>
)