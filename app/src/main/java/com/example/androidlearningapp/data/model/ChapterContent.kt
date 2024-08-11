
package com.example.androidlearningapp.data.model

data class ChapterContent(
    val id: Int,
    val chapterCode: String,
    val topic: String,
    val subTopic: String,
    val subSubTopic: String,
    val paragraphNumber: Int,
    val descriptiveContent: String,
    val imageList: String,
    val voiceGenerationJson: String
)
                                        