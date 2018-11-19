package com.foursquare.api.types;

import com.foursquare.api.types.Venue.Location;

public interface LocationProducer extends FoursquareType {
    Location getLocation();
}
