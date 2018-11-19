package com.tinder.data.places.p329a;

import com.tinder.api.model.places.Place.Alternative;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.Location;
import com.tinder.domain.meta.model.Location.Builder;
import com.tinder.domain.places.model.Place;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\t"}, d2 = {"Lcom/tinder/data/places/adapter/PlaceDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/places/model/Place;", "Lcom/tinder/api/model/places/Place;", "()V", "fromApi", "r", "isValid", "", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.a.a */
public final class C10888a extends C2646o<Place, com.tinder.api.model.places.Place> {
    @NotNull
    /* renamed from: a */
    public Place m43425a(@NotNull com.tinder.api.model.places.Place place) {
        List list;
        C2668g.b(place, "r");
        Builder builder = Location.builder();
        Double lat = place.getLat();
        if (lat == null) {
            C2668g.a();
        }
        builder = builder.lat(lat.doubleValue());
        lat = place.getLon();
        if (lat == null) {
            C2668g.a();
        }
        Location build = builder.lon(lat.doubleValue()).build();
        List alternatives = place.getAlternatives();
        if (alternatives != null) {
            Iterable<Alternative> iterable = alternatives;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (Alternative alternative : iterable) {
                arrayList.add(new Place.Alternative(alternative.getId(), alternative.getName()));
            }
            list = (List) arrayList;
        } else {
            list = C19301m.a();
        }
        Long id = place.getId();
        if (id == null) {
            C2668g.a();
        }
        long longValue = id.longValue();
        String name = place.getName();
        if (name == null) {
            C2668g.a();
        }
        C2668g.a(build, "location");
        String icon = place.getIcon();
        if (icon == null) {
            icon = "unknown";
        }
        Long expirationTime = place.getExpirationTime();
        if (expirationTime == null) {
            C2668g.a();
        }
        DateTime dateTime = new DateTime(expirationTime.longValue());
        boolean corrected = Place.Companion.getCORRECTED() ^ 1;
        Boolean viewed = place.getViewed();
        if (viewed == null) {
            C2668g.a();
        }
        return new Place(longValue, name, build, icon, dateTime, viewed.booleanValue(), corrected, list, C19301m.a(), 0, 0, 1536, null);
    }
}
