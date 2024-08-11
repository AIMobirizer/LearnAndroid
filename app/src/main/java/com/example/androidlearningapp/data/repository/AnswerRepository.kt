
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Answer
import io.ktor.client.*
import io.ktor.client.request.*

class AnswerRepository(private val client: HttpClient) {
    suspend fun submitAnswers(answers: List<Answer>): List<Answer> {
        return client.post("/answers") {
            body = answers
        }
    }
}
                                        