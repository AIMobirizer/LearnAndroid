
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Language
import io.ktor.client.*
import io.ktor.client.request.*

class LanguageRepository(private val client: HttpClient) {
    suspend fun getLanguages(): List<Language> {
        return client.get("/languages")
    }

    suspend fun createLanguage(languageCode: String, languageName: String): Language {
        return client.post("/languages") {
            parameter("languageCode", languageCode)
            parameter("languageName", languageName)
        }
    }
}
                                        