
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Progress
import io.ktor.client.*
import io.ktor.client.request.*

class ProgressRepository(private val client: HttpClient) {
    suspend fun getProgress(userId: Int): List<Progress> {
        return client.get("/progress") {
            parameter("userId", userId)
        }
    }
}
                                        