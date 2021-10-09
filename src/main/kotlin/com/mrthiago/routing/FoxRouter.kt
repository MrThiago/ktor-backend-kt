package com.mrthiago.routing

import com.mrthiago.BASE_URL
import com.mrthiago.data.model.Fox
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private val foxList = listOf(
    Fox("1", "Carl", "A cute brown Fox", "$BASE_URL/fox/fox1.jpg"),
    Fox("2", "Emma", "Emma likes to eat apples", "$BASE_URL/fox/fox2.jpg"),
    Fox("3", "Florian", "Florian is always hungry", "$BASE_URL/fox/fox3.jpg"),
    Fox("4", "Federico", "Federico likes to climb mountains", "$BASE_URL/fox/fox4.jpg"),
)

fun Route.foxData() {
    // Get Random Item
    get("/randomfox") {
        call.respond(
            HttpStatusCode.OK,
            foxList.random()
        )
    }

    // Get Item per ID
    get("/fox") {
        val id = call.parameters["foxId"]
        val item = foxList.firstOrNull { it.id == id } // Sample call /fox?foxId=3

        if (item == null) {
            call.respond(
                HttpStatusCode.BadRequest,
                "{\"error\":\"Item does not exit\"}"
            )
        } else {
            call.respond(
                HttpStatusCode.OK,
                item
            )
        }
    }

    // Get all Items
    get("/foxes") {
        call.respond(
            HttpStatusCode.OK,
            foxList
        )
    }
}