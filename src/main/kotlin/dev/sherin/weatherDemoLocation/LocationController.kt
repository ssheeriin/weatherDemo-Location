package dev.sherin.weatherDemoLocation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class LocationController {

    @Autowired
    lateinit var locationService: LocationService

    @GetMapping("/location/{locationId}")
    fun getLocationById(@PathVariable locationId: String) = locationService.findByLocationId(locationId)
}