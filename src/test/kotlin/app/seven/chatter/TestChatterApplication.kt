package app.seven.chatter

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<ChatterApplication>().with(TestcontainersConfiguration::class).run(*args)
}
