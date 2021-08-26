package com.example.cursokotlinprincipiantes

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


const val TAG = ":::TAG"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val starting = Starting()
//        starting.variablesAndConstants()
//        starting.dataTypes()
//        starting.operators()
//        starting.nullSafety()
//        starting.functions()
//        starting.classes()
//        starting.interfaces()

//        val developerChallenge = DeveloperChallenge()
//        developerChallenge.challenge()

//        val controlStructures = ControlStructures()
//        controlStructures.ifConditionals()
//        controlStructures.whenConditionals()
//        controlStructures.dataLists()
//        controlStructures.forLoop()
//        controlStructures.whileLoop()
//        controlStructures.doWhileLoop()
//        controlStructures.errorControl()

        val securityBotChallenge = SecurityBotChallenge()
        var persona = SecurityBotChallenge.Persona("Victor",37, arrayListOf("Videogames", "Movies", "Geek stuff", "MTB"))
        securityBotChallenge.securityBot(persona)
        Log.d(TAG, "---------------------------------------")
        persona = SecurityBotChallenge.Persona("Alex",16, arrayListOf("Videogames", "Streams", "Manga", "Disco"))
        securityBotChallenge.securityBot(persona)
        Log.d(TAG, "---------------------------------------")
        persona = SecurityBotChallenge.Persona("Alex",105, arrayListOf("Petanca", "Construction", "Naps"))
        securityBotChallenge.securityBot(persona)
        Log.d(TAG, "---------------------------------------")
        persona = SecurityBotChallenge.Persona("Alex",37, arrayListOf("Videogames", "Comics", "Movies", "Geek stuff"))
        securityBotChallenge.securityBot(persona)
    }

}