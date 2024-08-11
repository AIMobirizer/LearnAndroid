
package com.example.androidlearningapp.data.model

data class Answer(
    val id: Int,
    val questionId: Int,
    val userId: Int,
    val answerText: String,
    val isCorrect: Boolean
)
                                        