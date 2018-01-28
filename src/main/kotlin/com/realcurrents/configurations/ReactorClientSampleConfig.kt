package com.realcurrents.configurations

import com.realcurrents.ReactorClientDownloader
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

@SpringBootApplication
@Configuration
@ComponentScan
@EnableWebFlux
class ReactorClientSampleConfig: WebFluxConfigurer {

    private val baseURL = "https://s3-us-west-1.amazonaws.com/real-currents/web-client-sample/"

    @Bean
    internal fun downloader (): ReactorClientDownloader {
        return ReactorClientDownloader(baseURL)
    }
}