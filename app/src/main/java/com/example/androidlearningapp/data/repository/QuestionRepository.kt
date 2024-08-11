
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Question
import io.ktor.client.*
import io.ktor.client.request.*

class QuestionRepository(private val client: HttpClient) {
    suspend fun getQuestions(chapterContentId: Int): List<Question> {
        return client.get("/questions/$chapterContentId")
    }

    suspend fun createQuestion(question: Question): Question {
        return client.post("/questions") {
            body = question
        }
    }
}
                                        