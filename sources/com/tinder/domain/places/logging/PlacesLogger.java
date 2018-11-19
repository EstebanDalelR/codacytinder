package com.tinder.domain.places.logging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/tinder/domain/places/logging/PlacesLogger;", "", "sendPlaceNotification", "", "placeName", "", "probability", "", "visitType", "source", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface PlacesLogger {
    void sendPlaceNotification(@NotNull String str, double d, @NotNull String str2, @NotNull String str3);
}
