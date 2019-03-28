package dev.sherin.weatherDemoLocation

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("locationService")
class LocationServiceImpl : LocationService {

    @Autowired
    lateinit var locationStore: LocationDAO

    override fun addLocations(l: Map<String, Location>) =
            locationStore.addLocations(l)


    override fun getAllLocations() = locationStore.getAllLocations()

    override fun findByLocationId(locationId: String) = locationStore.findByLocationId(locationId)
}