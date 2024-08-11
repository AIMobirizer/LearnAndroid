
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.User
import io.ktor.client.*
import io.ktor.client.request.*

class UserRepository(private val client: HttpClient) {
    suspend fun login(email: String, password: String): User {
        return client.post("/login") {
            parameter("email", email)
            parameter("password", password)
        }
    }

    suspend fun register(email: String, password: String, experienceLevel: String): User {
        return client.post("/register") {
            parameter("email", email)
            parameter("password", password)
            parameter("experienceLevel", experienceLevel)
        }
    }
}
                                        