package com.example.cursokotlinprincipiantes

import android.util.Log

class SecurityBotChallenge {

    data class Persona(
        val name: String?,
        val age: Int,
        val hobbies: List<String>
    )

    fun securityBot(persona: Persona) {
        if("Alex" != persona.name) {
            Log.d(TAG, "Login error: you are ${persona.name}, not Alex. Get out!!")
        }  else {
            when(persona.age) {
                in 0..17 -> Log.d(TAG, "Login error: you are ${persona.age}, too young (under 18)")
                in 18..64 -> {
                    Log.d(TAG, "Login success: welcome ${persona.name}, you are ${persona.age} years old")
                    Log.d(TAG, "Your registered hobbies are")
                    for (hobby in persona.hobbies) {
                        Log.d(TAG, hobby)
                    }
                }
                else -> {
                    Log.d(TAG, "Login error: you are ${persona.age}, too old (over 65)")
                }
            }
        }
    }

}