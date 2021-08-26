package com.example.cursokotlinprincipiantes

import android.util.Log

class Starting {

    // Comentario de 1 línea
    /*
    Comentario multilinea para escribir
    varias lineas de comentario
     */

    /*
    * Aquí vamos a ver variables y constantes
    */
    fun variablesAndConstants() {
        // 1. Nombre para representar el valor de un dato
        var myFirstVariable = "Hello World!"
        Log.d(TAG, myFirstVariable)
        myFirstVariable = "Bye World!"
        Log.d(TAG, myFirstVariable)

        val myFirstConstant = "Hello World!"
        Log.d(TAG, myFirstConstant)
    }

    fun dataTypes() {
        // Cadena de texto
        var string = "My String"

        // Valor numérico entero (int, short, long, byte)
        var number = 10
        var numberI: Int = 10
        var numberL: Long = 10 // Si pusiéramos 10L, el tipo sería redundante
        var numberS: Short = 10
        var numberB: Byte = 10

        // Valor numérico decimal (dobule, float)
        var decimal = 10.0
        var decimalD: Double = 10.0 // el tipo es redundante
        var decimalF: Float = 10.0F // el tipo es redunante

        // Valor verdadero o falso
        var booleanT = true
        var booleanF = false
        var boolean = booleanF && booleanT

        Log.d(TAG, string)
        Log.d(TAG, number.toString())
        Log.d(TAG, "My Int is $numberI")
        Log.d(TAG, "My Long is $numberL")
        Log.d(TAG, "My Short is $numberS")
        Log.d(TAG, "My Byte is $numberB")
        Log.d(TAG, "My Double is $decimalD")
        Log.d(TAG, "My Float is $decimalF")
        Log.d(TAG, "My Float is $decimalF")
        Log.d(TAG, "My Boolean is $booleanT")
        Log.d(TAG, "My Boolean is $booleanF")
    }

    fun operators() {
        val firstValue = 5
        val secondValue = 2
        val sameValue = 5
        val firstDecimalValue = 5.0
        val secondDecimalValue = 2.0
        Log.d(TAG, "The values are $firstValue and $secondValue")

        // Operadores aritméticos
        val suma = firstValue + secondValue
        Log.d(TAG, "Sum result is $suma")
        val sub = firstValue - secondValue
        Log.d(TAG, "Sub result is $sub")
        val mult = firstValue * secondValue
        Log.d(TAG, "Mult result is $mult")
        val divI = firstValue / secondValue
        Log.d(TAG, "Div integer result is $divI")
        val divD = firstDecimalValue / secondDecimalValue
        Log.d(TAG, "Div decimal result is $divD")
        val mod = firstValue % secondValue
        Log.d(TAG, "Mod result is $mod")

        // Operadores de comparación
        val notSame = firstValue == secondValue;
        Log.d(TAG, "Is the same? $notSame")
        val same = firstValue == sameValue;
        Log.d(TAG, "Is the same? $same")
        val different = firstValue != secondValue
        Log.d(TAG, "Is different? $different")
        val notDifferent = firstValue != sameValue
        Log.d(TAG, "Is different? $notDifferent")
        val bigger = firstValue > secondValue
        Log.d(TAG, "Is bigger? $bigger")
        val smaller = firstValue < secondValue
        Log.d(TAG, "Is smaller? $smaller")
        val biggerOrEqual = firstValue >= secondValue
        Log.d(TAG, "Is bigger or equal? $biggerOrEqual")
        val smallerOrEqual = firstValue < secondValue
        Log.d(TAG, "Is smaller or equal? $smallerOrEqual")

        // Operadores lógicos
        val name = "Alex"
        val age = 37
        val sameNameVal = name == "Alex"
        val lowerAgeVal = age < 25
        val conjunction = sameNameVal && lowerAgeVal
        Log.d(TAG, "Conjunction value is $conjunction")
        val disjunction = sameNameVal || lowerAgeVal
        Log.d(TAG, "Disjunction value is $disjunction")
        val negation = !disjunction
        Log.d(TAG, "Negation of disjunction value is $negation")
    }

    fun nullSafety() {
        // De esta manera, daría error porque un String no puede ser nulo
//        val nullString: String = null

        // Para dar opción a que pueda ser nulo, se usa "?"
        val nullNumber: Int? = null
        val nullString: String? = null
        Log.d(TAG, "The result is $nullString") // Está haciendo cast a String

        if (nullString != null) {
            Log.d(TAG, nullString)
        }
        nullString?.let {
            // Código que se ejecutará si la variable no es nula
            Log.d(TAG, "Variable no nula")
            Log.d(TAG, nullString)
        } ?: run {
            Log.d(TAG, "Variable nula")
            // Con la doble exclamacion se asume el riesgo de que el valor sea nulo
            Log.d(TAG, nullString!!)
        }
    }

    fun functions() {
        simpleFunction()
        functionWithParams("Alex", 37)
        functionWithParams("Vane", 38)
        var result = functionWithResult(1984)
        Log.d(TAG, "My age is $result")
        result = functionWithResultDirect(1984)
        Log.d(TAG, "My age is $result")
    }

    fun simpleFunction() {
        Log.d(TAG, "Alex")
        Log.d(TAG, 37.toString())
    }

    fun functionWithParams(name: String, age: Int) {
        Log.d(TAG, "My name is $name")
        Log.d(TAG, "My age is $age")
    }

    // El tipo de retorno no es obligatorio ponerlo, pero sí recomendable
//    fun functionWithResult(birthYear: Int) {
    fun functionWithResult(birthYear: Int): Int {
        val age = 2021 - birthYear
        Log.d(TAG, "My age is $age")
        return age
    }

    fun functionWithResultDirect(birthYear: Int): Int = 2021 - birthYear

    fun classes() {
        val alex = Person("Alex", 37)
        alex.introduction()
        val vane = Person("Vane", 38)
        vane.introduction()
        val rodrigoData = PersonData("Rodrigo", 26)
        val rodrigo = PersonBis(rodrigoData)
        rodrigo.introduction()
        val nullData = PersonData(null, 30)
        val nullPerson = PersonBis(nullData)
        nullPerson.introduction()
    }

    class Person(private val name: String, private val age: Int) {
        fun introduction() {
            Log.d(TAG, "My name is $name and my age is $age")
        }
    }

    class PersonBis(private val data: PersonData) {
        fun introduction() {
            data.name.let {
                Log.d(TAG, "My name is ${data.name} and my age is ${data.age}")
            }
        }
    }

    data class PersonData(
        val name: String?,
        val age: Int
    )

    fun interfaces() {
        val alexData = PersonData("Alex", 37)
        val alex = SecondPerson(alexData)

        alex.introduction()
        val birthYear = alex.calculateBirthYear(alexData.age)
        Log.d(TAG, "My year of birth is $birthYear")
    }

    class SecondPerson(private val data: PersonData) : IPerson {
        fun introduction() {
            data.name.let {
                Log.d(TAG, "My name is ${data.name} and my age is ${data.age}")
            }
        }

        override fun calculateBirthYear(age: Int) = 2021 - age
    }

    interface IPerson {

        fun calculateBirthYear(age: Int): Int

    }

}