
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.ChapterContent
import io.ktor.client.*
import io.ktor.client.request.*

class ChapterContentRepository(private val client: HttpClient) {
    suspend fun getChapterContents(chapterCode: String): List<ChapterContent> {
        return client.get("/chapter_contents/$chapterCode")
    }

    suspend fun createChapterContent(chapterContent: ChapterContent): ChapterContent {
        return client.post("/chapter_contents") {
            body = chapterContent
        }
    }
}
                                        