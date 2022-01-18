package com.example.intent_kotlin_taks2

import java.io.Serializable

class User: Serializable{
    var name: String? = null
    var age: String? = null
    constructor(name: String, age: String) {
        this.name = name;
        this.age = age;
    }
    constructor()

    override fun toString(): String {
        return "$name : $age"
    }
}