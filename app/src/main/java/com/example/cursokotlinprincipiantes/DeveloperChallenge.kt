package com.example.cursokotlinprincipiantes

import android.util.Log

class DeveloperChallenge {

    interface IDeveloper {

        fun getDeveloperData(): DeveloperData

    }

    data class DeveloperData(
        val name: String?,
        val age: Int,
        val language: String?
    )

    class Developer : IDeveloper {

        override fun getDeveloperData(): DeveloperData  = DeveloperData(getName(), getAge(), getLanguage())

        private fun getName(): String = "Alex"

        private fun getAge(): Int = 37

        private fun getLanguage(): String = "Java"

    }

    fun challenge() {
        val developer = Developer()
        val developerData = developer.getDeveloperData()
        Log.d(
            TAG, "My name is ${developerData.name}, my age is ${developerData.age} " +
                    "and my development language is ${developerData.language}"
        )
    }

}