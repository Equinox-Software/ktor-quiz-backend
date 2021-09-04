package nyx.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import nyx.model.Question

fun Application.configureRouting() {

    routing {
        get("/") {
                call.respondText("Hello World!")
            }

        get("/questions") {
            call.respond(listOf(
                Question("What is 1+1?", listOf("2", "4", "a"), 0),
                Question("What is pizza?", listOf("Vegetable", "Italian", "Coke"), 1),
                        Question("What is 2+2?", listOf("2", "4", "a"), 1)
            ))
        }
    }
}
