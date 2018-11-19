package com.tinder.places.p352c;

import com.tinder.domain.places.logging.PlacesLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/logging/PlacesNoopLogger;", "Lcom/tinder/domain/places/logging/PlacesLogger;", "()V", "sendPlaceNotification", "", "placeName", "", "probability", "", "visitType", "source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.c.a */
public final class C12297a implements PlacesLogger {
    public void sendPlaceNotification(@NotNull String str, double d, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "placeName");
        C2668g.b(str2, "visitType");
        C2668g.b(str3, "source");
    }
}
