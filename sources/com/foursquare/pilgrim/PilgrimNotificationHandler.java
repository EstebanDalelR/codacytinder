package com.foursquare.pilgrim;

import android.content.Context;

public abstract class PilgrimNotificationHandler {
    public void handleBackfillNotification(Context context, PilgrimSdkBackfillNotification pilgrimSdkBackfillNotification) {
    }

    public void handleNearbyNotification(Context context, PilgrimSdkNearbyNotification pilgrimSdkNearbyNotification) {
    }

    public abstract void handlePlaceNotification(Context context, PilgrimSdkPlaceNotification pilgrimSdkPlaceNotification);
}
