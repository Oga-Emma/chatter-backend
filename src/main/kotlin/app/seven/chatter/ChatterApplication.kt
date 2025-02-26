package app.seven.chatter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatterApplication

fun main(args: Array<String>) {
	runApplication<ChatterApplication>(*args)
}
