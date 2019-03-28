package dev.sherin.weatherDemoLocation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class WeatherDemoLocationApplication() : ApplicationRunner {

    @Autowired
    lateinit var locationStore : LocationDAO
    override fun run(args: ApplicationArguments?) {
        val locations  = mapOf(
                "London" to Location("London", "London"),
                "NewDelhi" to Location("NewDelhi", "NewDelhi"),
                "Paris" to Location("Paris", "Paris"),
                "NewYork" to Location("NewYork", "NewYork")
        )

        locationStore.addLocations(locations)
    }
}

fun main(args: Array<String>) {

    runApplication<WeatherDemoLocationApplication>(*args)
}
