package com.mrthiago.plugins

import com.mrthiago.routing.foxData
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {

        // All routing relating to Fox sample
        foxData()

        // Default loading from base URL
        get("/") {
            call.respondText("Hello World! Sample Ktor Kotlin Backend. Try > /randomfox or /fox?foxId=3 or /foxes")
        }

        // Static plugin. Try to access `/index.html`
        static {
            resources("static")
        }
    }
}