
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Notification
import io.ktor.client.*
import io.ktor.client.request.*

class NotificationRepository(private val client: HttpClient) {
    suspend fun getNotifications(userId: Int): List<Notification> {
        return client.get("/notifications") {
            parameter("userId", userId)
        }
    }

    suspend fun markNotificationAsRead(notificationId: Int): Notification {
        return client.post("/notifications/read") {
            parameter("notificationId", notificationId)
        }
    }
}
                                        