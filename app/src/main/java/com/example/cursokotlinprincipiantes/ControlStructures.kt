package com.example.cursokotlinprincipiantes

import android.util.Log
import java.lang.Exception
import java.lang.IndexOutOfBoundsException

class ControlStructures {

    fun ifConditionals() {
        val firstNumber = 10
        val secondNumber = 5
        val booleanValue = true

        if (firstNumber < secondNumber) {
            Log.d(TAG, "First case")
        } else if (booleanValue) {
            Log.d(TAG, "Second case")
            if (secondNumber == 5) {
                Log.d(TAG, "Second case, second option")
            }
        } else {
            Log.d(TAG, "Third case")
        }

        // Podemos asignar a una variable el resultado de un "if"
        val age: Int = if (!booleanValue) {
            17
        } else {
            19
        }
        Log.d(TAG, "The age is $age")
    }

    fun whenConditionals() {
//        val language = "Kotlin"
//        val language = "Javascript"
        val language = "Scala"

        when (language) {
            "Kotlin" -> {
                Log.d(TAG, "You choose Kotlin!")
                Log.d(TAG, "Good for you!")
            }
            "Java", "Scala" -> Log.d(TAG, "You choose Java... or Scala")
            "Python" -> Log.d(TAG, "You choose Python!")
            "Ruby" -> Log.d(TAG, "You choose Ruby!")
            else -> Log.d(TAG, "Default case: Javascript!")
        }

        val myNumber = 84
        when (myNumber) {
            0 -> Log.d(TAG, "You choose 0!")
            in 1..50 -> Log.d(TAG, "You choose 1 to 50!")
            51 -> Log.d(TAG, "You choose 51!")
            in 80..90 -> Log.d(TAG, "You are in the 80s!")
            91 -> Log.d(TAG, "You choose 91!")
        }
    }

    fun dataLists() {
        // Declaración de listas
        val stringList1 = listOf<String>()
        val stringList2: List<String> = listOf()
        val arrayList1 = arrayListOf<Int>()
        val arrayList2: List<Int> = arrayListOf()


        val initList = listOf("Alex", "Vane", "Neko", "Coco")
        val initArrayList = arrayListOf("Alex", "Vane", "Neko", "Coco")

        var item = initList[0]
        Log.d(TAG, "First list element:  $item")
        // Se puede usar el método "get" pero es más recomendable el operador de indexación
        item = initList[2]
        Log.d(TAG, "Third list element:  $item")

        // La principal diferencia entre los dos tipos es que un "list" es inmutable y un "arraylist" se puede modificar
        // Este caso da error
//        initList1[2] = "Nara"
        item = initArrayList[2]
        Log.d(TAG, "Third arraylist element:  $item")
        initArrayList[2] = "Nara"
        item = initArrayList[2]
        Log.d(TAG, "Third arraylist element:  $item")

        // Quitar elemento
        Log.d(TAG, "Start arraylist elements:  $initArrayList")
        initArrayList.remove("Alex")
        Log.d(TAG, "[Remove] Arraylist elements:  $initArrayList")
        initArrayList.removeAt(0)
        Log.d(TAG, "[Remove] Arraylist elements:  $initArrayList")

        // Añadir elemento
        initArrayList.add("Puppy")
        Log.d(TAG, "[Add] Arraylist elements:  $initArrayList")
        initArrayList.add(1, "Neko")
        Log.d(TAG, "[Add] Arraylist elements:  $initArrayList")

        // Ordenar elementos
        initArrayList.sort()
        Log.d(TAG, "[Sort] Arraylist elements:  $initArrayList")
        initArrayList.sortDescending()
        Log.d(TAG, "[Sort] Arraylist elements:  $initArrayList")
        val developersData = arrayListOf<DeveloperChallenge.DeveloperData>()
        developersData.sortBy { data -> data.name }
        developersData.sortByDescending { data -> data.age }

        // Añadir/Quitar elementos
        initArrayList.addAll(initList)
        Log.d(TAG, "[AddAll] Arraylist elements:  $initArrayList")
        initArrayList.clear()
        Log.d(TAG, "[RemoveAll] Arraylist elements:  $initArrayList")
    }

    fun forLoop() {
        val initArrayList = arrayListOf("Alex", "Vane", "Neko", "Coco")
        for (individual in initArrayList) {
            Log.d(TAG, "Arraylist element:  $individual")
        }
        for (position in 0..initArrayList.size) {
            val element = initArrayList[position]
            Log.d(TAG, "Arraylist element:  $element")
        }

        for (position in 0..10) {
            Log.d(TAG, position.toString())
        }
        // "until" no usa el último índice
        for (position in 0 until 10) {
            Log.d(TAG, position.toString())
        }
        // "step" indica las unidades de avance
        for (position in 0 until 10 step 3) {
            Log.d(TAG, position.toString())
        }
        // para descensos, se usa "downTo"
        for (position in 10 downTo 0 step 3) {
            Log.d(TAG, position.toString())
        }
    }

    fun whileLoop() {
        var startNumber = 1

        while (startNumber <= 10) {
            Log.d(TAG, startNumber.toString())
            startNumber++
        }
    }

    fun doWhileLoop() {
        var startNumber = 11

        // no se va a ejecutar
        while (startNumber <= 10) {
            Log.d(TAG, startNumber.toString())
            startNumber++
        }

        // se ejecutará siempre al menos 1 vez
        do {
            Log.d(TAG, startNumber.toString())
            startNumber++
        } while (startNumber <= 10)
    }

    fun errorControl() {
        val initArrayList = arrayListOf("Alex", "Vane", "Neko", "Coco")
        val demoString: String? = null
        try {
            for (position in 0..initArrayList.size) {
                Log.d(TAG, initArrayList[position])
            }
            Log.d(TAG, demoString!!)
        } catch (e: IndexOutOfBoundsException) {
            // Pasará por aquí
            Log.d(TAG, "IndexOutOfBoundsException", e)
        } catch (e: Exception) {
            Log.d(TAG, "Exception", e)
        }

        try {
            for (position in 0 until initArrayList.size) {
                Log.d(TAG, initArrayList[position])
            }
            Log.d(TAG, demoString!!)
        } catch (e: IndexOutOfBoundsException) {
            Log.d(TAG, "IndexOutOfBoundsException", e)
        } catch (e: Exception) {
            // Pasará por aquí
            Log.d(TAG, "Exception", e)
        } finally {
            Log.d(TAG, "Always executed")
        }
    }

    fun securityBot() {

    }

}