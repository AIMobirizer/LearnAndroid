
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Board
import io.ktor.client.*
import io.ktor.client.request.*

class BoardRepository(private val client: HttpClient) {
    suspend fun getBoards(): List<Board> {
        return client.get("/boards")
    }

    suspend fun createBoard(boardCode: String, boardName: String): Board {
        return client.post("/boards") {
            parameter("boardCode", boardCode)
            parameter("boardName", boardName)
        }
    }
}
                                        