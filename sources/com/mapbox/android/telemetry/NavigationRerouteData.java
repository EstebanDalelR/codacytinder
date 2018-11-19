package com.mapbox.android.telemetry;

import com.google.gson.annotations.JsonAdapter;

public class NavigationRerouteData {
    @JsonAdapter(NewDataSerializer.class)
    private NavigationNewData navigationNewData;
    private int secondsSinceLastReroute;

    public NavigationRerouteData(NavigationNewData navigationNewData, int i) {
        this.navigationNewData = navigationNewData;
        this.secondsSinceLastReroute = i;
    }

    NavigationNewData getNavigationNewData() {
        return this.navigationNewData;
    }

    Integer getSecondsSinceLastReroute() {
        return Integer.valueOf(this.secondsSinceLastReroute);
    }
}
