package dev.sherin.weatherDemoLocation

interface LocationService {
    fun getAllLocations(): List<Location>
    fun findByLocationId(locationId: String): Location
    fun addLocations(l: Map<String, Location>)
}