package com.realcurrents

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactorClientSampleApplication

fun main(args: Array<String>) {
    runApplication<ReactorClientSampleApplication>(*args)
}
