package dev.sherin.weatherDemoLocation

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

data class Location(val id: String,
                    val name: String?
)

var locations: MutableMap<String, Location> = HashMap()

interface LocationDao {
    fun getAllLocations(): List<Location>
    fun findByLocationId(locationId: String): Location
    fun addLocations(l: Map<String, Location>)
}

@Repository
@Qualifier("locationStore")
class LocationDaoImpl : LocationDao {

    override fun getAllLocations(): List<Location> =
            locations.values.toList()


    override fun findByLocationId(locationId: String): Location =
            locations.get(locationId) ?: Location("NoLocation", "NoLocation")


    override fun addLocations(l: Map<String, Location>) = locations.putAll(l)


}