package io.duhan.pleasefridge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.duhan.pleasefridge"])
class PleaseFridgeApplication

fun main(args: Array<String>) {
    runApplication<PleaseFridgeApplication>(*args)
}
