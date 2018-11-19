package com.foursquare.pilgrim;

import java.util.Locale;

public enum TriggerPlaceType {
    CATEGORY,
    PLACE,
    CHAIN,
    ALL;

    static TriggerPlaceType valueOfIgnoreCase(String str) {
        return valueOf(str != null ? str.toUpperCase(Locale.US) : null);
    }
}
