package com.mrthiago

import com.mrthiago.plugins.configureMonitoring
import com.mrthiago.plugins.configureRouting
import com.mrthiago.plugins.configureSerialization
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

const val PORT = 8080
const val HOST = "0.0.0.0"
const val BASE_URL = "http://$HOST:$PORT"

fun main() {
    embeddedServer(Netty, port = PORT, host = HOST) {
        install(DefaultHeaders)
        configureRouting()
        configureSerialization()
        configureMonitoring()
    }.start(wait = true)
}