
package com.example.androidlearningapp.repository

import com.example.androidlearningapp.data.model.Certificate
import io.ktor.client.*
import io.ktor.client.request.*

class CertificateRepository(private val client: HttpClient) {
    suspend fun getCertificates(userId: Int): List<Certificate> {
        return client.get("/certificates") {
            parameter("userId", userId)
        }
    }

    suspend fun createCertificate(certificate: Certificate): Certificate {
        return client.post("/certificates") {
            body = certificate
        }
    }
}
                                        