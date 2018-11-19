package com.foursquare.internal.api.gson;

import com.foursquare.api.Add3rdPartyCheckinParams;
import com.foursquare.api.PilgrimSearchParams;
import com.foursquare.api.types.PilgrimStackTraceElement;
import com.foursquare.api.types.TrailPoint;
import com.foursquare.api.types.TrailPoint.Location;
import com.foursquare.pilgrim.WifiScanResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class AutoValueGson_AutoValueTypeAdapterFactory extends AutoValueTypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        typeToken = typeToken.getRawType();
        if (WifiScanResult.class.isAssignableFrom(typeToken)) {
            return WifiScanResult.typeAdapter(gson);
        }
        if (PilgrimSearchParams.class.isAssignableFrom(typeToken)) {
            return PilgrimSearchParams.typeAdapter(gson);
        }
        if (TrailPoint.class.isAssignableFrom(typeToken)) {
            return TrailPoint.typeAdapter(gson);
        }
        if (Location.class.isAssignableFrom(typeToken)) {
            return Location.typeAdapter(gson);
        }
        if (PilgrimStackTraceElement.class.isAssignableFrom(typeToken)) {
            return PilgrimStackTraceElement.typeAdapter(gson);
        }
        return Add3rdPartyCheckinParams.class.isAssignableFrom(typeToken) != null ? Add3rdPartyCheckinParams.typeAdapter(gson) : null;
    }
}
