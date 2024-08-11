
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Badge
import io.ktor.client.*
import io.ktor.client.request.*

class BadgeRepository(private val client: HttpClient) {
    suspend fun getBadges(): List<Badge> {
        return client.get("/badges")
    }

    suspend fun createBadge(name: String, description: String): Badge {
        return client.post("/badges") {
            parameter("name", name)
            parameter("description", description)
        }
    }
}
                                        