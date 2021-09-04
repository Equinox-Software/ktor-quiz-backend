package nyx

import io.ktor.server.engine.*
import io.ktor.server.cio.*
import nyx.plugins.*

fun main() {
    embeddedServer(CIO, /*port = 8080, host="localhost"*/port=System.getenv("PORT").toInt()) {
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }.start(wait = true)
}
