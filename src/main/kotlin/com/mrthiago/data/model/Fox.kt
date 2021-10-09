package com.mrthiago.data.model

@kotlinx.serialization.Serializable
data class Fox(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String
)