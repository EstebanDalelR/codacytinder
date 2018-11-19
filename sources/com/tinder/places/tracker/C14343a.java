package com.tinder.places.tracker;

import com.foursquare.api.types.Category;
import com.foursquare.api.types.Venue;
import com.foursquare.api.types.Venue.Location;
import com.foursquare.api.types.Venue.VenueParent;
import com.foursquare.pilgrim.CurrentPlace;
import com.foursquare.pilgrim.RegionType;
import com.tinder.api.model.places.request.PlacesVisitRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011¨\u0006\u0012"}, d2 = {"toInt", "", "Lcom/foursquare/pilgrim/RegionType;", "toPlacesCategory", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Category;", "Lcom/foursquare/api/types/Category;", "toPlacesLocation", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$Location;", "Lcom/foursquare/api/types/Venue$Location;", "toPlacesVenue", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue;", "Lcom/foursquare/api/types/Venue;", "toPlacesVenueParent", "Lcom/tinder/api/model/places/request/PlacesVisitRequest$Venue$VenueParent;", "Lcom/foursquare/api/types/Venue$VenueParent;", "toPlacesVisitRequest", "Lcom/tinder/api/model/places/request/PlacesVisitRequest;", "Lcom/foursquare/pilgrim/CurrentPlace;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.places.tracker.a */
public final class C14343a {
    @NotNull
    /* renamed from: a */
    public static final PlacesVisitRequest m54647a(@NotNull CurrentPlace currentPlace) {
        C2668g.b(currentPlace, "$receiver");
        Venue venue = currentPlace.getVenue();
        List list = null;
        PlacesVisitRequest.Venue a = venue != null ? C14343a.m54646a(venue) : null;
        long arrival = currentPlace.getArrival();
        long departure = currentPlace.getDeparture();
        String pilgrimVisitId = currentPlace.getPilgrimVisitId();
        List otherPossibleVenues = currentPlace.getOtherPossibleVenues();
        if (otherPossibleVenues != null) {
            Iterable<Venue> iterable = otherPossibleVenues;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Venue venue2 : iterable) {
                C2668g.a(venue2, "it");
                arrayList.add(C14343a.m54646a(venue2));
            }
            list = (List) arrayList;
        }
        List list2 = list;
        RegionType type = currentPlace.getType();
        C2668g.a(type, "type");
        return new PlacesVisitRequest(a, arrival, departure, pilgrimVisitId, list2, currentPlace.isBackfill(), C14343a.m54642a(type));
    }

    /* renamed from: a */
    private static final int m54642a(@NotNull RegionType regionType) {
        switch (C14344b.f45509a[regionType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
            case 6:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final PlacesVisitRequest.Venue m54646a(@NotNull Venue venue) {
        List list;
        C2668g.b(venue, "$receiver");
        String id = venue.getId();
        C2668g.a(id, "id");
        String name = venue.getName();
        C2668g.a(name, "name");
        double probability = venue.getProbability();
        Location location = venue.getLocation();
        C2668g.a(location, "location");
        PlacesVisitRequest.Venue.Location a = C14343a.m54644a(location);
        ArrayList categories = venue.getCategories();
        C2668g.a(categories, "categories");
        Iterable<Category> iterable = categories;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Category category : iterable) {
            C2668g.a(category, "it");
            arrayList.add(C14343a.m54643a(category));
        }
        List list2 = (List) arrayList;
        venue = venue.getHierarchy();
        if (venue != null) {
            Iterable<VenueParent> iterable2 = (Iterable) venue;
            Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
            for (VenueParent venueParent : iterable2) {
                C2668g.a(venueParent, "it");
                arrayList2.add(C14343a.m54645a(venueParent));
            }
            list = (List) arrayList2;
        } else {
            list = null;
        }
        return new PlacesVisitRequest.Venue(id, name, probability, a, list2, list);
    }

    @NotNull
    /* renamed from: a */
    public static final PlacesVisitRequest.Venue.Location m54644a(@NotNull Location location) {
        C2668g.b(location, "$receiver");
        return new PlacesVisitRequest.Venue.Location(location.getLat(), location.getLng());
    }

    @NotNull
    /* renamed from: a */
    public static final PlacesVisitRequest.Venue.Category m54643a(@NotNull Category category) {
        C2668g.b(category, "$receiver");
        String id = category.getId();
        C2668g.a(id, "id");
        category = category.getName();
        C2668g.a(category, "name");
        return new PlacesVisitRequest.Venue.Category(id, category);
    }

    @NotNull
    /* renamed from: a */
    public static final PlacesVisitRequest.Venue.VenueParent m54645a(@NotNull VenueParent venueParent) {
        C2668g.b(venueParent, "$receiver");
        String id = venueParent.getId();
        C2668g.a(id, "id");
        String name = venueParent.getName();
        C2668g.a(name, "name");
        venueParent = venueParent.getCategories();
        C2668g.a(venueParent, "categories");
        Iterable<Category> iterable = (Iterable) venueParent;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Category category : iterable) {
            C2668g.a(category, "it");
            arrayList.add(C14343a.m54643a(category));
        }
        return new PlacesVisitRequest.Venue.VenueParent(id, name, (List) arrayList);
    }
}
