package com.example.nativus.ideaandrtask

data class User(
    val id: String,
    val isActive: Boolean,
    val balance: String,
    val picture: String,
    val age: Int,
    val eyeColor: String,
    val name: String,
    val gender: String,
    val company: String,
    val email: String,
    val phone: String,
    val address: String,
    val about: String,
    val registered: String,
    val tags: List<String>,
    val friends: List<Friend>,
    val favoriteFruit: String
)

data class Friend(
    val id: Int,
    val name: String
)